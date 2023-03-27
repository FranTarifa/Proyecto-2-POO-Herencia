package entidades;

public class Empleado extends Persona{
    private Double renumeracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double renumeracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.renumeracion = renumeracion;
        this.empleadoId = empleadoId;
    }


    public Double getRenumeracion() {return renumeracion;}

    public void setRenumeracion(Double renumeracion) {this.renumeracion = renumeracion;}

    public int getEmpleadoId() {return empleadoId;}

    public void setEmpleadoId(int empleadoId) {this.empleadoId = empleadoId;}

    public int aumentarRenumeracion(double porcentaje) {
        double aumento = this.renumeracion * porcentaje / 100;
        this.setRenumeracion(this.renumeracion + aumento);
        return (int) aumento;
    }

    @Override
    public String toString() {
        return String.format("Renumeración: %s\nId del empleado: %s", this.renumeracion, this.empleadoId) + super.toString();
    }
}
