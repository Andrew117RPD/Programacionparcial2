/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criatura2;

public class JuegoBatalla {
    public static void main(String[] args) {
        Criatura dragon = new Dragon("Draco", 120, 30);
        Criatura mago = new Mago("Merlín", 100, 25);
        Criatura guerrero = new Guerrero("Arthur", 110, 28);

        Batalla.simular(dragon, mago);
        Batalla.simular(guerrero, dragon);
        Batalla.simular(mago, guerrero);
    }
}
