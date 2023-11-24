package _05_class._access_modifier._pack05;

public class CatEx {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.setAge(2);
        cat1.setBreed("Perisian");
        cat2.setAge(3);
        cat2.setBreed("British");
        cat3.setAge(4);
        cat3.setBreed("Russian Blue");

        System.out.printf("cat 1 age: %d, breed: %s\n", cat1.getAge(), cat1.getBreed());
        System.out.printf("cat 2 age: %d, breed: %s\n", cat2.getAge(), cat2.getBreed());
        System.out.printf("cat 3 age: %d, breed: %s\n", cat3.getAge(), cat3.getBreed());

    }
}
