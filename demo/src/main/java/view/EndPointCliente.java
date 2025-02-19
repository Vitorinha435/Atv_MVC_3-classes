package view;

import controller.ControladorCliente;
import model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EndPointCliente {
    public ControladorCliente c2 = new ControladorCliente();

    @GetMapping("/cliente")
    public List<Cliente> getInformationsCliente(){
        return c2.listarCliente();
    }

    @PostMapping
    public String postInformationsCliente(@RequestBody Cliente cliente){
        c2.postarCliente(cliente);
        return "Sucesso";
    }

    @PutMapping
    public String putInformationsCliente(@RequestBody Cliente cliente){
        if(c2.atualizarCliente(cliente)) {
            return "Produto atualizado com sucesso!";
        }else {
            return "Falha ao atualizar produto...";
        }
    }
    @DeleteMapping("/{id}")
    public String deleteInformationsCliente(@RequestParam Integer id){
        if(c2.deletarCliente(id)){
            return "Deletado com sucesso!";
        } else {
            return "Falha ao deletar...";
        }

    }
}
