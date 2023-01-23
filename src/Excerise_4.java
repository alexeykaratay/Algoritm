import java.io.Serializable;
import java.util.Scanner;
// ЛИНЕЙНЫЙ ПОИСК
// сложность O(n)
public class Excerise_4 {
    public static void main(String[] args) {
        System.out.println("Enter a number from the array:"); // выводим текст
        Scanner scanner = new Scanner(System.in); // создали объект сканер для ввода

        int element = scanner.nextInt(); // сканер считывает числа int
        int[] mass = {2, 3, 4, 12, 1000, 34}; // создали произвольный массив
        System.out.println(Po.serchElement(mass, element)); // выводим на экран метод
    }
}
    class Po{ // класс для метода


        public static Serializable serchElement(int[] mass, int element) { //статический метод
        for (int j : mass) { //крутим цикл по всему массиву
            if (j == element) { // пока загаданное число не достигнет нужного нам элемента
                return element + " -this number exists"; // тогда это возращаем
            }
        }
        return element + " -number missing"; // если нет элемента вернется это

    }


}

