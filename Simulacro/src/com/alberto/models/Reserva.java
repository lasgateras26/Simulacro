package com.alberto.models;

import com.alberto.logic.utils.Utils;

import java.util.Date;

public class Reserva {

    private String aula;
    private Date fecha;

    public Reserva(String aula, Date fecha) {
        this.aula = aula;
        this.fecha = fecha;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getFecha() {
        return Utils.convertToLocalDate(fecha).toString();
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
