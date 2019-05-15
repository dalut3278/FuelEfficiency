/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

import javax.swing.JOptionPane;

/**
 *
 * @author dalut3278
 */
public class FuelEfficiency {

    public static Vehicle[] arr = new Vehicle[4];
    public static double[] distances = new double[4];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = JOptionPane.showInputDialog("Amount of gas: ");
        Double gas = Double.parseDouble(input);
        init(gas);

    }

    public static void init(double gas) {
        arr[0] = new Truck(gas);
        arr[1] = new Car(gas);
        arr[2] = new HybridCar(gas);
        arr[3] = new Motorcycle(gas);

        distances[0] = arr[0].getDistance();
        distances[1] = arr[1].getDistance();
        distances[2] = arr[2].getDistance();
        distances[3] = arr[3].getDistance();

        String out = "On " + gas + "L of gas the vehicles can drive: ";
        out += "\nTruck: " + distances[0] + " Km";
        out += "\nCar: " + distances[1] + " Km";
        out += "\nHybrid Car: " + distances[2] + " Km";
        out += "\nMotorcycle: " + distances[3] + " Km";

        System.out.println(out);
    }

}
