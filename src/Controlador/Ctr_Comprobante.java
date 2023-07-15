/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Negocio.Comprobante;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tania Silva
 */
public class Ctr_Comprobante {
      public static int agregar (String Fecha, Double Monto ,int NumeroComprobante, int Id_Maestrante) 
                               throws ClassNotFoundException,
                                      InstantiationException,
                                      IllegalAccessException,
                                      SQLException
     
    {
       Comprobante pt = new Comprobante (Fecha,Monto,NumeroComprobante, Id_Maestrante);
       return pt.agregarRegistro(); 
    }

       public static void listar (javax.swing.JTable tModel) throws
                                                  ClassNotFoundException,
                                                  InstantiationException,
                                                  InstantiationException,
                                                  IllegalAccessException,
                                                  SQLException
    {
        DefaultTableModel modelo = (DefaultTableModel) tModel.getModel();
        //Obtener la lista de la capa de negocio
            Comprobante po = new Comprobante ();
        List<Comprobante> p = po.leerPersonal();
        
        //Recorrer los elementos de la lista
        for (Comprobante dato : p) {
            modelo.addRow(new Object [] {dato.getFecha(),dato.getNumComprobante(),dato.getMonto()});
        }
    }
              public static ArrayList<String> CargarCombobox () throws ClassNotFoundException,
                                              InstantiationException,
                                              IllegalAccessException,
                                              SQLException
    {
       Comprobante f = new Comprobante ();
       return f.listaNumerocarnet();
    }
}
