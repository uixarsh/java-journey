package org.learn.oops.interfaces;

public class Main {
    public static void main(String[] args) {
        /* Car car =  new Car();
        car.accelerate();
        car.brake();
        car.start();
        car.stop();

        Engine x = new Car();
        x.accelerate();
        x.stop(); */
        // x.brake();   // No brakes in engine.

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();

        Engine new_engine = new ElectricEngine();
        car.upgradeEngine(new_engine);
        car.start();
    }
}
