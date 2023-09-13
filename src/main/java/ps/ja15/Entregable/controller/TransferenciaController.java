package ps.ja15.Entregable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ps.ja15.Entregable.model.Transferencia;
import ps.ja15.Entregable.service.TransferenciaService;

import java.util.List;

@RestController
@RequestMapping ("/transferencia")
public class TransferenciaController {
    @Autowired
    TransferenciaService transferenciaService;

    @GetMapping
    public List <Transferencia> findByAll(){
        return  transferenciaService.findByAll();
    }
    @GetMapping("/{id}")
    public Transferencia findById(@PathVariable Long id){
        return  transferenciaService.findById(id);
    }
    @PostMapping
    public Transferencia crearTransferencia(@RequestBody Transferencia transferencia){
        return  transferenciaService.save(transferencia);
    }
    @PutMapping
    public Transferencia actualizarTransferencia(@RequestBody Transferencia transferencia){
        return transferenciaService.update(transferencia);
    }

}