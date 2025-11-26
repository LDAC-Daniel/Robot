package org.iesalandalus.programacion.robot.modelo;

public enum Orientacion {
    NORTE("Norte"),
    NORESTE("Noreste"),
    ESTE("Este"),
    SURESTE("Sureste"),
    SUR("Sur"),
    SUROESTE("Suroeste"),
    OESTE("Oeste"),
    NOROESTE("Noroeste");

    private final String cadenaMostrar;

    private Orientacion (String cadenaMostrar) {
        this.cadenaMostrar = cadenaMostrar;
    }
    @Override
    public String toString() {
        return cadenaMostrar;
    }
}