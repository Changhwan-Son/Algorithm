import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(in.readLine());
        int[] cards = new int[N];
        for (int i = 0 ; i < N ; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < N - 2; i++) {
            for(int j = i + 1 ; j < N - 1 ; j++) {
                for (int k = j + 1 ; k < N ; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if(max < sum && sum <= M)
                        max = sum;
                }
            }
        }

        System.out.println(max);
    }
}