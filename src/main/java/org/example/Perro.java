package org.example;

public class Perro extends Mascota{
    private String nombre;
    private String raza;

    public Perro() {
    }

    public Perro(double tamano, String sexo, String nombre, String raza) {
        super(tamano, sexo);
        this.nombre = nombre;
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void mostrarPerro() {
        System.out.println("Perro: " + getNombre());
        System.out.println("Raza: " + getRaza());
        System.out.println("Tamano: " + getTamano());
        System.out.println("Sexo: " + getSexo());
    }
    public void perromp() {
        System.out.println("Animal doméstico");
    }

}

