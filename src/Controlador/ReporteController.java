/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.VentaDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Home;
import vista.Reporte;

public class ReporteController implements ActionListener{

    Reporte reporte;

    public ReporteController(Reporte reporte) {
        this.reporte = reporte;
    }

    public ReporteController(Home aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Obtener")){ 
            
          String mes = reporte.getMesesCb().getSelectedItem().toString();
          VentaDao ventaDao = new VentaDao();
          ventaDao.getMes(mes);
          JOptionPane.showMessageDialog(null, "hecho");
          
           
        }
    }    
}
