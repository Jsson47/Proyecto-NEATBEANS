/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Tania Silva
 */
public class Conexion {
    
    public Connection conexion = null; //Tipo Connection con el motor de BD
    public PreparedStatement pst;      //Ejecutor de sentencia SQL
    public String s_conexion = null;   
    public ResultSet resultado = null ;//Resultados obtenidos de una consulta
/* ****************************************************************************
 *    Variable de instancia para operar con la Base de Datos                  *
/* ****************************************************************************/           
    protected String jdbc;
    protected String driver;
    protected String host;
    protected String database;
    protected int puerto;
    protected String username;
    protected String password;
    protected String un_sql;
    protected String intSegurity;
    
/* ****************************************************************************
 *     Constructor de nuevas instancias                                       *
/* ****************************************************************************/  
    /**
     * Crea instancias de conexiÃ³n para cualquier tipo de gestor de base de 
     * datos
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws java.sql.SQLException 
     */
    public Conexion() throws java.lang.ClassNotFoundException,
                             java.lang.InstantiationException,
                             java.lang.IllegalAccessException, 
                             java.sql.SQLException
    {
        jdbc =System.getProperty("jdbc");
        driver = System.getProperty("driver");
        host= System.getProperty("databasehost");
        database = System.getProperty("database");
        puerto = Integer.parseInt(System.getProperty("port"));
        username = System.getProperty("username");
        password = System.getProperty("password");
        intSegurity = System.getProperty("true");
    }//Fin del constructor
    
/* ****************************************************************************
 *              Método Inicializador de nuevas instancias                     *
/* ****************************************************************************/
    public void initdb () throws java.lang.ClassNotFoundException,
                                 java.lang.InstantiationException,
                                 java.lang.IllegalAccessException,
                                 java.sql.SQLException
    {
        s_conexion = jdbc + host + ":" + puerto + ";" + "databaseName=" 
                   + database;
    }
}
