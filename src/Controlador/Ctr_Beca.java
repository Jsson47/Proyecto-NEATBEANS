/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Negocio.Beca;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Tania Silva
 */
public class Ctr_Beca {
      public static int agregar (int Codigo, String PatrocinadoresBecas, int Beca, int ID_Maestrante) 
                               throws ClassNotFoundException,
                                      InstantiationException,
                                      IllegalAccessException,
                                      SQLException
     
    {
       Beca pt = new Beca (Codigo,PatrocinadoresBecas,Beca,ID_Maestrante);
       return pt.agregarRegistro(); //Mandar agregar el registro
    }
      public static Beca leerRegistro(int Codigo) throws
            ClassNotFoundException, InstantiationException, 
            InstantiationException, IllegalAccessException, SQLException 
    {
        Beca po = new Beca();
        return (Beca) po.leerUsuario(Codigo);
    }

        public static Beca leerRegistroeEstadoCuenta(int Numerocarnet) throws
            ClassNotFoundException, InstantiationException, 
            InstantiationException, IllegalAccessException, SQLException 
    {
        Beca po = new Beca();
        return (Beca) po.leerUsuarioEstadouenta(Numerocarnet);
    }
        
       public static int actualizar(int Codigo,String PatrocinadoresBecas, int Beca, int ID_Maestrante,int id) throws
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException 
    {
        Beca pt = new Beca(Codigo, PatrocinadoresBecas, Beca,ID_Maestrante);
        return pt.actualizarRegistro(id);
    }
        
          public int buscarId(int codigo)throws 
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException 
    {
        Beca pt = new Beca();
        return pt.buscarId(codigo); 
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
        Beca po = new Beca ();
        List<Beca> p = po.leerPersonal();
        
        //Recorrer los elementos de la lista
        for (Beca dato : p) {
            modelo.addRow(new Object [] {dato.getCodigo()});
        }
        
    }   
           
     public static ArrayList<String> CargarCombobox () throws ClassNotFoundException,
                                              InstantiationException,
                                              IllegalAccessException,
                                              SQLException
    {
       Beca f = new Beca ();
       return f.listaNumerocarnet();
    }
}
