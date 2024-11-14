package org.example;

public class Gato extends Mascota{
    private String nombre;
    private String raza;
    private String color;

    public Gato(){
    }

    public Gato(double tamano, String sexo,String nombre, String raza, String color) {
        super(tamano, sexo);
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void mostrarGato(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Raza: " + getRaza());
        System.out.println("Color: " + getColor());
        System.out.println("Tamano: " + getTamano());
        System.out.println("Sexo: " + getSexo());
    }
    public void gatomp(){
        System.out.println("Animal doméstico");
    }

}
