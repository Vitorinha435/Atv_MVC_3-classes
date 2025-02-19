package controller;

import model.Produto;

import java.util.List;

public class ControladorVenda {

    public List<Produto> listarVenda() {
        return banco.findAll();

    }

}
