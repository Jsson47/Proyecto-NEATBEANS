/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negocio.UsuarioMaestrante;
import Servicios.MS_SQLServer;
import java.sql.SQLException;


public class BSDatos {
    
     private UsuarioMaestrante pt;
    private MS_SQLServer cnx = null; //Manejador de conexión
    
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
        sql = "INSERT INTO Colaborador (Nombre, Apellido, "
            + "NumCarnet)";
        sql += "VALUES (?, ?, ?, ?, ?)";
        
        //Crear la instancia de la clase de conexión
        cnx = new MS_SQLServer ();
        //preparar la consulta indicada en la cadena y los parámetros
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, pt.getNombre());
        cnx.pst.setString(2, pt.getApellido());
        cnx.pst.setInt(3, pt.getNumcarnet());
        cnx.pst.setDouble(4, pt.getIngresoMaestrante());
        cnx.pst.setDouble(5, pt.getBecaotorgada());
        cnx.pst.setInt(5, 1); //Indica que el registro esta activo
        return cnx.pst.executeUpdate(); //Procesar la ejecución de consulta
    }

}
