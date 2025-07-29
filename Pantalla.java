package tarea;

public class Pantalla {
    
    private class PantallaInterna {
        private boolean encendida;

        public PantallaInterna() { 
            this.encendida = false;
        }

        public void encender() {
            encendida = true;
            System.out.println("La pantalla se ha encendido.");
            System.out.println("¿Está encendida? " + estaEncendida());
        }

        public boolean estaEncendida() {
            return encendida;
        }
    }

    public void encender() {
        PantallaInterna pantallaInterna = new PantallaInterna();
        pantallaInterna.encender();
    }
}

