package org.iesalandalus.programacion.robot.modelo;

public record Zona(int ancho, int alto) {
    public static int ANCHO_MINIMO = 10;
    public static int ANCHO_MAXIMO = 100;
    public static int ALTO_MINIMO = 10;
    public static int ALTO_MAXIMO = 100;

    public Zona {
        validarAncho(ancho);
        validarAlto(alto);
    }

    public Zona() {
        this(ANCHO_MINIMO, ALTO_MINIMO);
    }

    public Coordenada getCentro() {
        return new Coordenada(ancho / 2, alto / 2);
    }

    private void validarAncho(int ancho) {
        if (ancho < ANCHO_MINIMO || ANCHO_MAXIMO < ancho) {
            throw new IllegalArgumentException("Error: El ancho debe comprenderse entre " + ANCHO_MINIMO + " y " + ANCHO_MAXIMO);
        }
    }

    private void validarAlto(int alto) {
        if (alto < ALTO_MINIMO || ALTO_MINIMO < alto) {
            throw new IllegalArgumentException("Error: El alto debe comprenderse entre " + ALTO_MINIMO + " y " + ALTO_MAXIMO);
        }
    }

    public boolean pertenece(Coordenada coordenada) {
        if (coordenada == null) {
            throw new NullPointerException("La coordenada no puede ser nula");
        }
        return perteneceX(coordenada.x()) && perteneceY(coordenada.y());
    }

    private boolean perteneceX(int x){
        return (x >= 0 && x < alto);
    }

    private boolean perteneceY(int y){
        return (y >= 0 && y < alto);
    }
}