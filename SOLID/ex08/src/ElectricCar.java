public class ElectricCar implements IEngine, IRecharge {

    @Override
    public void startEngine(){ 
        System.out.println("Electric car engine started"); 
    }

    @Override
    public void recharge(int kWh){ 
        System.out.println("Recharged with " + kWh + " kWh"); 
    }
    
}
