package es.ies.puerto.model;

public class GerenteModel extends EmpleadoModel{

    public GerenteModel() {
    }


    public GerenteModel(String id, String nombre, int edad, float salarioBase) {
        super.id = id;
        super.nombre = nombre;
        super.edad = edad;
        super.salarioBase = salarioBase;
    }

    public GerenteModel(String id) {
        super.id = id;
    }

    public double calcularsalarioBaseFinal(){
        return getSalarioBase() + getSalarioBase()*0.30;
    }

}
