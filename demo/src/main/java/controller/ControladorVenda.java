package controller;

import database.BancoVenda;
import model.Produto;
import model.Venda;

import java.util.List;

public class ControladorVenda {
    private BancoVenda banco = new BancoVenda();

    public List<Venda> listarvenda() {
        return banco.findAll();

    }
    public void postarvenda(Venda venda) {
        banco.insert(venda);

    }
    public Boolean atualizarvenda(Venda venda) {
        return banco.update(venda);
    }

    public Boolean deletarvenda (Integer id) {

        return banco.delete(id);
    }
}
