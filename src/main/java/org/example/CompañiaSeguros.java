package org.example;
import java.util.ArrayList;


import java.util.Scanner;
import java.time.LocalDate;
import java.util.UUID;





public class CompañiaSeguros {

    private String nombreCompañia;

    private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<PolizaSeguro> segurosVendidos = new ArrayList<PolizaSeguro>();

    public CompañiaSeguros(String nombreCompañia) {

        this.nombreCompañia = nombreCompañia;
        this.vendedores = new ArrayList<Vendedor>();
        this.clientes = new ArrayList<Cliente>();
        this.segurosVendidos = new ArrayList<PolizaSeguro>();
    }

    public String getNombreCompañia() {
        return this.nombreCompañia;
    }

    public void setNombreCompañia(String nombreCompañia) {
        this.nombreCompañia = nombreCompañia;
    }

    public ArrayList<Vendedor> getVendedores() {

        return this.vendedores;
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }


    public ArrayList<PolizaSeguro> getSeguros() {
        return this.segurosVendidos;
    }


    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setSeguros(ArrayList<PolizaSeguro> seguros) {
        this.segurosVendidos = seguros;
    }


    public void agregarVendedor(Vendedor vendedor) {

        for (Vendedor v : vendedores) {
            if (vendedor.getNombreVendedor().equals(v.getNombreVendedor())) {
                System.out.println("El vendedor ya existe");
            } else {
                vendedores.add(vendedor);

            }
        }

    }

    public void agregarCliente(Cliente cliente) {


        for (Cliente c : clientes) {
            if (cliente.getNombreCliente().equals(c.getNombreCliente())) {
                System.out.println("El cliente ya existe");
            } else {


                clientes.add(cliente);
            }
        }

    }


    public void asegurarCliente(Cliente cliente, Vendedor vendedor) {


        // Generar un número de póliza único
        String numeroPoliza = UUID.randomUUID().toString();

        // Obtener la fecha actual
        LocalDate fechaInicio = LocalDate.now();

        // Pedir la fecha de término
        System.out.println("Ingrese la fecha de término");
        Scanner scanner1 = new Scanner(System.in);
        String fechaTermino = scanner1.nextLine();


        System.out.println("Ingrese el tipo de seguro");
        Scanner scanner2 = new Scanner(System.in);
        String tipoSeguro = scanner2.nextLine();

        System.out.println("Ingrese el valor del seguro");
        Scanner scanner3 = new Scanner(System.in);
        String valorSeguro = scanner3.nextLine();


        // Crear un objeto PolizaSeguro con los datos
        PolizaSeguro polizaSeguro = new PolizaSeguro(

                cliente,
                vendedor,
                numeroPoliza,
                fechaInicio.toString(),
                fechaTermino.toString(),
                tipoSeguro,
                valorSeguro);

        // Agregar la venta al vendedor
        vendedor.agregarSegurosVendidos(polizaSeguro);

        // Asignar la póliza al cliente
        cliente.agregarPoliza(polizaSeguro);

        // Agregar la póliza a la lista de polizas de la compañía
        segurosVendidos.add(polizaSeguro);

    }





    public void despedirVendedor(Vendedor vendedor) {

        for (Vendedor v : vendedores) {
            if (vendedor.getNombreVendedor().equals(v.getNombreVendedor())) {
                vendedores.remove(vendedor);
            } else {
                System.out.println("El vendedor no existe");
            }
        }
    }


    public void eliminarCliente(Cliente cliente) {

        for (Cliente c : clientes) {
            if (cliente.getNombreCliente().equals(c.getNombreCliente())) {
                clientes.remove(cliente);
            } else {
                System.out.println("El cliente no existe");
            }
        }
    }


    public void eliminarPolizaSeguro(PolizaSeguro seguro) {

        for (PolizaSeguro s : segurosVendidos) { //arreglar
            if (seguro.getNumeroPoliza().equals(s.getNumeroPoliza())) {
                segurosVendidos.remove(seguro);
            } else {
                System.out.println("El seguro no existe");
            }
        }
    }


    public Cliente buscarCliente(String rutCliente) {

        for (Cliente c : clientes) {
            if (rutCliente.equals(c.getRutCliente())) {
                System.out.println("Cliente: " + c.getNombreCliente());
                System.out.println("Rut: " + c.getRutCliente());
                System.out.println("Numero telefonico: " + c.getNumeroTelefonicoCliente());
                System.out.println("Edad: " + c.getEdadCliente());


                return c;
            }
        }
        return null;
    }


    public ArrayList<Cliente> buscarClienteTerceraEdad() {

        System.out.println("Clientes tercera edad");
        ArrayList<Cliente> clientesTerceraEdad = new ArrayList<Cliente>();

        for (Cliente c : clientes) {
            if (c.getEdadCliente() >= 65) {

                clientesTerceraEdad.add(c);



                return clientesTerceraEdad;
            }
        }
        return null; // Devolver null si no se encuentra ningún cliente de tercera edad
    }
}






   /* public void listarVendedores() {
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor.getNombre());
        }
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombre());
        }
    }

    public void listarSeguros() {
        for (Seguro seguro : seguros) {
            System.out.println(seguro.getNombre());
        }
    }

    public void listarVendedoresClientes() {
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor.getNombre());
            for (Cliente cliente : clientes) {
                if (cliente.getVendedor().equals(vendedor)) {
                    System.out.println(cliente.getNombre());
                }
            }
        }
    }

    public void listarClientesVendedores() {
        for (Cliente cliente : clientes)

}
*/
