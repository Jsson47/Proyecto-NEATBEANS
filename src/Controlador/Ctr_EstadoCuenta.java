/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Negocio.EstadoCuenta;
import Negocio.UsuarioMaestrante;
import java.sql.SQLException;

/**
 *
 * @author Tania Silva
 */
public class Ctr_EstadoCuenta {
    
   public static EstadoCuenta leerRegistro(int NumeroCarnet) throws
            ClassNotFoundException, InstantiationException, 
            InstantiationException, IllegalAccessException, SQLException 
    {
        EstadoCuenta po = new EstadoCuenta();
        return (EstadoCuenta) po.leerUsuarioEstadocuenta(NumeroCarnet);
    } 
   
//   public static EstadoCuenta EstadoCuenta(int NumeroCarnet) throws
//            ClassNotFoundException, InstantiationException, 
//            InstantiationException, IllegalAccessException, SQLException 
//    {
//        EstadoCuenta po = new EstadoCuenta();
//        return (EstadoCuenta) po.EstadoCuenta(NumeroCarnet);
//    } 
}
