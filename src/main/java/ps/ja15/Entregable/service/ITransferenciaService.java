package ps.ja15.Entregable.service;



import ps.ja15.Entregable.model.Transferencia;

import java.util.List;

public interface ITransferenciaService {
    Transferencia save(Transferencia transferencia);
    Transferencia update(Transferencia transferencia);
    Transferencia findById(Long id);
    List <Transferencia> findByAll();


}