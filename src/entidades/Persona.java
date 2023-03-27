package entidades;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return String.format("\nNombre: %s\nApellido: %s\nN° Fiscal: %s\nDirección: %s",
                this.nombre, this.apellido, this.numeroFiscal, this.direccion);
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getNumeroFiscal() {return numeroFiscal;}

    public void setNumeroFiscal(String numeroFiscal) {this.numeroFiscal = numeroFiscal;}

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}
}
