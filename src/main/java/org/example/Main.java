package org.example;
public class Main {
    public static void main(String[] args) {
        /*1.*/
        Mascota mascota = new Mascota();
        mascota.mostrarMascota();
        /*2.*/
        Perro perro = new Perro(70.0, "macho","Tobby","Golden");
        perro.mostrarMascota();
        perro.mascotamp();
        /*3.*/
        Gato gato = new Gato(20.0,"hembra","michi","siames","negro");
        gato.mostrarMascota();
        gato.mascotamp();
        /*4.*/
        Tortuga tortuga = new Tortuga(50.0,"macho","Max",20);
        tortuga.mostrarMascota();
        tortuga.mascotamp();
        tortuga.mostrarMascota();
        tortuga.tortugamp();
         /*5.*/
        Conejo conejo = new Conejo();
        conejo.setNombre("Lucas");
        conejo.setColor("Blanco");
        conejo.setTamano(10.5);
        conejo.setSexo("Macho");


    }
}