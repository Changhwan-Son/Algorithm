import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str_N = in.readLine();
        int len_N = str_N.length();
        int N = Integer.parseInt(str_N);
        int answer = 0;

        // 최소값 N - (9 * len_N)
        for(int i = N - (9 * len_N) ; i < N ; i++) {
            if(calc(N, i)) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }

    static boolean calc (int N, int i) {
        boolean result = false;

        int sum = i;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }

        if(sum == N)
            result = true;

        return result;
    }
}