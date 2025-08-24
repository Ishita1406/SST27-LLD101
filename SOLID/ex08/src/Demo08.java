public class Demo08 {
    public static void main(String[] args) {
        
        IPedal p = new Bicycle();
        p.pedal(12); 

        Vehicle v = new Bicycle();
        v.accelerate(20);
        v.brake();

        IEngine e = new ElectricCar();
        e.startEngine();

        IRecharge r = new ElectricCar();
        r.recharge(50);

    }
}
