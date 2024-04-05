package LaboratorioAula10.Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {

    private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco() {
        this.clientes = new Cliente[5];
        this.numeroDeClientes = 0;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }


    public void adicionarCliente(Cliente cliente) {
        List clientesLista = new ArrayList(Arrays.asList(clientes));
        clientesLista.add(cliente);
        this.clientes = (Cliente[]) clientesLista.toArray(clientes);

        this.numeroDeClientes += 1;
    }
}
