package view;

import controller.ControladorProduto;
import controller.ControladorVenda;
import model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EndPointVenda {
    public ControladorVenda c3 = new ControladorVenda();
    @GetMapping("/venda")
    public List<Venda> getInformationsVenda(){
        return c3.listarvenda();
    }

    @PostMapping
    public String postInformationsVenda(@RequestBody Venda venda){
        c3.postarvenda(venda);
        return "Sucesso";
    }

    @PutMapping
    public String putInformationsVenda(@RequestBody Venda venda){
        if(c3.atualizarvenda(venda)){
            return "Produto atualizado com sucesso!";
        } else {
            return "Falha ao atualizar produto...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsVenda(@RequestParam Integer id){
        if(c3.deletarvenda(id)){
            return "Deletado com sucesso!";
        } else {
            return "Falha ao deletar...";
        }
    }

}
