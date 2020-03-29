package Planetas;

public class Planetas{
    private String nombre;
    private double porcentMuerte;
    private int dinero;
    private int cantidadConstructores;
    private int cantidadNaves;
    private int cantidadGuerreros;
    private int probabilidadDistribucion;

    public Planetas(String nombre, double porcentMuerte, int dinero, int cantidadConstructores, int cantidadNaves, int cantidadGuerreros, int probabilidadDistribucion) {
        this.nombre = nombre;
        this.porcentMuerte = porcentMuerte;
        this.dinero = dinero;
        this.cantidadConstructores = cantidadConstructores;
        this.cantidadNaves = cantidadNaves;
        this.cantidadGuerreros = cantidadGuerreros;
        this.probabilidadDistribucion = probabilidadDistribucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentMuerte() {
        return porcentMuerte;
    }

    public void setPorcentMuerte(double porcentMuerte) {
        this.porcentMuerte = porcentMuerte;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getCantidadConstructores() {
        return cantidadConstructores;
    }

    public void setCantidadConstructores(int cantidadConstructores) {
        this.cantidadConstructores = cantidadConstructores;
    }

    public int getCantidadNaves() {
        return cantidadNaves;
    }

    public void setCantidadNaves(int cantidadNaves) {
        this.cantidadNaves = cantidadNaves;
    }

    public int getCantidadGuerreros() {
        return cantidadGuerreros;
    }

    public void setCantidadGuerreros(int cantidadGuerreros) {
        this.cantidadGuerreros = cantidadGuerreros;
    }

    public int getProbabilidadDistribucion() {
        return probabilidadDistribucion;
    }

    public void setProbabilidadDistribucion(int probabilidadDistribucion) {
        this.probabilidadDistribucion = probabilidadDistribucion;
    }
    
    
}