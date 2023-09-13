package ps.ja15.Entregable.model;
import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "cuenta_origen_id")
    private Cuenta cuentaOriginId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name= "cuenta_destino_id")
    private Cuenta cuentaDestinoId;

    private BigDecimal monto;
    private LocalDateTime fechaTransferencia;

}