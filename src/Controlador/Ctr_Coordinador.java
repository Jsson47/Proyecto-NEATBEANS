/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Negocio.UsuarioCoordinador;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tania Silva
 */
public class Ctr_Coordinador {
    public static int agregar (int NumeroCarnet, String Nombres, String Apellidos, 
                               String FechaInicioCorte,String FechaFinCorte
                               ) 
                               throws ClassNotFoundException,
                                      InstantiationException,
                                      IllegalAccessException,
                                      SQLException
     
    {
       UsuarioCoordinador pt = new UsuarioCoordinador (NumeroCarnet,Nombres,Apellidos,FechaInicioCorte,FechaFinCorte);
       return pt.agregarRegistro(); //Mandar agregar el registro
    }
    public static UsuarioCoordinador leerRegistro(int NumCarnet) throws
            ClassNotFoundException, InstantiationException, 
            InstantiationException, IllegalAccessException, SQLException 
    {
        UsuarioCoordinador po = new UsuarioCoordinador();
        return (UsuarioCoordinador) po.leerUsuario(NumCarnet);
    }
    
      public static int actualizar(int NumeroCarnet, String Nombres, String Apellidos,
            String FechaInicioCorte,String FechaFinCorte,int id) throws
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException 
    {
        UsuarioCoordinador pt = new UsuarioCoordinador(NumeroCarnet,Nombres, Apellidos, FechaInicioCorte, FechaFinCorte);
        return pt.actualizarRegistro(id);
    }

  
        
          public int buscarId(int NumeroCarnet)throws 
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException 
    {
        UsuarioCoordinador pt = new UsuarioCoordinador();
        return pt.buscarId(NumeroCarnet); 
    }
          
                  public static boolean eliminar (int NumeroCarnet) throws ClassNotFoundException,
                                                     InstantiationException,
                                                     InstantiationException,
                                                     IllegalAccessException,
                                                     SQLException      
    {
        UsuarioCoordinador po = new UsuarioCoordinador ();
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
        UsuarioCoordinador po = new UsuarioCoordinador ();
        List<UsuarioCoordinador> p = po.leerPersonal();

        for (UsuarioCoordinador dato : p) {
            modelo.addRow(new Object [] {dato.getNumeroCarnet(), dato.getNombres(),
                          dato.getApellidos(), dato.getFechaInicioCorte(), dato.getFechaFinCorte(), dato.getEstado()});
        }
        
    }
}
