package es.ies.puerto.model;

public class DesarrolladorModel extends EmpleadoModel{
    
    public DesarrolladorModel() {
    }


    public DesarrolladorModel(String id, String nombre, int edad, float salarioBase) {
        super.id = id;
        super.nombre = nombre;
        super.edad = edad;
        super.salarioBase = salarioBase;
    }

    public DesarrolladorModel(String id) {
        super.id = id;
    }

    public double calcularsalarioBaseFinal(){
        return getSalarioBase() + getSalarioBase()*0.20;
    }

    
}