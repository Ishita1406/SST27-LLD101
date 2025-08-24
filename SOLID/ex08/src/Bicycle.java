public class Bicycle implements Vehicle, IPedal {

    @Override
    public void accelerate(int speed){ 
        System.out.println("Bicycle accelerating to " + speed + " km/h"); 
    }

    @Override
    public void brake(){ 
        System.out.println("Bicycle braking"); 
    }

    @Override
    public void pedal(int effort){ 
        System.out.println("Pedal effort " + effort); 
    }
}