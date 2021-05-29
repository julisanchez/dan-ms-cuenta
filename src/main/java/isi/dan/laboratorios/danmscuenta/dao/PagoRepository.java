package isi.dan.laboratorios.danmscuenta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import isi.dan.laboratorios.danmscuenta.domain.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {
    @Query("select p from Pago p where p.cliente.id = ?1")
    List<Pago> findAllByCuentaId(Integer cuentaId);
}
