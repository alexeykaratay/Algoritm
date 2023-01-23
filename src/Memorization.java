import java.util.Arrays;
//Меморизация исползование стека памяти для запоминания
public class Memorization {
    public static void main(String[] args) {
        int n = 100;
        long[] arr = new long[n+ 1];
        Arrays.fill(arr, -1);
        System.out.println();
        System.out.println(fibNaive(n,arr));

    }

    private static long fibNaive(int n, long[] arr) {
        if (arr[n] != -1)
            return arr[n];
        if (n <= 1)
            return n;

        long result = fibNaive(n - 1, arr) + fibNaive(n - 2, arr);
        arr[n] = result;
        return result;
    }

}
