/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Negocio.Login;
import java.sql.SQLException;
/**
 *
 * @author Tania Silva
 */
public class Ctr_Login {
    
     public static int agregar (String Usuario,String Contrasenia) 
                               throws ClassNotFoundException,
                                      InstantiationException,
                                      IllegalAccessException,
                                      SQLException
     
    {
       Login pt = new Login (Usuario,Contrasenia);
       return pt.agregarRegistro(); //Mandar agregar el registro
    }

//       public static Login VerificarRegistro (String Usuario,String Contraseña, String Privilegio) throws 
//                                                    ClassNotFoundException,
//                                                    InstantiationException,
//                                                    InstantiationException,
//                                                    IllegalAccessException,
//                                                    SQLException
//    {
//        Login po = new Login();
//        return (Login) po.VerificarRegistro(Usuario,Contraseña, Privilegio);
//    }
}
