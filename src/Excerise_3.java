import java.util.Arrays;
import java.util.Comparator;
// сложность O(n*log(n))
// ЖАДНЫЙ АЛГОРИТМ
public class Excerise_3 {
    public static void main(String[] args) {

        final Item item1 = new Item(4,20);
        final Item item2 = new Item(3,18);
        final Item item3 = new Item(2,14);
        final  Item[] items = {item1, item2, item3}; // рюкзак с предметами

        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed()  );
        // предметы в обратном порядке расставляем по их удельной ценности
        final int w = 7; // макс вес рюкзака
        int weightSoFar = 0; // аккумулируем текущий вес
        double valueSofar = 0; // аккумулируем ценность которую набрали
        int currentItems = 0; //  индекс текущего предмета (счестчик переменная)

                //мы перебираем предметы по обьектам какие есть, пока вес не будет достигнут максимума
        while (currentItems < items.length && weightSoFar != w) {

                //если накопленный вес + вес след. предмета меньше вместимого, то берем его целиком
            if (weightSoFar + items[currentItems].getWeight() < w){ //берем объект целиком
                 // прибовляем вес взятого объекта
                weightSoFar += items[currentItems].getWeight();
                  // прибовляем ценность взятого обьекта
                valueSofar += items[currentItems].getWelue();

              } else { //берем часть объекта
                //сколько веса можем взять / полный вес объекта * удельную ценность и добовляем к цеености
                // которую уже положили
                  valueSofar += ((w - weightSoFar) / (double) items[currentItems].getWeight() *
                          items[currentItems].getWelue());
                  weightSoFar = w; // рюкзак стал полный

              } currentItems++; // инкрементируем наш счетчик
          }
        System.out.println("Ценность = " + valueSofar); // выводим результат накопленной ценности


    }
}

class  Item {
    private final int weight;
    private final int value;

    public Item(int weight, int welue) {
        this.weight = weight;
        this.value = welue;
    }
    public double valuePerUnitOfWeight(){ //метод который позволяет вычеслить ценность за 1 ед. объекта
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getWelue() {
        return value;
    }

    @Override
    public String toString() {
        return "{weight: " + weight + ", welue: " + value + "}";
    }
}
