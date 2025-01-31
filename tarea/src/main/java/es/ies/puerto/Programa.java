package es.ies.puerto;

import es.ies.puerto.model.DesarrolladorModel;
import es.ies.puerto.model.DiseniadorModel;
import es.ies.puerto.model.GerenteModel;

public class Programa {
    public static void main(String[] args) {
        DesarrolladorModel desarrollador = new DesarrolladorModel("000000h", "Francisco", 22, 2000);
        DiseniadorModel diseniador = new DiseniadorModel("0000001h", "Romen", 18, 4000);
        GerenteModel gerente = new GerenteModel("000000002x", "Carlos", 38, 3000);
        System.out.println(desarrollador);
        System.out.println(desarrollador.calcularsalarioBaseFinal());
        System.out.println(diseniador);
        System.out.println(diseniador.calcularsalarioBaseFinal());
        System.out.println(gerente);
        System.out.println(gerente.calcularsalarioBaseFinal());
    }
}
