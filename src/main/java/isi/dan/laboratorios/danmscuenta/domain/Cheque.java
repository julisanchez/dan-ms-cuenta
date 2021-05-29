package isi.dan.laboratorios.danmscuenta.domain;

import java.time.Instant;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class Cheque extends FormaPago {
    private Integer nroCheque;
    private Instant fechaCobro;
    private String banco;

    public Integer getNroCheque() {
        return this.nroCheque;
    }

    public void setNroCheque(Integer nroCheque) {
        this.nroCheque = nroCheque;
    }

    public Instant getFechaCobro() {
        return this.fechaCobro;
    }

    public void setFechaCobro(Instant fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public String getBanco() {
        return this.banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}
