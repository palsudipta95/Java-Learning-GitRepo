interface Engine {
    void startEngine();
}

interface Wheels {
    void rotateWheels();
}

class Car implements Wheels, Engine {
    public void startEngine() {
        System.out.println("Car Engine is starting");
    }

    public void rotateWheels() {
        System.out.println("Car Wheels are rotating");
    }
}

public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.rotateWheels();
    }
}
