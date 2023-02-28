package model;

public class Persona {
    private String nombre;
    private int edad;
    private String equipoFutbol;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.equipoFutbol = "";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEquipoFutbol(String equipoFutbol) {
        this.equipoFutbol = equipoFutbol;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEquipoFutbol() {
        return equipoFutbol;
    }
}
