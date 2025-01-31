package es.ies.puerto.model;

import java.security.PublicKey;
import java.util.Objects;

public abstract class EmpleadoModel {
    String id;
    String nombre;
    int edad;
    float salarioBase;


    public EmpleadoModel() {
    }


    public EmpleadoModel(String id, String nombre, int edad, float salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public EmpleadoModel(String id) {
        this.id = id;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", salarioBase='" + getSalarioBase() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmpleadoModel)) {
            return false;
        }
        EmpleadoModel empleadoModel = (EmpleadoModel) o;
        return Objects.equals(id, empleadoModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    public abstract double calcularsalarioBaseFinal();
}
