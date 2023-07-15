/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Negocio.Deuda;
import java.sql.SQLException;

/**
 *
 * @author Tania Silva
 */
public class Ctr_Deuda {
      public static int agregar (int plazomeses,int totaldeuda) 
                               throws ClassNotFoundException,
                                      InstantiationException,
                                      IllegalAccessException,
                                      SQLException
     
    {
       Deuda pt = new Deuda (plazomeses,totaldeuda);
       return pt.agregarRegistro(); //Mandar agregar el registro
    }
}
