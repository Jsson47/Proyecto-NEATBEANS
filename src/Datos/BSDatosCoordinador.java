/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negocio.UsuarioCoordinador;
import Servicios.MS_SQLServer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BSDatosCoordinador {
     private UsuarioCoordinador pt;
    private MS_SQLServer cnx = null; //Manejador de conexión
 
    
    public BSDatosCoordinador() {
        pt = null;
    }
    public BSDatosCoordinador (UsuarioCoordinador pt){
        this.pt = pt;
    }//Fin constructor
    
    public int guardar () throws ClassNotFoundException,
                                 InstantiationException,
                                 IllegalAccessException,
                                 SQLException
    {
        String sql;
        //Preparar la consulta de inserción a la base de datos
        sql = "[Insertar Coordinador] ?, ?, ?, ?, ?, ?";
        
        //Crear la instancia de la clase de conexión
        cnx = new MS_SQLServer ();
        //preparar la consulta indicada en la cadena y los parámetros
        cnx.callState = cnx.conexion.prepareCall(sql);
        cnx.callState.setInt (1, pt.getNumeroCarnet());
        cnx.callState.setString(2, pt.getNombres());
        cnx.callState.setString(3, pt.getApellidos());
        cnx.callState.setString(4, pt.getFechaInicioCorte());
        cnx.callState.setString(5, pt.getFechaFinCorte());
        cnx.callState.setString(6, "Activo");
        return cnx.callState.executeUpdate(); //Procesar la ejecución de consulta
    }

        public UsuarioCoordinador leer(int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException 
    {
        UsuarioCoordinador p = null;
        String sql = "select * from  [VistaCoordinador] where NumeroCarnet = ?";
        //Preparar la conexión hacia el SGBD para obtener registros
        cnx = new MS_SQLServer ();
           //Procesar la ejecución de la consulta en la base de datos 
        cnx.pst = cnx.conexion.prepareStatement(sql); 
        cnx.pst.setInt(1, NumeroCarnet);
        cnx.resultado = cnx.pst.executeQuery();
        //Recorrer los resultados obtenidos en la consulta si los hay 
        if (cnx.resultado.next()){
        //Recuperar los valores del registro y asignar al objeto p
     p = new UsuarioCoordinador ( 
             cnx.resultado.getString("Nombres"),
             cnx.resultado.getString("Apellidos"),
             cnx.resultado.getString("FechaInicioCorte"),
             cnx.resultado.getString("FechaFinCorte"),
             cnx.resultado.getString("Estado"),
             cnx.resultado.getInt   ("NumeroCarnet")
        );
    }//Fin de la instrucción if
    return p ;//Retornar el objeto con los valores encontrados
}
       
        public boolean leer () throws ClassNotFoundException,
                                  InstantiationException,
                                  IllegalAccessException,
                                  SQLException
    
    {
       //Instancia de conexión con la base de datos
       cnx = new MS_SQLServer ();
       //Establecer la Sentencia SQL de consulta en la base de datos
       String sql = "SELECT NumeroCarnet FROM Coordinador ";
              sql += "WHERE \"NumeroCarnet\" = ?";
       
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setInt(1, pt.getNumeroCarnet()); //Indicar el número de INSS
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
        String sql = "[Actualizar Coordinador] ?, ?, ?, ?, ?";

        cnx = new MS_SQLServer ();
        //preparar la consulta indicada en la cadena y los parámetros
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, pt.getNombres());
        cnx.pst.setString(2, pt.getApellidos());
        cnx.pst.setString(3, pt.getFechaInicioCorte());
        cnx.pst.setString(4, pt.getFechaFinCorte()); 
        cnx.pst.setInt   (5, pt.getNumeroCarnet());
        return cnx.pst.executeUpdate(); //Procesar la ejecución de consulta
    }
        
            public int buscarId(int NumeroCarnet) throws ClassNotFoundException,
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
       
       sql = "[BajaCoordinador] ?,?";
        //Establecer los parámetros a pasar a la consulta
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, "Inactivo");
            cnx.pst.setInt   (2, NumeroCarnet);
        //Retornará verdadero si hubieron registros afectados false sino es así
        return cnx.pst.executeUpdate() > 0; 
    }
            
             public List<UsuarioCoordinador> listado () throws ClassNotFoundException,
                                                     InstantiationException,
                                                     IllegalAccessException,
                                                     SQLException
    {
        List<UsuarioCoordinador> list = null; //Lista de instancia a retornar
        cnx = new MS_SQLServer (); //Establecer la instancia para la conexión
        //Consultar todos los registros que estan activo para retornarlos
        String sql = "select * from [VistaCoordinador]";
        
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.resultado = cnx.pst.executeQuery();
          
        if (cnx.resultado != null){
            list = new ArrayList<>();
            while (cnx.resultado.next()) {
              UsuarioCoordinador p = new UsuarioCoordinador (); //Generar instanc
              p.setNumeroCarnet(cnx.resultado.getInt("NumeroCarnet"));
              p.setNombres(cnx.resultado.getString("Nombres"));
              p.setApellidos(cnx.resultado.getString("Apellidos"));
              p.setFechaInicioCorte(cnx.resultado.getString("FechaInicioCorte"));
              p.setFechaFinCorte(cnx.resultado.getString("FechaFinCorte"));
              p.setEstado(cnx.resultado.getString("Estado"));
              list.add(p); //Agregar el resultado a la lista
            }//Fin de la instrucción While
        }
         return list;
    }
        
}
