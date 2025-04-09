/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criatura2;

class Batalla {
    public static void simular(Criatura c1, Criatura c2) {
        System.out.println("\n¡Batalla entre " + c1.getNombre() + " y " + c2.getNombre() + " comienza!\n");

        int turno = 1;
        while (c1.estaViva() && c2.estaViva()) {
            System.out.println("Turno " + turno + ":");
            c1.atacar(c2);
            if (c2.estaViva()) {
                c2.atacar(c1);
            }
            System.out.println("-----------------------------------");
            turno++;
        }

        if (c1.estaViva()) {
            System.out.println("\n" + c1.getNombre() + " ha ganado la batalla!");
        } else {
            System.out.println("\n" + c2.getNombre() + " ha ganado la batalla!");
        }
    }
}


