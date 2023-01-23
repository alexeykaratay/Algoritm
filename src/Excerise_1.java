
// Из набора цифр комбинируем самое большое
// сложность O(NlogN)

import java.util.Arrays;
import java.util.Collections;




public class Excerise_1 {

    public static void main(String[] args) {
        Integer[] max = {3, 1, 7, 9, 9, 5};
        Arrays.sort(max, Collections.reverseOrder());
        for (int i: max) {
            System.out.print(i);
        }









    }
}
