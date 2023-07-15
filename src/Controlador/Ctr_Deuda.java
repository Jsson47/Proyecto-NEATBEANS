/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Negocio.Deuda;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tania Silva
 */
public class Ctr_Deuda {
      public static int agregar ( int Codigo,String Plazospago,double TotalDeuda, int Id_Maestrante) 
                               throws ClassNotFoundException,
                                      InstantiationException,
                                      IllegalAccessException,
                                      SQLException
     
    {
       Deuda pt = new Deuda ( Codigo,Plazospago,TotalDeuda, Id_Maestrante);
       return pt.agregarRegistro(); //Mandar agregar el registro
    }
      public static Deuda leerRegistro(int codigo) throws
            ClassNotFoundException, InstantiationException, 
            InstantiationException, IllegalAccessException, SQLException 
    {
        Deuda po = new Deuda();
        return (Deuda) po.leerUsuario(codigo);
    }
      
       public static Deuda leerRegistroEstadoCuenta(int Numeroarnet) throws
            ClassNotFoundException, InstantiationException, 
            InstantiationException, IllegalAccessException, SQLException 
    {
        Deuda po = new Deuda();
        return (Deuda) po.leerUsuarioEstadoCuenta(Numeroarnet);
    }
       
    public static int actualizar(int Codigo,String Plazospago,double TotalDeuda, int Id_Maestrante,int id) throws
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException 
    {
        Deuda pt = new Deuda(Codigo,Plazospago,TotalDeuda, Id_Maestrante);
        return pt.actualizarRegistro(id);
    }

  
        
          public int buscarId(int NumeroCarnet)throws 
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException 
    {
        Deuda pt = new Deuda();
        return pt.buscarId(NumeroCarnet); 
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
        Deuda po = new Deuda ();
        List<Deuda> p = po.leerPersonal();
        
        //Recorrer los elementos de la lista
        for (Deuda dato : p) {
            modelo.addRow(new Object [] {dato.getCodigo(), dato.getPlazospago(), dato.getTotalDeuda()});
        }
        
    }   
           
    public static ArrayList<String> CargarCombobox () throws ClassNotFoundException,
                                              InstantiationException,
                                              IllegalAccessException,
                                              SQLException
    {
       Deuda f = new Deuda ();
       return f.listaNumerocarnet();
    }
    
     public static int generarNumActa ()throws ClassNotFoundException,
                                              InstantiationException,
                                              IllegalAccessException,
                                              SQLException{
        //Crear instancia de la capa de negocio
        Deuda act = new Deuda ();
        return act.getCodigo(); //Obtener el número de acta
    }
}
