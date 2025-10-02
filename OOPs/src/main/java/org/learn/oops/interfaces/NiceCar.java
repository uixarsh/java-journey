package org.learn.oops.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar () {
        this.engine = new PowerEngine();
    }

    public NiceCar (Engine engine){
        this.engine = engine;
    }

    public void start () {
        this.engine.start();
    }
    
    public void stop () {
        this.engine.stop();
    }

    public void accelerate () {
        this.engine.accelerate();
    }

    public void startMusic() {
        this.player.play();
    }

    public void stopMusic() {
        this.player.pause();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }
}
