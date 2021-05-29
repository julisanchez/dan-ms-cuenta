package isi.dan.laboratorios.danmscuenta.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("E")
public class Efectivo extends FormaPago {
    private Integer nroRecibo;

    public Integer getNroRecibo() {
        return this.nroRecibo;
    }

    public void setNroRecibo(Integer nroRecibo) {
        this.nroRecibo = nroRecibo;
    }

}
