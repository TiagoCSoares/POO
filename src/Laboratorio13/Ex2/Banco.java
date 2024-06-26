package Laboratorio13.Ex2;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private static final Banco banco = new Banco();

    private Banco() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente getCliente(int indice) {
        return clientes.get(indice);
    }

    public int getNumeroDeClientes() {
        return this.clientes.size();
    }

    public ArrayList<Cliente> getCliente(String nome, String sobrenome) {
        ArrayList<Cliente> result = new ArrayList<>();
        for (Cliente cliente: clientes){
            if (cliente.getNome().equals(nome) &&
                    cliente.getSobrenome().equals(sobrenome)) {
                result.add(cliente);
            }
        }
        return result;
    }

    public static Banco getBanco() {
        return banco;
    }
}