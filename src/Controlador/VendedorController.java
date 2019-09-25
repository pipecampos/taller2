/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.VendedorDao;
import Modelo.Vendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Logger;
import vista.Home;
import vista.RegistrarVenta;
import vista.Reporte;

/**
 *
 * @author pipe
 */
public class VendedorController implements ActionListener {
    Home home;
    VendedorDao vendedor;
    ArrayList<Vendedor> vendedores;
    RegistrarVenta registrarVenta;

    public VendedorController(Home home, VendedorDao vendedor, ArrayList<Vendedor> vendedores, RegistrarVenta registrarVenta) {
        this.home = home;
        this.vendedor = vendedor;
        this.vendedores = vendedores;
        this.registrarVenta = registrarVenta;
    }

     public VendedorController(Home home) {
        this.home = home;
    }  

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Registrar Venta")){  
          RegistrarVenta venta = new RegistrarVenta();
           /*vendedores = vendedor.getVendedores();
            for (int i = 0; i < vendedores.size(); i++) {
                Vendedor v = vendedores.get(i);
                registrarVenta.getVendedorCb().addItem(v);
               }*/
          venta.setVisible(true);
        }
        if(ae.getActionCommand().equals("Ver Reporte")){
          Reporte reporte = new Reporte();
          reporte.setVisible(true);
        }
    }
    
    
}
