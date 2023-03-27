package entidades;

public class Gerente extends Empleado{
    private Double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double renumeracion, int empleadoId, Double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, renumeracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {return presupuesto;}
    public void setPresupuesto(Double presupuesto) {this.presupuesto = presupuesto;}

    @Override
    public String toString() {
        return String.format("Presupuesto: %s\n",this.presupuesto)  + super.toString();
    }
}
