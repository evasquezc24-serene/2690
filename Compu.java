package tarea;

import tarea.Pantalla;

public class Compu {
    
    public static void main(String[] args) {
        
        Teclado miTeclado = new Teclado("hp", "rosa", 100);
        
        Pantalla miPantalla = new Pantalla();
    
        Pc miComputadoraBase = new Pc();
        Pc.Computadora miComputadora = miComputadoraBase.new Computadora(miTeclado, miPantalla);

        miComputadora.encender();
    }
}
