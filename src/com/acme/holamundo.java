package com.acme;

public class holamundo {

    public static void main(String[] args) {
        mensaje msg = new mensaje();
        String nombre = msg.solicitaDatos( "Escribe tu Nombre: " );
        msg.Saludo(nombre);

    }
}
