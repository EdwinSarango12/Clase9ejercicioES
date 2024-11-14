package org.example;

public class Mascota {
    private double tamano;
    private String sexo;

    public Mascota() {
    }

    public Mascota(double tamano, String sexo) {
        this.tamano = tamano;
        this.sexo = sexo;
    }
    public double getTamano() {
        return tamano;
    }
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void mostrarMascota() {
        System.out.println("Tamano: " + tamano);
        System.out.println("Sexo: " + sexo);

    }
    public void mascotamp(){
        System.out.println("Animales que se pueden cuidar en casa");
    }
}
