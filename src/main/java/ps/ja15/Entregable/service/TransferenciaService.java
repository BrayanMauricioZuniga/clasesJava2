package ps.ja15.Entregable.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ps.ja15.Entregable.model.Cuenta;
import ps.ja15.Entregable.model.Transferencia;

import ps.ja15.Entregable.repository.CuentaRepository;
import ps.ja15.Entregable.repository.TransferenciaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class TransferenciaService implements ITransferenciaService  {
    @Autowired
    TransferenciaRepository transferenciaRepository;
    @Autowired
    CuentaRepository cuentaRepository;
    @Autowired
    CuentaService cuentaService;

    public Transferencia save(Transferencia transferencia) {

        return transferenciaRepository.save(transferencia);

    }


    public Transferencia update(Transferencia transferencia){
        return transferenciaRepository.save(transferencia);

    }
    public  List<Transferencia> findByAll(){
        return transferenciaRepository.findAll();
    }
    public Transferencia findById(Long id){
        return  transferenciaRepository.findById(id).get();
    }



}