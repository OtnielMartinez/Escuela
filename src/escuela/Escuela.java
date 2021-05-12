/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

/**
 *
 * @author lampi
 */
public class Escuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        persona  alumno = new persona("Estudiante","Otniel",22,'M',"MADO981227","Asistir a clases");
        
        
        System.out.println(alumno.toString());
        alumno.entrada();
        alumno.actividad();
        alumno.reseso();
        alumno.salida();
        System.out.println("------------------------------------------------------");
        edificio salon = new edificio("Campus V","Salon",true,50,"Disponible",30);
        System.out.println(salon.toString());
        salon.estadoDeUso();
        salon.condiciones();
        salon.capacidad();
    }
    
}
