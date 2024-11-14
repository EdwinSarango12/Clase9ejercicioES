package org.example;

public class Conejo extends Mascota{
    private String nombre;
    private String color;

    public Conejo(){
    }

    public Conejo(double tamano, String sexo, String nombre, String color) {
        super(tamano, sexo);
        this.nombre = nombre;
        this.color = color;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void mostrarConejo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Tamaño: "+ getTamano());
        System.out.println("Sexo: " + getSexo());
    }
    public void conejomp(){
        System.out.println("Animal silvestre");
    }

}
