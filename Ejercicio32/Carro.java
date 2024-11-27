package Taller12.Ejercicio32;

public class Carro implements Volador, Nadador {
    @Override
    public void volar() {
        // Lógica irrelevante
        System.out.println("El carro no puede volar.");
    }

    @Override
    public void nadar() {
        // Lógica irrelevante
        System.out.println("El carro no puede nadar.");
    }
}

