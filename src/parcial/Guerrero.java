/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author JAIME
 */
 public class Guerrero extends Criatura {

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dano = fuerza;
        System.out.println(nombre + " ataca con su espada a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        objetivo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        salud -= dano * 0.75; // Defensa media
        System.out.println(nombre + " bloquea parcialmente el ataque. Salud restante: " + salud);
    }
}