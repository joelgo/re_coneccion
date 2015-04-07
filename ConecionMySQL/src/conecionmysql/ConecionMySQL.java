
package conecionmysql;

import java.sql.ResultSet;
import java.sql.Statement;




public class ConecionMySQL {

   
    public static void main(String[] args) {
      //Conexion conexion= new Conexion();
      //conexion.conectar();
      
         if (Conexion.conectar()==null) { // se hace el llamado al metodo
            System.out.println("Coneccion fallida");
            
          } else {
            
            System.out.println("Coneccion exitosa"); 
          }
        
           try {
           
           Statement st= Conexion.conectar().createStatement(); // es el camino para poder llegar asta la base de datosss , es el que nos permite ir hacia la base de datos
               ResultSet rs= st.executeQuery("Select * from persona"); // para regresar los datosss que se fueron a traer de la base de datos
               while (rs.next()) {                   
                   System.out.println("ID:"+rs.getInt("idpersona")+"Nombre:"+rs.getString("nombre")+"Apellido Paterno:"+rs.getString("apellido_pat")+
                           "Apellido Materno:"+rs.getString("apellido_mat")+"DNI:"+rs.getString("dni"));
                 }
               Conexion.conectar().close();
            } catch (Exception e) {
                e.printStackTrace();
               try {
                  Conexion.conectar().close(); 
               } catch (Exception ex) {
               }
            
        
       
            
        }
    }
    

