/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negocio.UsuarioMaestrante;
import Servicios.MS_SQLServer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BSDatos {

    
     private UsuarioMaestrante pt;
    private MS_SQLServer cnx = null; //Manejador de conexión
    
    public BSDatos() {
        pt = null;
    }
    public BSDatos (UsuarioMaestrante pt){
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
        sql = "[AgregarMaestrante] ?, ?, ? ,? , ?, ?";
        
        //Crear la instancia de la clase de conexión
        cnx = new MS_SQLServer ();
        cnx.callState = cnx.conexion.prepareCall(sql);
        cnx.callState.setInt   (1, pt.getNumcarnet());
        cnx.callState.setString(2, pt.getNombre());
        cnx.callState.setString(3, pt.getApellido());
        cnx.callState.setDouble(4, pt.getIngresoMaestrante());
        cnx.callState.setString(5, "Activo");
        cnx.callState.setInt   (6, pt.getIdCoordinadador());
        return cnx.callState.executeUpdate(); //Procesar la ejecución de consulta
    }

    public boolean leer () throws ClassNotFoundException,
                                  InstantiationException,
                                  IllegalAccessException,
                                  SQLException
    
    {
       //Instancia de conexión con la base de datos
       cnx = new MS_SQLServer ();
       //Establecer la Sentencia SQL de consulta en la base de datos
       String sql = "SELECT NumeroCarnet FROM Maestrante ";
              sql += "WHERE \"NumeroCarnet\" = ?";
       
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setInt(1, pt.getNumcarnet()); //Indicar el número de INSS
        cnx.resultado = cnx.pst.executeQuery();
        //Retornar el resultado obtenido en la consulta
       return cnx.resultado.next();
    }
    
        public UsuarioMaestrante leer(int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException 
    {
        UsuarioMaestrante p = null;
        String sql = "select * from  [VistaMaestrante] where NumeroCarnet = ?";
        //Preparar la conexión hacia el SGBD para obtener registros
        //cnx = ServiceFactory.getInstancia().getConexion();
        cnx = new MS_SQLServer ();
           //Procesar la ejecución de la consulta en la base de datos 
        cnx.pst = cnx.conexion.prepareStatement(sql); 
        cnx.pst.setInt(1, NumeroCarnet);
        cnx.resultado = cnx.pst.executeQuery();
        //Recorrer los resultados obtenidos en la consulta si los hay 
        if (cnx.resultado.next()){
        //Recuperar los valores del registro y asignar al objeto p
     p = new UsuarioMaestrante ( 
             cnx.resultado.getInt("NumeroCarnet"),
             cnx.resultado.getString("Nombres"),
             cnx.resultado.getString("Apellidos"),
             cnx.resultado.getDouble("Ingresos$"),
             cnx.resultado.getString("Estado"),
             cnx.resultado.getInt("ID_Coordinador")
        );
    }//Fin de la instrucción if
    return p ;//Retornar el objeto con los valores encontrados
}
        
        public int actualizar (int id) throws ClassNotFoundException,
                                 InstantiationException,
                                 IllegalAccessException,
                                 SQLException
    {
     
        //Preparar la consulta de inserción a la base de datos
        String sql = "[Actualizar Maestrante] ?, ?, ?, ?, ?";

        cnx = new MS_SQLServer ();
        //preparar la consulta indicada en la cadena y los parámetros
        cnx.callState = cnx.conexion.prepareCall(sql);
        cnx.callState.setString(1, pt.getNombre());
        cnx.callState.setString(2, pt.getApellido());
        cnx.callState.setDouble(3, pt.getIngresoMaestrante());
        cnx.callState.setInt   (4, pt.getIdCoordinadador());
        cnx.callState.setInt   (5, pt.getNumcarnet());
        return cnx.callState.executeUpdate(); //Procesar la ejecución de consulta
    }
        
            public int buscarId(int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        int id = 0;

        String sql = "SELECT NumeroCarnet FROM Maestrante WHERE NumeroCarnet = ?";
        
        //Preparar la conexión hacia el SGBD para obtener registros
        //cnx = ServiceFactory.getInstancia().getConexion();
        cnx = new MS_SQLServer();
       //Procesar la ejecución de la consulta en la base de datos
       cnx.pst = cnx.conexion.prepareStatement(sql);
       cnx.pst.setInt(1, NumeroCarnet);
       cnx.resultado = cnx.pst.executeQuery();
       
        if (cnx.resultado.next())
        {
            id = cnx.resultado.getInt("NumeroCarnet");
        }

        return id;//Retornar el Id encontrado, asociado al INSS.
    }
            
    public boolean borrar (int NumeroCarnet) throws ClassNotFoundException,
                                            InstantiationException,
                                            IllegalAccessException,
                                            SQLException
    {
        boolean rst = false;  //Variable para indicar el proceso de la consulta
       //Instancia de conexión con la base de datos
       cnx = new MS_SQLServer ();
       String sql;
       UsuarioMaestrante pt = new UsuarioMaestrante();
       sql = "[Baja Maestrante] ?,?";
        //Establecer los parámetros a pasar a la consulta
            cnx.pst = cnx.conexion.prepareCall(sql);
            cnx.pst.setString(1, "Inactivo");
            cnx.pst.setInt   (2, NumeroCarnet);
//            cnx.pst.setInt(2, NumeroCarnet);
        //Retornará verdadero si hubieron registros afectados false sino es así
        return cnx.pst.executeUpdate() > 0; 
    }

    public List<UsuarioMaestrante> listado () throws ClassNotFoundException,
                                                     InstantiationException,
                                                     IllegalAccessException,
                                                     SQLException
    {
       List<UsuarioMaestrante> list = null; //Lista de instancia a retornar
        cnx = new MS_SQLServer (); //Establecer la instancia para la conexión
        //Consultar todos los registros que estan activo para retornarlos
        String sql = "select * from  [VistaMaestrante]";
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.resultado = cnx.pst.executeQuery();
        
        //Verificar que se obtuvieron registros, si hay se procesan        
        if (cnx.resultado != null){
            list = new ArrayList<>();//ArrayList almacen
            while (cnx.resultado.next()) {
              UsuarioMaestrante p = new UsuarioMaestrante (); //Generar instanc
              p.setNumcarnet(cnx.resultado.getInt("NumeroCarnet"));
              p.setNombre(cnx.resultado.getString("Nombres"));
              p.setApellido(cnx.resultado.getString("Apellidos"));
              p.setIngresoMaestrante(cnx.resultado.getDouble("Ingresos$"));
              p.setEstado(cnx.resultado.getString("Estado"));
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
       String sql = "SELECT NumeroCarnet FROM Coordinador";
       
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
//
//   public Object[] Listado() throws ClassNotFoundException,
//            InstantiationException,
//            IllegalAccessException,
//            SQLException {
//        String procedureCall = "SELECT NumeroCarnet, Nombres, Apellidos, Ingresos$, Estado";
//               procedureCall += " FROM Maestrante";
//        cnx = new MS_SQLServer();
//        cnx.pst = cnx.conexion.prepareStatement(procedureCall);
//        cnx.resultado = cnx.pst.executeQuery();
////        cnx.resultado = cnx.resultado.getMetaData();
//        int cantidadColumnas = cnx.rstm.getColumnCount(); //Obtiene el número de columnas de los resultados.
//        ArrayList<Object[]> filas = new ArrayList<>(); //ArrayList para almacenar las filas de resultados.
//
//        while (cnx.resultado.next()) {
//            Object[] fila = new Object[cantidadColumnas];//Arreglo de objetos para almacenar los valores de cada fila.
//            for (int i = 0; i < cantidadColumnas; i++) {
//            
//            }
//            filas.add(fila);
//        }
//
//        Object[] filasArray = filas.toArray(new Object[0]);// Convierte el ArrayList de filas a un arreglo de objetos.
//
//        return filasArray; // Retorna el arreglo de filas.
//    }

    
}