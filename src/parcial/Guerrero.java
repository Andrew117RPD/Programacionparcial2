/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;


 public class Guerrero extends Criatura {
    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        System.out.println(nombre + " ataca con su espada a " + objetivo.getNombre() + " causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= (int)(daño * 0.75);  // Defiende un poco mejor
        System.out.println(nombre + " bloquea parte del daño. Salud restante: " + salud);
    }
}