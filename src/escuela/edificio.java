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
public class edificio {
    private String campus;
    private String area;
    private boolean electricidad;
    private int metroscuadrados;
    private String estado;
    private int capacidad;

    public edificio() {
    }

    public edificio(String campus, String area, boolean electricidad, int metroscuadrados, String estado, int capacidad) {
        this.campus = campus;
        this.area = area;
        this.electricidad = electricidad;
        this.metroscuadrados = metroscuadrados;
        this.estado = estado;
        this.capacidad = capacidad;
    }

    public String getCampus() {
        return campus;
    }

    public String getArea() {
        return area;
    }

    public boolean isElectricidad() {
        return electricidad;
    }

    public int getMetroscuadrados() {
        return metroscuadrados;
    }

    public String getEstado() {
        return estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setElectricidad(boolean electricidad) {
        this.electricidad = electricidad;
    }

    public void setMetroscuadrados(int metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "edificio{" + "campus=" + campus + ", area=" + area + ", electricidad=" + electricidad + ", metroscuadrados=" + metroscuadrados + ", estado=" + estado + ", capacidad=" + capacidad + '}';
    }
    public void estadoDeUso(){
        System.out.println("El edificio del area de "+this.area+" y esta "+ this.estado);
    }
    public void condiciones(){
        System.out.println("El edificio del area de "+this.area+" esta en buenas condiciones");
    }
    public void capacidad(){
        System.out.println("El edificio del area de "+this.area+"con una capacidad de "+this.capacidad+"personas");
    }
}
