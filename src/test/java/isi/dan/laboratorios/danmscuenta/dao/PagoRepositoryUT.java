package isi.dan.laboratorios.danmscuenta.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import isi.dan.laboratorios.danmscuenta.domain.Pago;

@SpringBootTest
@Sql({"/pago.sql"})
public class PagoRepositoryUT {
    
    @Autowired
    PagoRepository cuentaRepository;

    @Test
    void testPagosPorCliente() {
        List<Pago> pagosUno = cuentaRepository.findAllByCuentaId(1);
        List<Pago> pagosDos = cuentaRepository.findAllByCuentaId(2);
        List<Pago> pagosTres = cuentaRepository.findAllByCuentaId(3);

        assertEquals(2, pagosUno.size());
        assertEquals(0, pagosDos.size());
        assertEquals(3, pagosTres.size());
    }
}
