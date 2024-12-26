package polymorphism.car0;

public class Driver {

    private K3Car k3Car;    // 지금은 인스턴스 생성하지 않음, 생성하지 않았으므로 기본이 null값.
    // 즉, 운전자만 생성하면 아직 자동차를 가지고 있지 않음
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car; // 외부에서 K3Car를 셋팅해줄 수 있음
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if(k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if(model3Car != null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
