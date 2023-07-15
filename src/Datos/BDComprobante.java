/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negocio.Comprobante;
import Servicios.MS_SQLServer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tania Silva
 */
public class BDComprobante {
      private Comprobante pt;
    private MS_SQLServer cnx = null; //Manejador de conexión
    
    public BDComprobante (){
        pt=null;
    }
    
    public BDComprobante (Comprobante pt){
        this.pt = pt;
    }//Fin constructor
    
      public int guardar () throws ClassNotFoundException,
                                 InstantiationException,
                                 IllegalAccessException,
                                 SQLException
    {
        String sql;
        //Preparar la consulta de inserción a la base de datos
        sql = "[Agregar Comprobante] ?, ?, ?, ?";
        //Crear la instancia de la clase de conexión
        cnx = new MS_SQLServer ();
        //preparar la consulta indicada en la cadena y los parámetros
        cnx.callState = cnx.conexion.prepareCall(sql);
        cnx.callState.setString  (1, pt.getFecha());
        cnx.callState.setDouble  (2, pt.getMonto());
        cnx.callState.setInt     (3, pt.getNumComprobante());
        cnx.callState.setInt     (4, pt.getId_Maestrante());
        return cnx.callState.executeUpdate(); //Procesar la ejecución de consulta
    }
       
       public List<Comprobante> listado () throws ClassNotFoundException,
                                                     InstantiationException,
                                                     IllegalAccessException,
                                                     SQLException
    {
       List<Comprobante> list = null; //Lista de instancia a retornar
        cnx = new MS_SQLServer (); //Establecer la instancia para la conexión
        //Consultar todos los registros que estan activo para retornarlos
        String sql = "SELECT Fecha, NumeroComprobante, Monto";
               sql += " FROM Comprobante";
        
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.resultado = cnx.pst.executeQuery();
        
        //Verificar que se obtuvieron registros, si hay se procesan        
        if (cnx.resultado != null){
            list = new ArrayList<>();//ArrayList almacen
            while (cnx.resultado.next()) {
              Comprobante p = new Comprobante (); 
              p.setFecha(cnx.resultado.getString("Fecha"));
              p.setMonto(cnx.resultado.getDouble("Monto"));
              p.setNumComprobante(cnx.resultado.getInt("NumeroComprobante"));
              list.add(p); //Agregar el resultado a la lista
            }//Fin de la instrucción While
        }
         return list;
    }
       
       //-----Llenado de Combobox-----//
    
    public ArrayList<String> leerNumeroCarnet () 
                                    throws java.lang.ClassNotFoundException,
                                           java.lang.InstantiationException,
                                           java.lang.IllegalAccessException,
                                           java.sql.SQLException
                                           
    {
      //Definir el ArrayList que contendra los nombres de la Facultad
        ArrayList<String> lstFact = null;        
      //Crear la instancia de conexión
        cnx = new MS_SQLServer ();
      //Definir el String que se encarga de llamar a la vista
       String sql = "SELECT NumeroCarnet FROM Maestrante";
       
       cnx.pst = cnx.conexion.prepareStatement(sql);
       cnx.resultado = cnx.pst.executeQuery();
       
       //Verificar resultados de la consulta
       if (cnx.resultado != null)
       {
           lstFact = new ArrayList<> ();
           while (cnx.resultado.next()) {
               lstFact.add(cnx.resultado.getString("NumeroCarnet"));
           }//Fin de la instrucción while
       }//Fin del condicional if
      return lstFact; 
    }
       
     
}
