class Fruit {

    private final String name;

    Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Apple extends Fruit {

    Apple() {
        super("apple");
    }

}

class Orange extends Fruit {

    Orange() {
        super("orange");
    }

}

public class FruitExample {

    public static void main(String... args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        System.out.println(apple.getName());
        System.out.println(orange.getName());
    }

}