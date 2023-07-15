/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negocio.Beca;
import Servicios.MS_SQLServer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ESTUDIANTES
 */
public class BDBeca {
    private Beca pt;
    private MS_SQLServer cnx = null; //Manejador de conexión
    
    public BDBeca (){
        pt=null;
    }
    
    public BDBeca (Beca pt){
        this.pt = pt;
    }//Fin constructor
    
    /* ************************************************************************/
    /*                      Métodos de Instancia                              */
    /* ************************************************************************/
    public int guardar () throws ClassNotFoundException,
                                 InstantiationException,
                                 IllegalAccessException,
                                 SQLException
    {
        String sql;
        //Preparar la consulta de inserción a la base de datos
        sql = "[Agregar Beca] ?, ?, ?, ?";
        //Crear la instancia de la clase de conexión
        cnx = new MS_SQLServer ();
        //preparar la consulta indicada en la cadena y los parámetros
        cnx.callState = cnx.conexion.prepareCall(sql);
        cnx.callState.setInt   (1, pt.getCodigo());
        cnx.callState.setString(2, pt.getPatrocinadoresBecas());
        cnx.callState.setInt   (3, pt.getBeca());
        cnx.callState.setInt   (4, pt.getID_Maestrante());
        return cnx.callState.executeUpdate(); //Procesar la ejecución de consulta
    }
    
     public Beca leer(int Codigo) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException 
    {
        Beca p1 = null;
        String sql = "select * from [VistaCodigo] where codigo = ?";
        //Preparar la conexión hacia el SGBD para obtener registros
        //cnx = ServiceFactory.getInstancia().getConexion();
        cnx = new MS_SQLServer ();
           //Procesar la ejecución de la consulta en la base de datos 
        cnx.pst = cnx.conexion.prepareStatement(sql); 
        cnx.pst.setInt (1, Codigo);
        cnx.resultado = cnx.pst.executeQuery();
        //Recorrer los resultados obtenidos en la consulta si los hay 
        if (cnx.resultado.next()){

     p1 = new Beca (
             cnx.resultado.getInt   ("codigo"),
             cnx.resultado.getString("PatrocinadorBeca"),
             cnx.resultado.getInt("TotalBeca"),
             cnx.resultado.getInt("ID_Maestrante")
        );
    }//Fin de la instrucción if
    return p1 ;//Retornar el objeto con los valores encontrados
}
  
    public Beca leerEstadoCuenta(int Numerocarnet) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {
        Beca p1 = null;
        String sql = "select DeudaTotal,PlazosMeses from Deuda D \n"
                + "JOIN Maestrante M ON D.ID_Maestrante = M.id where NumeroCarnet = ?";
        
        //Preparar la conexión hacia el SGBD para obtener registros
        //cnx = ServiceFactory.getInstancia().getConexion();
        cnx = new MS_SQLServer();
        //Procesar la ejecución de la consulta en la base de datos 
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setInt(1, Numerocarnet);
        cnx.resultado = cnx.pst.executeQuery();
        //Recorrer los resultados obtenidos en la consulta si los hay 
        if (cnx.resultado.next()) {

            p1 = new Beca(
                    cnx.resultado.getInt("TotalBeca"),
                    cnx.resultado.getString("PatrocinadorBeca")
            );
        }//Fin de la instrucción if
        return p1;//Retornar el objeto con los valores encontrados
    }
     public boolean leer () throws ClassNotFoundException,
                                  InstantiationException,
                                  IllegalAccessException,
                                  SQLException
    
    {
       //Instancia de conexión con la base de datos
       cnx = new MS_SQLServer ();
       //Establecer la Sentencia SQL de consulta en la base de datos
       String sql = "select * from [VistaBeca] where codigo = ?";
       
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setInt(1, pt.getCodigo()); //Indicar el número de INSS
        cnx.resultado = cnx.pst.executeQuery();
        //Retornar el resultado obtenido en la consulta
       return cnx.resultado.next();
    }
     
      public int actualizar (int id) throws ClassNotFoundException,
                                 InstantiationException,
                                 IllegalAccessException,
                                 SQLException
    {
     
        //Preparar la consulta de inserción a la base de datos
        String sql = "[ActualizaBeca] ?, ?, ?, ?";

        cnx = new MS_SQLServer ();
        //preparar la consulta indicada en la cadena y los parámetros
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, pt.getPatrocinadoresBecas());
        cnx.pst.setInt   (2, pt.getBeca());
        cnx.pst.setInt   (3, pt.getID_Maestrante());
        cnx.pst.setInt   (4, pt.getCodigo());
        return cnx.pst.executeUpdate(); //Procesar la ejecución de consulta
    }
        
            public int buscarId(int codigo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        int id = 0;

        String sql = "SELECT NumeroCarnet FROM Coordinador WHERE NumeroCarnet = ?";
        
        //Preparar la conexión hacia el SGBD para obtener registros
        //cnx = ServiceFactory.getInstancia().getConexion();
        cnx = new MS_SQLServer();
       //Procesar la ejecución de la consulta en la base de datos
       cnx.pst = cnx.conexion.prepareStatement(sql);
       cnx.pst.setInt(1, codigo);
       cnx.resultado = cnx.pst.executeQuery();
       
        if (cnx.resultado.next())
        {
            id = cnx.resultado.getInt("codigo");
        }

        return id;//Retornar el Id encontrado, asociado al INSS.
    }
            
             public List<Beca> listado () throws ClassNotFoundException,
                                                     InstantiationException,
                                                     IllegalAccessException,
                                                     SQLException
    {
       List<Beca> list = null; //Lista de instancia a retornar
        cnx = new MS_SQLServer (); //Establecer la instancia para la conexión
        //Consultar todos los registros que estan activo para retornarlos
        String sql = "select Codigo from Beca";
        
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.resultado = cnx.pst.executeQuery();
        
        //Verificar que se obtuvieron registros, si hay se procesan        
        if (cnx.resultado != null){
            list = new ArrayList<>();//ArrayList almacen
            while (cnx.resultado.next()) {
              Beca p = new Beca (); 
              p.setCodigo(cnx.resultado.getInt("Codigo"));
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
