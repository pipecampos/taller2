
package Dao;

import Modelo.Venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class VentaDao {
    Conexion con;
    
    public ArrayList<Venta> getVenta(int idVenta){
        
        ArrayList<Venta> ventas = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try{
             String sql="SELECT * FROM venta WHERE id_venta = "+idVenta;
            
           
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);
           
            
            while ( resultados.next() ) {
                String sucursal = resultados.getString("sucursal");
                int monto = resultados.getInt("monto");
                String fecha = resultados.getString("fecha");
                int idVenta2 = resultados.getInt("id_venta");
               
                ventas.add(new Venta(sucursal, monto,fecha,idVenta2)); 
            }
            accesoBD.close();
            return ventas;
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
      }
    
    public boolean registrarVenta(Venta v){ 
         Connection accesoBD = con.getConexion();
         
         try{
             
             String sql = "INSERT INTO venta(sucursal,monto,fecha,id_venta) " + "VALUES ('"+v.getSucursal()+"',"+v.getMonto()+",'"+v.getFecha()+"',"+v.getIdVenta()+")";
             Statement st = accesoBD.createStatement();
             st.executeUpdate(sql); 
             System.out.println("Se ha agregado");
             return true;
             
         
         }catch(Exception e){
             System.out.println();
             System.out.println("Error al obtener");
             e.printStackTrace();
             return false;
         }
    }
    public ArrayList<Venta> getMes(String mes){
        
        ArrayList<Venta> ventas = new ArrayList<>();
        Connection accesoBD = con.getConexion();
        String mesNumero = transformaMes(mes);

        try{
            String sql="SELECT * FROM venta WHERE fecha BETWEEN '2019-"+mesNumero+"-01' AND '2019-"+mesNumero+"-31"; 
            
    
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);
           
            
            while ( resultados.next() ) {
                String sucursal = resultados.getString("sucursal");
                int monto = resultados.getInt("monto");
                String fecha = resultados.getString("fecha");
                int idVenta = resultados.getInt("id_venta");
               
                ventas.add(new Venta(sucursal, monto,fecha,idVenta));
            }
            accesoBD.close();
            return ventas;
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
      }

    
    private String transformaMes(String fecha){
        
        if("Enero".equals(fecha)){
          return "01";
        }
         if("Febrero".equals(fecha)){
          return "02";
        }
          if("Marzo".equals(fecha)){
          return "03";
        }
         if("Abril".equals(fecha)){
          return "04";
        }
        if("Mayo".equals(fecha)){
          return "05";
        }
         if("Junio".equals(fecha)){
          return "06";
        }
        if("Julio".equals(fecha)){
          return "07";
        }
        if("Agosto".equals(fecha)){
          return "08";
        }
         if("Septiembre".equals(fecha)){
          return "09";
        }
        if("Octubre".equals(fecha)){
          return "10";
        }
         if("Noviembre".equals(fecha)){
          return "11";
        }
        if("Diciembre".equals(fecha)){
          return "12";
        }
        return null;
        
    
    }

   

    
}