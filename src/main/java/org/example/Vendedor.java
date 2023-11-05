package org.example;

import java.util.ArrayList;

public class Vendedor {



    private CompañiaSeguros compañiaSegurosVendedor;

    private String nombreVendedor;
    private String rutVendedor;
    private String direccionVendedor;

    private int edadVendedor;

    private ArrayList<PolizaSeguro> polizasVendidas = new ArrayList<PolizaSeguro>();

    private String numeroTelefonicoVendedor;

    private ArrayList<PolizaSeguro> segurosVendedor = new ArrayList<PolizaSeguro>();

    public Vendedor(String nombreVendedor , String rutVendedor, String direccionVendedor, String numeroTelefonicoVendedor, int edadVendedor) {
        this.nombreVendedor = nombreVendedor;
        this.rutVendedor = rutVendedor;
        this.direccionVendedor = direccionVendedor;
        this.numeroTelefonicoVendedor = numeroTelefonicoVendedor;

        this.polizasVendidas = new ArrayList<PolizaSeguro>();
        this.edadVendedor = edadVendedor;
    }

    public CompañiaSeguros getCompañiaSegurosVendedor() {
        return this.compañiaSegurosVendedor;
    }

    public void setCompañiaSegurosVendedor(CompañiaSeguros compañiaSegurosVendedor) {
        this.compañiaSegurosVendedor = compañiaSegurosVendedor;
    }

    public String getNombreVendedor() {
        return this.nombreVendedor;
    }

    public void setNombreVendedor(String nombre) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getRutVendedor() {
        return this.rutVendedor;
    }

    public void setRutVendedor(String rut) {
        this.rutVendedor = rutVendedor;
    }

    public String getDireccionVendedor() {
        return this.direccionVendedor;
    }

    public void setDireccionVendedor(String direccion) {
        this.direccionVendedor = direccionVendedor;
    }

    public String getNumeroTelefonicoVendedor() {
        return this.numeroTelefonicoVendedor;
    }

    public void setNumeroTelefonicoVendedor(String numeroTelefonico) {
        this.numeroTelefonicoVendedor = numeroTelefonicoVendedor;
    }

    public ArrayList<PolizaSeguro> getSegurosVendedor() {
        return this.segurosVendedor;
    }

    public void setSegurosVendedor(ArrayList<PolizaSeguro> segurosVendedor) {
        this.segurosVendedor = segurosVendedor;
    }

    public void agregarSegurosVendidos(PolizaSeguro seguro) {

        for (PolizaSeguro s : segurosVendedor) {
            if (seguro.getNumeroPoliza().equals(s.getNumeroPoliza())) {
                return;
            }
        }
        segurosVendedor.add(seguro);
    }

}


