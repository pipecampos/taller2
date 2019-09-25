
package Modelo;

public class Venta {
    private String sucursal;
    private int monto;
    private String fecha;
    private int idVenta;

    public Venta() {
    }

    public Venta(String sucursal, int monto, String fecha, int idVenta) {
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
        this.idVenta = idVenta;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

  

  
    
}
