package exam;

public class HomoSapien {
    protected double weight;
    protected double height;
    protected int age;

    public HomoSapien(double weight, double height, int age) {
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public void speak() {
        System.out.println("Speaking...");
    }

    public void run() {
        System.out.println("Running...");
    }
}
