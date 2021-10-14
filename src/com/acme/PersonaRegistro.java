package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        System.out.println("Esta instruccion es una prueba");
        return "%s, %s".formatted(apellidos, nombre);
    }
}
