package tarea;

import java.util.Scanner;

public class Pc {
  
    public class Computadora {
        private Teclado teclado; 
        private Pantalla pantalla;
        Scanner s = new Scanner(System.in);
        
        public Computadora(Teclado teclado, Pantalla pantalla) {
            this.teclado = teclado;
            this.pantalla = pantalla;
        }

        public void encender() {
            System.out.println("presiona 0 para encender la computadora");
            String tecla = s.nextLine();

            teclado.escribir("intentando encender la computadora...");
            if (tecla.equals("on")) {
                pantalla.encender();
                System.out.println("La computadora se ha encendido.");   
            } else {
                System.out.println("Pantalla no encendida, presiona f1 para encenderla.");
            }
        }
    }
}
