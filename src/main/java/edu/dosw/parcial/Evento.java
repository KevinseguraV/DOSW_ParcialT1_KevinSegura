package edu.dosw.parcial;

import java.time.LocalDateTime;

 public abstract class Evento {
    protected String titulo;
    protected LocalDateTime fechaInicio;
    protected int duracion;
    protected int cupoMaximo;

    public Evento(String titulo, LocalDateTime fechaInicio, int duracion,int CupoMaximo) {
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
        this.cupoMaximo = CupoMaximo;

    }

    public abstract void crearEvento(String creador);{


     }

}
