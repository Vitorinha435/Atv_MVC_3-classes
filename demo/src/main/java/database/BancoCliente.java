package database;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class BancoCliente {
    private List<Cliente> cliente;

    public BancoCliente(){
        this.cliente = new ArrayList<>();
    }

    public void insert(Cliente c){
        cliente.add(c);
    }

    public Cliente findOne(int id){
        for (Cliente c : cliente){
            if (c.getIdCliente() == id){
                return c;
            }
        }
        return null;
    }

    public List<Cliente> findAll() {
        return new ArrayList<>(cliente);
    }

    public boolean update(Cliente c){
        for(int i = 0; i < cliente.size();i++){
            if(cliente.get(i).getIdCliente() == c.getIdCliente()){
                cliente.set(i,c);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id){
        return cliente.removeIf(p -> p.getIdCliente() == id);
    }
}
