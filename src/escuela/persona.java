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
public class persona {
    private String tipo;
    private String nombre;
    private int edad;
    private char sexo;
    private String curp;
    private String actividad;

    public persona() {
    }

    public persona(String tipo, String nombre, int edad, char sexo, String curp, String actividad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.curp = curp;
        this.actividad = actividad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCurp() {
        return curp;
    }

    public String getActividad() {
        return actividad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "persona{" + "tipo=" + tipo + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", curp=" + curp + ", actividad=" + actividad + '}';
    }

    void getTipo(String estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getNombre(String otniel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getEdad(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void entrada(){
        System.out.println("El" + this.tipo +" "+ this.nombre + " esta entrando a la Escuela");
    }
    public void actividad(){
        System.out.println("El" + this.tipo +" "+ this.nombre +  this.actividad);
    }
    public void reseso(){
        System.out.println("El" + this.tipo +" "+ this.nombre + " esta en reseso");
    }
    public void salida(){
        System.out.println("El" + this.tipo +" "+ this.nombre + " esta saliendo de la escuela");
    }
    
}
