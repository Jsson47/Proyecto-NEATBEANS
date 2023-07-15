/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Negocio.Consolidado;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tania Silva
 */
public class Ctr_Consolidado {
   
      
            public static void listarConsolidado (javax.swing.JTable tModel) throws
                                                  ClassNotFoundException,
                                                  InstantiationException,
                                                  InstantiationException,
                                                  IllegalAccessException,
                                                  SQLException
    {
        DefaultTableModel modelo = (DefaultTableModel) tModel.getModel();
        //Obtener la lista de la capa de negocio
        Consolidado po = new Consolidado ();
        List<Consolidado> p = po.leerConsolidado();
        
        //Recorrer los elementos de la lista
        for (Consolidado dato : p) {
            modelo.addRow(new Object [] {dato.getNCarnet(),dato.getNombres(),dato.getApellidos(),dato.getIngresos(),dato.getBecaOtorgada()
            ,dato.getDeuda(), dato.getPlazosMeses(), dato.getPagoPendiente()});
        }
        
    } 
}
