/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Negocio.UsuarioMaestrante;
import java.sql.SQLException;
/**
 *
 * @author Tania Silva
 */
public class Ctr_Maestrante {

    public static int agregar (String nombre, String apellido, 
                               int numcarnet,int becaotorgada, double ingresoMaestrante
                               ) 
                               throws ClassNotFoundException,
                                      InstantiationException,
                                      IllegalAccessException,
                                      SQLException
     
    {
       UsuarioMaestrante pt = new UsuarioMaestrante (nombre,apellido,numcarnet,becaotorgada,ingresoMaestrante);
       return pt.agregarRegistro(); //Mandar agregar el registro
    }
}
