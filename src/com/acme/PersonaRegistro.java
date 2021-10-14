package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        //emmanuel esto es un comentari solo uno recuerda comentar tu codigo
        System.out.println("Esta instruccion es una prueba");
        return "%s, %s".formatted(apellidos, nombre);
    }
}
