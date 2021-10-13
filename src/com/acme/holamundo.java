package com.acme;

public class holamundo {

    public static void main(String[] args) {
        mensaje msg = new mensaje();
        String nombre = msg.solicitaDatos( "Escribe tu Nombre: " );
        String apellidos = msg.solicitaDatos("Escribe tus Apellidos:");
        Persona p1 =new Persona(nombre, apellidos);
        msg.Saludo(p1);

    }
}
