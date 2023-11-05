package org.example;




public class PolizaSeguro {

    private Cliente cliente;

    private Vendedor vendedor;

    private String numeroPoliza;

    private String fechaInicio;

    private String fechaTermino;

    private String tipoSeguro;

    private String valorPoliza;



    public PolizaSeguro(Cliente cliente,
                        Vendedor vendedor,
                        String numeroPoliza,
                        String fechaInicio,
                        String fechaTermino,
                        String tipoSeguro,
                        String valorPoliza) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.tipoSeguro = tipoSeguro;
        this.valorPoliza = valorPoliza;

    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return this.vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String getNumeroPoliza() {
        return this.numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermino() {
        return this.fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getTipoSeguro() {
        return this.tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getValorPoliza() {
        return this.valorPoliza;
    }

    public void setValorSeguro(String valorPoliza) {
        this.valorPoliza = valorPoliza;
    }



}
