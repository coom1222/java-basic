package polymorphism.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car); // 이 시점에 운전자는 K3Car를 가진다.
        driver.drive();

        // Model3Car 추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
