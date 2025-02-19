package controller;

import database.BancoProduto;
import model.Cliente;
import model.Produto;
import model.Venda;

import java.util.List;

public class ControladorProduto {
    private BancoProduto banco = new BancoProduto();

    public List<Produto> listarProduto() {

        return banco.findAll();
    }

    public void postarProduto(Produto produto) {

        banco.insert(produto);
    }

    public Boolean atualizarProduto(Produto produto) {

        return banco.update(produto);
    }

    public Boolean deletarProduto(Integer id) {

        return banco.delete(id);
    }
    }
