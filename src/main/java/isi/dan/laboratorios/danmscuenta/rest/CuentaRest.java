package isi.dan.laboratorios.danmscuenta.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import isi.dan.laboratorios.danmscuenta.domain.Cliente;
import isi.dan.laboratorios.danmscuenta.domain.Pago;
import isi.dan.laboratorios.danmscuenta.service.CuentaService;

/**
 * CuentaRest
 */

@RestController
@CrossOrigin
@RequestMapping("/api/cuenta")
@Api(value= "CuentaRest", description= "Permite gestionar la cuenta corriente del cliente")
public class CuentaRest {

    @Autowired
    CuentaService cuentaService;

    @PostMapping(path = "/{cuentaId}/pago")
    public ResponseEntity<Pago> pagar(@PathVariable Integer cuentaId, @RequestBody Pago pago){
        Cliente cliente = new Cliente();
        cliente.setId(cuentaId);

        pago.setCliente(cliente);

        return ResponseEntity.ok(cuentaService.pagar(pago));
    }

    @GetMapping(path = "/{cuentaId}/pago")
    public ResponseEntity<List<Pago>> estado(@PathVariable Integer cuentaId){
        return ResponseEntity.ok(cuentaService.getEstado(cuentaId));
    }

}