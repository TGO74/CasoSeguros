package org.example;

import java.util.ArrayList;

public class Cliente {

    private String nombreCliente;
    private String rutCliente;

    private int edadCliente;
    private String numeroTelefonicoCliente;

private String direccionCliente;

private String correoCliente;

    private ArrayList<PolizaSeguro> polizasCliente = new ArrayList<PolizaSeguro>();

    public Cliente(String nombre, String rut,int edadCliente, String numeroTelefonico,  String direccionCliente, String correoCliente) {
        this.nombreCliente = nombre;
        this.rutCliente = rutCliente;
        this.numeroTelefonicoCliente = numeroTelefonicoCliente;

        this.edadCliente = edadCliente;
        this.polizasCliente = new ArrayList<PolizaSeguro>();

        this.direccionCliente = direccionCliente;
        this.correoCliente = correoCliente;

    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombre) {
        this.nombreCliente = nombreCliente;
    }

    public String getRutCliente() {
        return this.rutCliente;
    }

    public void setRutCliente(String rut) {
        this.rutCliente = rutCliente;
    }

    public String getNumeroTelefonicoCliente() {
        return this.numeroTelefonicoCliente;
    }

    public void setNumeroTelefonicoCliente(String numeroTelefonico) {
        this.numeroTelefonicoCliente = numeroTelefonicoCliente;
    }


    public int getEdadCliente() {
        return this.edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getDireccionCliente() {
        return this.direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getCorreoCliente() {
        return this.correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public ArrayList<PolizaSeguro> getPolizasCliente() {
        return this.polizasCliente;
    }

    public void setPolizasCliente(ArrayList<PolizaSeguro> polizasCliente) {
        this.polizasCliente = polizasCliente;
    }

    public void agregarPoliza(PolizaSeguro polizaSeguro) {
        polizasCliente.add(polizaSeguro);
    }

    /*Imprimir polizas cliente
    public void imprimirPolizasCliente(Cliente cliente) {

        System.out.println("Cliente: " + cliente.getNombreCliente());
        System.out.println("Rut: " + cliente.getRutCliente());
        System.out.println("Numero telefonico: " + cliente.getNumeroTelefonicoCliente());
        System.out.println("Edad: " + cliente.getEdadCliente());
        System.out.println(" ");



        ArrayList<PolizaSeguro> polizasCliente = cliente.getPolizasCliente(); // Obtener la lista de pólizas del cliente


        for (PolizaSeguro p : polizasCliente) {

            System.out.println("Poliza: " + p.getNumeroPoliza());
            System.out.println("Tipo: " + p.getTipoSeguro());
            System.out.println("Monto: $" + p.getValorPoliza());
            System.out.println("Fecha de inicio: " + p.getFechaInicio());
            System.out.println("Fecha de termino: " + p.getFechaTermino());
            System.out.println(" ");
        }


    }
    */
}
