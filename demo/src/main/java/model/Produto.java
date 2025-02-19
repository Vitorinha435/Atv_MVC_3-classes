package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Produto {

    public int idProduto;
    public String nomeProduto;
    public double preco;
    public Integer quantidade;

}

