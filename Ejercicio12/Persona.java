package Taller12.Ejercicio12;

public class Persona implements Hablador, Trabajador {
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " está hablando.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
