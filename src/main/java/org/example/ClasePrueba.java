package org.example;

import java.util.Scanner;

import java.util.ArrayList;





public class ClasePrueba {

    public static void main(String[] args) {
        CompañiaSeguros compañiaSeguros = new CompañiaSeguros("Compañia prueba");

        //Crear clientes y agregarlos a la lista clientes

        Cliente cliente1 = new Cliente(
                "juan Garces",
                "12343278-9",
                30,
                "12345678",
                "direccion1",
                "correo1");
        compañiaSeguros.agregarCliente(cliente1);

        Cliente cliente2 = new Cliente(
                "pedro Alvarado",
                "122342378-9",
                70,
                "12345678",
                "direccion2",
                "correo2");
        compañiaSeguros.agregarCliente(cliente2);

        Cliente cliente3 = new Cliente(
                "Andres Jopia",
                "12345678-9",
                26,
                "12345678",
                "direccion3",
                "correo3");
        compañiaSeguros.agregarCliente(cliente3);


        Cliente cliente4 = new Cliente(
                "Daniela Brunett",
                "123423278-9",
                76,
                "12345678",
                "direccion4",
                "correo4");
        compañiaSeguros.agregarCliente(cliente4);

        Cliente cliente5 = new Cliente(
                "Sofia Jimenez",
                "12345678-9",
                55,
                "12345678",

                "direccion5", "correo5");
        compañiaSeguros.agregarCliente(cliente5);

        Vendedor vendedor1 = new Vendedor("juan", "12345678-9", "direccion1", "12345678", 20);


        Vendedor vendedor2 = new Vendedor("Diego", "12345678-9", "direccion2", "12345678", 20);
        Vendedor vendedor3 = new Vendedor("Eduardo", "12345678-9", "direccion3", "12345678", 20);


        compañiaSeguros.agregarVendedor(vendedor1);
        compañiaSeguros.agregarVendedor(vendedor2);

        //Imprimir lista de clientes
        System.out.println("Lista de clientes: ");
        compañiaSeguros.imprimirClientes();











    }
}

