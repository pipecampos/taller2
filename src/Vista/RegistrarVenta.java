package vista;
import Controlador.VendedorController;
import Controlador.VentaController;
import Dao.VendedorDao;
import Dao.VentaDao;
import javax.swing.*;
import Modelo.Vendedor;
import Modelo.Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *
 * @author Marcelo Esperguel
 */
public class RegistrarVenta extends JFrame {

    private JTextField fechaTf;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField montoTf;
    private JButton registrarVentaButton;
    private JComboBox<String> sucursalCb;
    private JComboBox<Vendedor> vendedorCb;
 
    
  

    RegistrarVenta(VentaDao ventas, VendedorDao vendedor) {
        super("Registrar nueva venta");
        
        initComponents();  
        registrarVentaButton.addActionListener(new VentaController(this));
     }

    public RegistrarVenta() {
       initComponents();
    }

    
    
      private void initComponents() {

        registrarVentaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vendedorCb = new javax.swing.JComboBox<>();
        sucursalCb = new javax.swing.JComboBox<String>();
        fechaTf = new javax.swing.JTextField();
        montoTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registrarVentaButton.setText("Registrar");

        jLabel1.setText("Vendedor:");

        jLabel2.setText("Sucursal:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Monto:");
        
        sucursalCb.addItem("Centro");
        sucursalCb.addItem("Portal Temuco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vendedorCb, 0, 174, Short.MAX_VALUE)
                            .addComponent(sucursalCb)
                            .addComponent(fechaTf)
                            .addComponent(montoTf)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(registrarVentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(vendedorCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sucursalCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(fechaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(montoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registrarVentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        
       
    }

    public JTextField getFechaTf() {
        return fechaTf;
    }

    public void setFechaTf(JTextField fechaTf) {
        this.fechaTf = fechaTf;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JTextField getMontoTf() {
        return montoTf;
    }

    public void setMontoTf(JTextField montoTf) {
        this.montoTf = montoTf;
    }

    public JButton getRegistrarVentaButton() {
        return registrarVentaButton;
    }

    public void setRegistrarVentaButton(JButton registrarVentaButton) {
        this.registrarVentaButton = registrarVentaButton;
    }

    public JComboBox<String> getSucursalCb() {
        return sucursalCb;
    }

    public void setSucursalCb(JComboBox<String> sucursalCb) {
        this.sucursalCb = sucursalCb;
    }

    public JComboBox<Vendedor> getVendedorCb() {
        return vendedorCb;
    }

    public void setVendedorCb(JComboBox<Vendedor> vendedorCb) {
        this.vendedorCb = vendedorCb;
    }

    
 
    
}
