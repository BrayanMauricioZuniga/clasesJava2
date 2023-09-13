package ps.ja15.Entregable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ps.ja15.Entregable.model.Cuenta;
import ps.ja15.Entregable.service.CuentaService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {
    @Autowired
    CuentaService cuentaService;

    @GetMapping
    public ResponseEntity<?> findByAll(){
        try {
            return ResponseEntity.ok().body(cuentaService.findByAll());
        }catch (Exception e){
            return ResponseEntity.internalServerError().body(null);
        }
    }
    @GetMapping("/{id}")
    public Cuenta obtenerCuentaPorId(@PathVariable Long id) throws  Exception {
        try {
            return cuentaService.findById(id);
        }catch (Exception e){
            return null;
        }
    }
    @PostMapping
    public Cuenta crearCuenta(@RequestBody Cuenta cuenta) {
        try {
            return cuentaService.save(cuenta);
        }catch (Exception e){
            return null;
        }
    }
    @PutMapping
    public Cuenta actualizarCuenta(@RequestBody Cuenta cuenta) {
        try {
            return cuentaService.update(cuenta);
        }catch (Exception e) {
            return null;
        }
    }
    @DeleteMapping("/{numeroDeCuenta}")
    public ResponseEntity<Map<String, Boolean>> eliminarCuenta(@PathVariable String numeroDeCuenta) {
        try {
            cuentaService.delete(numeroDeCuenta);
            Map<String, Boolean> respuesta = new HashMap<>();
            respuesta.put("Cuenta Eliminada", Boolean.TRUE);
            return ResponseEntity.ok(respuesta);
        } catch (Exception e) {
            return null;
        }
    }
}
