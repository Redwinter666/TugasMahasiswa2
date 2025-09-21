package Car;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Car implements Vehicle {
    String color;
    String noPlate;
    int width;
    int height;
    String brand;
    
    public Car(){
        this.color = "Merah";
        this.noPlate = "A 6585 LB";
        this.width = 180;
        this.height = 150;
        this.brand = "Toyota";
    }
    
    @Override
    public void startEngine(){
        System.out.println("Mesin menyala.");
    }
    
    @Override
    public void throttle(){
        System.out.println("Mobil sedang digas.");
    }
    
    @Override
    public void brake(){
        System.out.println("Mobil sedang mengerem.");
    }
    
    @Override
    public void turnOnHeadLamp(){
       System.out.println("Lampu depan menyala.");
    }
    
    @Override
    public void turnOffHeadLamp(){
        System.out.println("Lampu depan mati.");
    }
    
    public void displayCarDetails(){
        System.out.println("--- Detail Mobil ---");
        System.out.println("Warna: " + color);
        System.out.println("Plat no.: " + noPlate);
        System.out.println("Lebar: " + width);
        System.out.println("Tinggi: " + height);
        System.out.println("Merek: " + brand);
    }
}
