package prac02.total_ex;

public class Model3 implements Car{
    @Override
    public void startEngine() {
        System.out.println("Model3.startEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3.pressAccelerator");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3.offEngine");
    }
}
