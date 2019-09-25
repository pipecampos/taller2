/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.VentaDao;
import Modelo.Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Home;
import vista.RegistrarVenta;

public class VentaController implements ActionListener {
    
    RegistrarVenta venta;

    public VentaController(RegistrarVenta venta) {
        this.venta = venta;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getActionCommand().equals("Registrar")){
            int vendedor = venta.getVendedorCb().getSelectedIndex();
            int sucursal = venta.getSucursalCb().getSelectedIndex();
            String fecha = venta.getFechaTf().getText();
            int monto = Integer.parseInt(venta.getMontoTf().getText());
            
            Venta v = new Venta();
            
            v.setFecha(fecha);
            v.setMonto(monto);
            if(sucursal==0){
             v.setSucursal("Centro");
            }else{
             v.setSucursal("Portal Temuco");
            }
           v.setIdVenta(0);
          VentaDao ventaDao = new VentaDao();
          ventaDao.registrarVenta(v);
          
          
        }
    }
    
    
    
}
