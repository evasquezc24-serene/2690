package tarea;

public class Teclado {
    private String marca;
    private String color;
    private int tam; 

    public Teclado(String marca, String color, int tam) { 
        this.marca = marca;
        this.color = color;
        this.tam = tam;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getTam() { 
        return tam;
    }

    public void escribir(String texto) {
        System.out.println("escribiendo " + texto);
    }
}
