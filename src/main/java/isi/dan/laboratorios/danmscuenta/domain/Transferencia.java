package isi.dan.laboratorios.danmscuenta.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("T")
public class Transferencia extends FormaPago {
    private String cbuOrigen;
    private String cbuDestino;
    private Long codigoTransferencia;

    public String getCbuOrigen() {
        return this.cbuOrigen;
    }

    public void setCbuOrigen(String cbuOrigen) {
        this.cbuOrigen = cbuOrigen;
    }

    public String getCbuDestino() {
        return this.cbuDestino;
    }

    public void setCbuDestino(String cbuDestino) {
        this.cbuDestino = cbuDestino;
    }

    public Long getCodigoTransferencia() {
        return this.codigoTransferencia;
    }

    public void setCodigoTransferencia(Long codigoTransferencia) {
        this.codigoTransferencia = codigoTransferencia;
    }

}
