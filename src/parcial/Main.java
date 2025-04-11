/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

public class Main {
    public static void main(String[] args) {
        Criatura dragon = new Dragon("Draco", 100, 20);
        Criatura mago = new Mago("Merlín", 80, 15);
        Criatura guerrero = new Guerrero("Conan", 90, 18);

        Batalla.simular(dragon, mago);
        System.out.println();
        Batalla.simular(guerrero, dragon);
        System.out.println();
        Batalla.simular(mago, guerrero);
    }
}