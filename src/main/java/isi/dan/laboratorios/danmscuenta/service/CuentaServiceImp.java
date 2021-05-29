package isi.dan.laboratorios.danmscuenta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isi.dan.laboratorios.danmscuenta.dao.PagoRepository;
import isi.dan.laboratorios.danmscuenta.domain.Pago;

@Service
public class CuentaServiceImp implements CuentaService {

    @Autowired
    PagoRepository pagoRepository;

    @Override
    public Pago pagar(Pago pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public List<Pago> getEstado(Integer cuentaId) {
        return pagoRepository.findAllByCuentaId(cuentaId);
    }
    
}
