package _05_class._inheritance;

public class Animal {
    // 부모 클래스의 메소드

    private String breed;
    private int age;
    private String name;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    void makeSound() {
        System.out.println("동물은 소리를 낸다.");
    }
}
