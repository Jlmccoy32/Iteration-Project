import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {


ArrayList<Fruit> fruits = new ArrayList<Fruit>();

Fruit banana = new Fruit("banana", 12, 1, true);
Fruit grape = new Fruit("grape", 22, 1, true);
Fruit watermelon = new Fruit("watermelon", 42, 1, true);
Fruit strawberry = new Fruit("strawberry", 52, 1, true);


fruits.add(banana);
fruits.add(grape);
fruits.add(watermelon);
fruits.add(strawberry);


System.out.println(fruits);

for (int i = 0; i < fruits.size(); i++) {
    System.out.println(fruits.get(i).fruitName);
  }
  

  if (fruits.size() >= 4) {
    System.out.println("This project works.");
  } else {
    System.out.println("This project doesn't work.");
  }

    }
}
