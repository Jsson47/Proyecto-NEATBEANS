/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negocio.Deuda;
import Servicios.Conexion;
import Servicios.MS_SQLServer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tania Silva
 */
public class BSDatosDeuda {
      private Deuda pt;
    private MS_SQLServer cnx = null; //Manejador de conexión
    private Conexion cnn;
    
    public BSDatosDeuda (){
        pt=null;
    }
    
    public BSDatosDeuda (Deuda pt){
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
        sql = "Insert into Deuda values (?,?,?,?)";
        //Crear la instancia de la clase de conexión
        cnx = new MS_SQLServer ();
        //preparar la consulta indicada en la cadena y los parámetros
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setInt   (1, pt.getCodigo());
        cnx.pst.setString(2, pt.getPlazospago());
        cnx.pst.setDouble(3, pt.getTotalDeuda());
        cnx.pst.setInt   (4, pt.getId_Maestrante());
        return cnx.pst.executeUpdate(); //Procesar la ejecución de consulta
    }
    
     public Deuda leer(int Codigo) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException 
    {
        Deuda p1 = null;
        String sql = "select * from [VistaDeuda] where codigo = ?";
        //Preparar la conexión hacia el SGBD para obtener registros
        //cnx = ServiceFactory.getInstancia().getConexion();
        cnx = new MS_SQLServer ();
           //Procesar la ejecución de la consulta en la base de datos 
        cnx.pst = cnx.conexion.prepareStatement(sql); 
        cnx.pst.setInt(1, Codigo);
        cnx.resultado = cnx.pst.executeQuery();
        //Recorrer los resultados obtenidos en la consulta si los hay 
        if (cnx.resultado.next()){

     p1 = new Deuda (
             cnx.resultado.getInt   ("codigo"),
             cnx.resultado.getString("PlazosMeses"),
             cnx.resultado.getDouble("DeudaTotal"),
             cnx.resultado.getInt   ("ID_Maestrante")
        );
    }//Fin de la instrucción if
    return p1 ;//Retornar el objeto con los valores encontrados
}
       public Deuda leerEstadoCuenta(int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {
        Deuda p1 = null;
        String sql = "select TotalBeca,PatrocinadorBeca from Beca B \n" +
        "JOIN Maestrante M ON B.ID_Maestrante = M.id where NumeroCarnet = ?";
        //Preparar la conexión hacia el SGBD para obtener registros
        //cnx = ServiceFactory.getInstancia().getConexion();
        cnx = new MS_SQLServer();
        //Procesar la ejecución de la consulta en la base de datos 
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setInt(1, NumeroCarnet);
        cnx.resultado = cnx.pst.executeQuery();
        //Recorrer los resultados obtenidos en la consulta si los hay 
        if (cnx.resultado.next()) {

            p1 = new Deuda(
                    cnx.resultado.getDouble("DeudaTotal"),
                    cnx.resultado.getString("PlazosMeses")
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
       String sql = "select * from Deuda";
       
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setInt   (1, pt.getCodigo());
        cnx.pst.setString(2, pt.getPlazospago());
        cnx.pst.setDouble(3,pt.getTotalDeuda());
        cnx.pst.setInt   (4, pt.getId_Maestrante());
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
        String sql = "[ActualizarDeuda] ?, ?, ?, ?";

        cnx = new MS_SQLServer ();
        //preparar la consulta indicada en la cadena y los parámetros
        cnx.pst = cnx.conexion.prepareCall(sql);
        cnx.pst.setString(1, pt.getPlazospago());
        cnx.pst.setDouble(2, pt.getTotalDeuda());
        cnx.pst.setInt   (3, pt.getId_Maestrante());
        cnx.pst.setInt   (4, pt.getCodigo());
        return cnx.pst.executeUpdate(); //Procesar la ejecución de consulta
    }
        
            public int buscarId(int codigo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        int id = 0;

        String sql = "SELECT codigo FROM Deuda WHERE codigo = ?";
        
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
            
             public List<Deuda> listado () throws ClassNotFoundException,
                                                     InstantiationException,
                                                     IllegalAccessException,
                                                     SQLException
    {
       List<Deuda> list = null; //Lista de instancia a retornar
        cnx = new MS_SQLServer (); //Establecer la instancia para la conexión
        //Consultar todos los registros que estan activo para retornarlos
        String sql = "select * from [VistaDeuda] ";
        
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.resultado = cnx.pst.executeQuery();
        
        //Verificar que se obtuvieron registros, si hay se procesan        
        if (cnx.resultado != null){
            list = new ArrayList<>();//ArrayList almacen
            while (cnx.resultado.next()) {
              Deuda p = new Deuda (); 
              p.setCodigo(cnx.resultado.getInt("Codigo"));
              p.setPlazospago(cnx.resultado.getString("PlazosMeses"));
              p.setTotalDeuda(cnx.resultado.getDouble("DeudaTotal"));
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
    
//    public int getCodigo (int codigo) throws java.lang.ClassNotFoundException,
//                                      java.lang.InstantiationException,
//                                      java.lang.IllegalAccessException,
//                                      java.sql.SQLException
//    {
//        int value;
//        //Definir la instancia de conexión con la base de datos
//        cnn = new MS_SQLServer ();
//        /*Esta vez la sentencia es una cadena que invoca un procedimiento 
//          que contiene un parámetro de salida*/
//        String sql = "[IncrementarCodigo] ?";
//        //Invocar a instancia de la clase CallableStatement que ejecuta consulta
//        CallableStatement stmt = cnn.conexion.prepareCall(sql);
//        
//        //Definir el parámetro de salida que se espera del procedimiento
//        stmt.registerOutParameter(1, Types.INTEGER);
//        //Hacer la ejecución del procedimiento almacenado
//        stmt.execute();
//        
//        //recuperar el parámetro que se espera de la salida del procedimiento
//        value = stmt.getInt(1);
//        //Liberar la conexión del Statement
//        stmt.close();
//        //Retornar el valor obtenido
//        return value;
//    }
}
