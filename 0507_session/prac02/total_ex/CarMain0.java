package prac02.total_ex;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3 k3 = new K3();
        driver.setCar(k3);
        driver.drive();

        Model3 model3 = new Model3();
        driver.setCar(model3);
        driver.drive();
    }
}
