package view;

import controller.ControladorCliente;
import controller.ControladorProduto;
import controller.ControladorVenda;
import model.Cliente;
import model.Produto;
import model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EndPointProduto {

    public ControladorProduto c1 = new ControladorProduto();


    @GetMapping("/produto")
    public List<Produto> getInformationsProduto(){
        return c1.listarProduto();
    }

    @PostMapping
    public String postInformationsProduto(@RequestBody Produto produto){
        c1.postarProduto(produto);
        return "Sucesso";
    }

    @PutMapping
    public String putInformationsProduto(@RequestBody Produto produto){
        if(c1.atualizarProduto(produto)){
            return "Produto atualizado com sucesso!";
        } else {
            return "Falha ao atualizar produto...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsProduto(@RequestParam Integer id){
        if(c1.deletarProduto(id)){
            return "Deletado com sucesso!";
        } else {
            return "Falha ao deletar...";
        }
    }




}

