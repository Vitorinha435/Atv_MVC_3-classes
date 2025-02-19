package controller;

import database.BancoCliente;
import model.Cliente;

import java.util.List;

public class ControladorCliente {
    private BancoCliente banco = new BancoCliente();

    public List<Cliente> listarCliente() {
        return banco.findAll();

    }


    public void postarCliente(Cliente cliente) {
        banco.insert(cliente);
    }

    public Boolean atualizarCliente(Cliente cliente) {
        return banco.update(cliente);
    }

    public boolean deletarCliente(Integer id) {
        return banco.delete(id);

    }
}


