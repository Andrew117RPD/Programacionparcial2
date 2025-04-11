/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

public class Batalla {
    public static void simular(Criatura c1, Criatura c2) {
        System.out.println("¡Comienza la batalla entre " + c1.getNombre() + " y " + c2.getNombre() + "!");

        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            if (!c2.estaViva()) break;

            c2.atacar(c1);
        }

        System.out.println("La batalla ha terminado.");
        if (c1.estaViva()) {
            System.out.println(c1.getNombre() + " ha ganado.");
        } else {
            System.out.println(c2.getNombre() + " ha ganado.");
        }
    }
}
}


