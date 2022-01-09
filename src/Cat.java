public class Cat {
    //Поля класса
    double weight;
    String name;
    int age;
    String color;

    //Методы класса
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        weight += 50;
    }

    Cat barsik = new Cat();
    Cat bigCat = new Cat(5500, "Murka", 2, "Black");
    Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
}

