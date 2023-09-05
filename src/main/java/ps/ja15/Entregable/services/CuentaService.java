package ps.ja15.Entregable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ps.ja15.Entregable.model.Cuenta;
import ps.ja15.Entregable.repository.CuentaRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CuentaService {

    @Autowired
    CuentaRepository cuentaRepository;

    public Cuenta save(Cuenta cuenta){
        return  cuentaRepository.save(cuenta);
    }

    public Cuenta update(Cuenta cuenta){
        return  cuentaRepository.save(cuenta);
    }

    public void delete(Long id){
        return  cuentaRepository.deleteById(id);
    }


    public Optional<Cuenta> findById(Cuenta cuenta){
        return cuentaRepository.findById(cuenta.getId());
    }

    public List<Cuenta> findByAll(Cuenta cuenta){
        return cuentaRepository.findAll();
    }
}
