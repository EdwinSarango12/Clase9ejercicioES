package org.example;

public class Tortuga extends Mascota{
    private String nombre;
    private int edad;

    public Tortuga() {
    }

    public Tortuga(double tamano, String sexo,String nombre, int edad) {
        super(tamano,sexo);
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarTortuga(){
        System.out.println("Tortuga: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Tamaño: " + getTamano());
        System.out.println("Sexo: " + getSexo());
    }
    public void tortugamp(){
        System.out.println("Animal exótico");
    }
}
