package com.acme;

import java.util.Scanner;

public class mensaje {
    public String solicitaDatos(String mensaje){
        System.out.print(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();

    }

    public void Saludo(Persona p) {
        System.out.printf("Hola %s, Bienvenido a Java \n", p);
    }
}
