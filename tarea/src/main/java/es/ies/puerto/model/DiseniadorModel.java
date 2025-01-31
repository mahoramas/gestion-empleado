package es.ies.puerto.model;

public class DiseniadorModel extends EmpleadoModel{


    public DiseniadorModel() {
    }


    public DiseniadorModel(String id, String nombre, int edad, float salarioBase) {
        super.id = id;
        super.nombre = nombre;
        super.edad = edad;
        super.salarioBase = salarioBase;
    }

    public DiseniadorModel(String id) {
        super.id = id;
    }

    public double calcularsalarioBaseFinal(){
        return getSalarioBase() + getSalarioBase()*0.10;
    }

}
