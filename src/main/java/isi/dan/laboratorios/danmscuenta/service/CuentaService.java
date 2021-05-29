package isi.dan.laboratorios.danmscuenta.service;

import java.util.List;

import isi.dan.laboratorios.danmscuenta.domain.Pago;

public interface CuentaService {
    Pago pagar(Pago pago);
    List<Pago> getEstado(Integer cuentaId);
}
