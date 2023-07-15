/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Tania Silva
 */
public class MS_SQLServer extends Conexion{
private final boolean isCertificate; //Verificación de certificado de SQL
    private final boolean isEncrypt; //Cifrar la información a procesar
    private final boolean isSecurity; //Conexión por Autenticación Windows
    /* ****************************************************************************
 *                 Constructor para nuevas instancias                         *
/* ****************************************************************************/    
    public MS_SQLServer  () throws ClassNotFoundException,
                                   InstantiationException,
                                   IllegalAccessException,
                                   SQLException
    {
      super (); //Invocar al constructor de la clase padre
      //puerto = 1433; //Puerto por default del SGBD SQL Server
      isCertificate = true; //Indicar que se use el certificado de SQL Server
      isEncrypt = true;  //Indicar que los datos se deben cifrar
      isSecurity = true; //Permitir conexión en SQL Server por Autenticación Win
      this.initdb (); //Método inicializador de la conexión
    }//Fin constructor
    
/* ****************************************************************************
 *        Método de Inicialización de las propiedades de instancia            *
/* ****************************************************************************/
    @Override
    public void initdb () throws ClassNotFoundException,
                                 InstantiationException,
                                 IllegalAccessException,
                                 SQLException
    {
        //jdbc + host + ":" + puerto  + ";" + "databaseName=" + database +
        super.initdb(); //Invocar al método original para inicializar la cadena
        s_conexion +=";trustServerCertificate=" + isCertificate + ";encrypt=" 
                   + isEncrypt + ";integratedSecurity=" + isSecurity;
        //Instancia anonima para conexión
        Class.forName(driver);
        conexion = DriverManager.getConnection(s_conexion);      
    }
}
