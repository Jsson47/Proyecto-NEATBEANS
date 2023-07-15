/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negocio.Login;
import Servicios.MS_SQLServer;
import java.sql.SQLException;

/**
 *
 * @author Tania Silva
 */
public class BDLogin {
    
    private Login pt;
    private MS_SQLServer cnx = null; //Manejador de conexión
    
    public BDLogin() {
        pt = null;
    }
    public BDLogin (Login pt){
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
        sql = "INSERT INTO UsuariosRoles (Usuario, Contraseña, Privilegio)";
        sql += "VALUES (?, ?, ?)";
        
        //Crear la instancia de la clase de conexión
        cnx = new MS_SQLServer ();
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, pt.getUsuario());
        cnx.pst.setString(2, pt.getContrasenia());
        cnx.pst.setString(3, "Maestrante");
        return cnx.pst.executeUpdate(); //Procesar la ejecución de consulta
    }
    
//     public  String buscarUsuario (String NumCarnet, String contrasena, String Privilegio)throws ClassNotFoundException,
//                                  InstantiationException,
//                                  IllegalAccessException,
//                                  SQLException{
//        
//        String busqueda_usuario = null;
//          cnx = new MS_SQLServer();
//          try{
//              String sql = ("Select Usuario, Contraseña, Privilegio from UsuariosRoles where Usuario = '"+ NumCarnet +"', Contraseña = '"+contrasena+"'and Privilegio ='"+contrasena+"'");
//             cnx.pst = cnx.conexion.prepareStatement(sql);
//             cnx.resultado = cnx.pst.executeQuery();
//             if(cnx.resultado.next()){             
//                 busqueda_usuario = "Usuario encontrado";                           
//             } else {             
//                     busqueda_usuario = "Usuario no encontrado";   
//             }          
//          }catch(Exception e){
//          System.out.println(e);
//          }
//            return busqueda_usuario;
//        }
    
    public String buscarNombre( String NumCarnet )throws ClassNotFoundException,
                                  InstantiationException,
                                  IllegalAccessException,
                                  SQLException{
        
        String busqueda_nombre = null;
         cnx = new MS_SQLServer();
         
         try{
             String sql = ("Select Nombres, Apellidos from Maestrante where NumeroCarnet = '"+ NumCarnet +"'");
             cnx.pst = cnx.conexion.prepareStatement(sql);
             cnx.resultado = cnx.pst.executeQuery();
             if(cnx.resultado.next()){
             String nombre = (cnx.resultado.getString("Nombres"));
             String Apellidos = (cnx.resultado.getString("Apellidos"));
             busqueda_nombre = (nombre);
             }
         
         }catch(Exception e){
             System.out.println(e);
         }
         return busqueda_nombre;
        }
    
}
