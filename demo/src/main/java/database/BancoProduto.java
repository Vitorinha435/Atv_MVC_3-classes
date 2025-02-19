package database;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoProduto {
    private List<Produto> produto;
    public BancoProduto(){
        this.produto = new ArrayList<>();
    }

    public void insert(Produto p){
        produto.add(p);
    }

    public Produto findOne(int id){
        for (Produto p : produto){
            if (p.getIdProduto() == id){
                return p;
            }
        }
        return null;
    }

    public List<Produto> findAll() {
        return new ArrayList<>(produto);
    }

    public boolean update(Produto p){
        for(int i = 0; i < produto.size();i++){
            if(produto.get(i).getIdProduto() == p.getIdProduto()){
                produto.set(i,p);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id){
        return produto.removeIf(p -> p.getIdProduto() == id);
    }
}
