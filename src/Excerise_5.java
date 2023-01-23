import java.util.Arrays;
// БИНАРНЫЙ ПОИСК
// сложность O(Log(n))
public class Excerise_5 {
    public static void main(String[] args) {
        int[] arr = {2, 4 , 1, 34, 123, 45, 87, 65, 41, 22}; // массив создали
        Arrays.sort(arr); // отсортировали массив
        System.out.println(Arrays.toString(arr)); // вывели массив
        System.out.println(binarySerch(arr, 4)); // вывод метода

    }
    public static int binarySerch (int[] arr, int key){ // метод с вводимыми параметрами

        int low = 0; // нижнее значение
        int hight = arr.length - 1; // верхнее значение

        while (low <= hight) { //прокрутка цикла от начала до конца
            int middle = low + (hight - low) / 2; // средняя - всегда такая формула в бинарном поиске
            if (key < arr[middle]) { // поисковое число меньше середины
                hight = middle - 1;  // тогда сдвигаем верхнюю границу влево от середины
            } else if (key > arr[middle]){ //поисковое число больше серидины
                low = middle +1; //сдвигаем серидину вправо
            } else {
                return middle; // нашли возращяем число
            }
        }
        return -1; // если нет такого числа в массиве возращаем -1
    }
}
