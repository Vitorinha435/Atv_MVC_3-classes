package database;

import model.Venda;

import java.util.ArrayList;
import java.util.List;

public class BancoVenda {
    private List<Venda> venda;

    public BancoVenda(){
        this.venda = new ArrayList<>();
    }

    public void insert(Venda v){
        venda.add(v);
    }

    public Venda findOne(int id){
        for (Venda v : venda){
            if (v.getIdVenda() == id){
                return v;
            }
        }
        return null;
    }

    public List<Venda> findAll() {
        return new ArrayList<>(venda);
    }

    public boolean update(Venda v){
        for(int i = 0; i < venda.size();i++){
            if(venda.get(i).getIdVenda() == v.getIdVenda()){
                venda.set(i,v);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id){
        return venda.removeIf(p -> p.getIdVenda() == id);
    }

}
