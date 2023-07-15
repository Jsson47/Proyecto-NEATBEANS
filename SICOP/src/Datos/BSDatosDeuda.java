/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negocio.Deuda;
import Servicios.MS_SQLServer;
import java.sql.SQLException;

/**
 *
 * @author Tania Silva
 */
public class BSDatosDeuda {
      private Deuda pt;
    private MS_SQLServer cnx = null; //Manejador de conexión
    
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
        sql = "INSERT INTO usuario (plazo de meses, total deuda)";
        sql += "VALUES (?, ?)";
        //Crear la instancia de la clase de conexión
        cnx = new MS_SQLServer ();
        //preparar la consulta indicada en la cadena y los parámetros
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setInt(1, pt.getPlazospago());
        cnx.pst.setInt(2, pt.getTotalDeuda());
        cnx.pst.setInt(2, 1); //Indica que el registro esta activo
        return cnx.pst.executeUpdate(); //Procesar la ejecución de consulta
    }
}
