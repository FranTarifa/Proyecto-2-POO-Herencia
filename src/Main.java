import entidades.Empleado;
import entidades.Gerente;

public class Main {
    public static void main(String[] args) {

        //IMPRIMIENDO DATOS DE LAS ENTIDADES
        System.out.println("=========================");
        System.out.println("DATOS DEL GERENTE");
        Gerente gerente = new Gerente("Juan", "Pérez", "22345", "Polonia 5001", 10000.0, 1, 10000.0);
        System.out.println(gerente.toString());
        System.out.println("=========================");
        System.out.println("DATOS DEL EMPLEADO");
        Empleado empleado = new Empleado("Francisco", "Tarifa", "32544","Ramos 2234",5000.0,2);
        System.out.println(empleado.toString());
        System.out.println("=========================");
        //IMPRIMIENDO DATOS DE LAS ENTIDADES

        //IMPRIMIENDO RENUMERACIÓN ANTES DEL AUMENTO

        System.out.println("IMPRIMIENDO RENUMERACIÓN ANTES DEL AUMENTO");
        System.out.println(empleado.getRenumeracion());
        System.out.println(gerente.getRenumeracion());
        System.out.println("=========================");
        //IMPRIMIENDO RENUMERACIÓN ANTES DEL AUMENTO

        //PROBANDO AUMENTO
        gerente.aumentarRenumeracion(42.5);
        empleado.aumentarRenumeracion(25.6);
        //PROBANDO AUMENTO

        //IMPRIMIENDO RENUMERACIÓN DESPUES DEL AUMENTO
        System.out.println("IMPRIMIENDO RENUMERACIÓN DESPUES DEL AUMENTO");
        System.out.println(empleado.getRenumeracion());
        System.out.println(gerente.getRenumeracion());
        System.out.println("=========================");
        //IMPRIMIENDO RENUMERACIÓN DESPUES DEL AUMENTO
    }
}