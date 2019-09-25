
package Dao;
import Modelo.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class VendedorDao {

    
    Conexion con;

    public VendedorDao() {
        this.con = new Conexion();
    }
       
    public Vendedor getVendedor(int id){
        Vendedor p; // se prepara donde se guardará la persona
        Connection accesoBD = con.getConexion();
        
      try{
            String sql="SELECT * FROM vendedor WHERE id = "+id; 
            
   
            Statement st = accesoBD.createStatement(); //objeto que administra las consultas
            ResultSet resultados = st.executeQuery(sql); //es una lista de resultados
            
           if (resultados.first()){ //método para encontrar el primer valor con el que se está comparando (el id)
            
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String rut = resultados.getString("rut");
              
                
                p = new Vendedor (nombre, apellido, rut, id);
                return p;
       
        }else{
           return null;
           }
        }catch (Exception e){ 
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
}
    public ArrayList<Vendedor> getVendedores(){
        
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try{
            String sql="SELECT * FROM personas ";
            
            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);
           
            
            while ( resultados.next() ) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String rut = resultados.getString("edad");
                //int ID = Integer.parseInt(resultados.getString("ID")); esto aún no lo usamos
                int ID = resultados.getInt("ID");
               
                vendedores.add(new Vendedor(nombre, apellido,rut,ID));
            }
            accesoBD.close();
            return vendedores;
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
      }
    

   
  }