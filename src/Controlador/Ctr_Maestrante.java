/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Negocio.UsuarioMaestrante;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Tania Silva
 */
public class Ctr_Maestrante {

    public static int agregar (int NumeroCarnet,String Nombres, String Apellidos, 
                               double Ingresos, int IdCoordinador
                               ) 
                               throws ClassNotFoundException,
                                      InstantiationException,
                                      IllegalAccessException,
                                      SQLException
     
    {
       UsuarioMaestrante pt = new UsuarioMaestrante (NumeroCarnet,Nombres,Apellidos,Ingresos,IdCoordinador);
       return pt.agregarRegistro(); //Mandar agregar el registro
    }
    public static UsuarioMaestrante leerRegistro(int NumeroCarnet) throws
            ClassNotFoundException, InstantiationException, 
            InstantiationException, IllegalAccessException, SQLException 
    {
        UsuarioMaestrante po = new UsuarioMaestrante();
        return (UsuarioMaestrante) po.leerUsuario(NumeroCarnet);
    }
    
        public static int actualizar(int NumeroCarnet, String Nombres, String Apellidos,
            double Ingresos,int IdCoordinador,int id) throws
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException 
    {
        UsuarioMaestrante pt = new UsuarioMaestrante(NumeroCarnet,Nombres, Apellidos, Ingresos, IdCoordinador);
        return pt.actualizarRegistro(id);
    }
   
          public int buscarId(int NumeroCarnet)throws 
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException 
    {
        UsuarioMaestrante pt = new UsuarioMaestrante();
        return pt.buscarId(NumeroCarnet); 
    }
          
           public static boolean eliminar (int NumeroCarnet) throws ClassNotFoundException,
                                                     InstantiationException,
                                                     InstantiationException,
                                                     IllegalAccessException,
                                                     SQLException      
    {
        UsuarioMaestrante po = new UsuarioMaestrante ();
        return po.borrarRegistro(NumeroCarnet);
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
        UsuarioMaestrante po = new UsuarioMaestrante ();
        List<UsuarioMaestrante> p = po.leerPersonal();
        
        //Recorrer los elementos de la lista
        for (UsuarioMaestrante dato : p) {
            modelo.addRow(new Object [] {dato.getNumcarnet(), dato.getNombre(),
                          dato.getApellido(), dato.getIngresoMaestrante(),dato.getEstado()});
        }
        
    }        
         
         public static ArrayList<String> CargarCombobox () throws ClassNotFoundException,
                                              InstantiationException,
                                              IllegalAccessException,
                                              SQLException
    {
       UsuarioMaestrante f = new UsuarioMaestrante ();
       return f.listaNumerocarnet();
    }

//    public Object[] Listado() 
//        throws ClassNotFoundException,
//            InstantiationException,
//            IllegalAccessException,
//            SQLException {
//        UsuarioMaestrante bdP = new UsuarioMaestrante();
//        return bdP.Listado();
//    }
}
