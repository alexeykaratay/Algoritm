// Поиск числа Фибаначчи
// Сложность O(n)
public class Fibanacci {
    public static void main(String[] args) {
        System.out.println(fibEffectiv(100));

    }
        // медленный, наивный, не верный n=100 ,будет вычислять 50 000 лет
        private static long fibNaive(int n) {
            if(n<=1)
                return n;
            return fibNaive(n-1) + fibNaive(n-2);
            }
            // верный, выполнение 1 сек
         private  static long fibEffectiv(int n){
        long[] arr =new long[n+1]; //Создаем массив из чисел Фибаначчи
        arr[0] = 0; // Первое число всегда 0
        arr[1] =1;  // второе число всегда 1
        for (int i =2; i<= n; i++ ){  // запускаем цикл по массиву с 3 элемента, так как 1 и 2 уже записаны
            arr[i] = arr[i-1] + arr[i-2]; //формула числа Фибаначчи
             } return arr[n];            // возращаем то самое число Фибаначчи
         }

}

