package ps.ja15.Entregable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ps.ja15.Entregable.model.Cuenta;

public interface CuentaRepository extends JpaRepository <Cuenta, Long> {
}
