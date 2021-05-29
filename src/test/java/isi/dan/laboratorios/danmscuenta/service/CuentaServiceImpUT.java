package isi.dan.laboratorios.danmscuenta.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import isi.dan.laboratorios.danmscuenta.dao.PagoRepository;
import isi.dan.laboratorios.danmscuenta.domain.Pago;

@SpringBootTest
public class CuentaServiceImpUT {
    
    @Autowired
    CuentaServiceImp cuentaServiceImp;
    
    @MockBean
    PagoRepository pagoRepository;

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
        when(pagoRepository.save(any(Pago.class))).thenReturn(pagoNuevo);

        assertEquals(pagoNuevo, cuentaServiceImp.pagar(pagoNuevo));
    }

    @Test
    void testGetEstado(){
        when(pagoRepository.findAllByCuentaId(3)).thenReturn(pagosDeCliente);

        assertEquals(pagosDeCliente, cuentaServiceImp.getEstado(3));
    }
}
