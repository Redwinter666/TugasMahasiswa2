package Car;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.displayCarDetails();
        
        System.out.println("\n--- Aksi Mobil ---");
        myCar.startEngine();
        myCar.throttle();
        myCar.brake();
        myCar.turnOnHeadLamp();
        myCar.turnOffHeadLamp();
    }
}
