package _05_class;

public class Rectangle {
    private int weight;
    private int height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    public int area(int weight, int height) {
        return weight * height;
    }

    @Override
    public String toString() {
        return  "가로 길이는: " + weight + "\n" +
                "세로 길이는: " + height + " \n" +
                "넓이는: " + area(weight,height) + "\n" +
                "--------------------------------------\n";
    }

}
