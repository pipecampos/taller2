
package Modelo;
//(id, nombre,apellido, rut
public class Vendedor {
    private String nombre;
    private String apellido;
    private String rut;
    private int id;

    public Vendedor() {
    }

    public Vendedor(String nombre, String apellido, String rut, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.id = id;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre+" "+ apellido;
    }
    
    
}
