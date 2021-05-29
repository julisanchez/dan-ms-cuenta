package isi.dan.laboratorios.danmscuenta.rest;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import isi.dan.laboratorios.danmscuenta.domain.Pago;
import isi.dan.laboratorios.danmscuenta.service.CuentaService;

@SpringBootTest
public class CuentaRestUT {

    @Autowired
    CuentaRest cuentaRest;

    @MockBean
    CuentaService cuentaService;

    Pago pagoNuevo;

    List<Pago> pagosDeCliente;

    @BeforeEach
    void setUp() {
        pagoNuevo = new Pago();
        pagoNuevo.setId(1);

        pagosDeCliente = new ArrayList<Pago>();
        pagosDeCliente.add(pagoNuevo);
        pagosDeCliente.add(new Pago());
        pagosDeCliente.add(new Pago());
        pagosDeCliente.add(new Pago());
    }

    @Test
    void testPagar() {
        when(cuentaService.pagar(any(Pago.class))).thenReturn(pagoNuevo);

        assertSame(pagoNuevo, cuentaRest.pagar(2, pagoNuevo).getBody());
    }

    @Test
    void testEstado() {
        when(cuentaService.getEstado(2)).thenReturn(pagosDeCliente);

        assertSame(pagosDeCliente, cuentaRest.estado(2).getBody());
    }
}
