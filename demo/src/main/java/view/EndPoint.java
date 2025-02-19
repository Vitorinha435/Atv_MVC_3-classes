package view;

import controller.ControladorCliente;
import controller.ControladorProduto;
import controller.ControladorVenda;
import model.Produto;
import java.util.List;

@RestController
public class EndPoint {

    public ControladorProduto c1 = new ControladorProduto();
    public ControladorCliente c2 = new ControladorCliente();
    public ControladorVenda c3 = new ControladorVenda();

    @GetMapping
    public List<Produto> getInformations(){
        return c1.listarProduto();
    }

    @PostMapping
    public String postInformations(@RequestBody Produto produto){
        c1.postarProdutos(produto);
        return "Sucesso";
    }

    @PutMapping
    public String putInformations(@RequestBody Produto produto){
        if(c1.atualizarProduto(produto)){
            return "Produto atualizado com sucesso!";
        } else {
            return "Falha ao atualizar produto...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformations(@RequestParam Integer id){
        if(c1.deletarProduto(id)){
            return "Deletado com sucesso!";
        } else {
            return "Falha ao deletar...";
        }
    }


}
