/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;


import Datos.BSDatosCoordinador;
import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Tania Silva
 */
public class UsuarioCoordinador extends Usuario {

        
    public UsuarioCoordinador(int NumeroCarnet,String Nombres, String Apellidos, String FechaInicioCorte, String FechaFinCorte) {
        this.NumeroCarnet = NumeroCarnet;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.FechaInicioCorte = FechaInicioCorte;
        this.FechaFinCorte = FechaFinCorte;
    }

    public UsuarioCoordinador(String Nombres, String Apellidos, String FechaInicioCorte, String FechaFinCorte, String Estado,int NumeroCarnet) {
        this.NumeroCarnet = NumeroCarnet;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.FechaInicioCorte = FechaInicioCorte;
        this.FechaFinCorte = FechaFinCorte;
        this.Estado = Estado;
    }
      private int NumeroCarnet;
      private String Nombres;
      private String Apellidos;
      private String FechaInicioCorte;
      private String FechaFinCorte;  
      private String Estado;
    
        public UsuarioCoordinador() 
    {
        this.NumeroCarnet = 0;
        this.Nombres = "";
        this.Apellidos = "";
        this.FechaInicioCorte = "";
        this.FechaFinCorte = "";
        this.Estado = "";
    } 
        
     public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }   
        
    public int getNumeroCarnet() {
        return NumeroCarnet;
    }

    public void setNumeroCarnet(int NumeroCarnet) {
        this.NumeroCarnet = NumeroCarnet;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFechaInicioCorte() {
        return FechaInicioCorte;
    }

    public void setFechaInicioCorte(String FechaInicioCorte) {
        this.FechaInicioCorte = FechaInicioCorte;
    }

    public String getFechaFinCorte() {
        return FechaFinCorte;
    }

    public void setFechaFinCorte(String FechaFinCorte) {
        this.FechaFinCorte = FechaFinCorte;
    }
       
      @Override
    public int agregarRegistro() throws ClassNotFoundException,
                                        InstantiationException,
                                        IllegalAccessException,
                                        SQLException 
    {
        BSDatosCoordinador pt_bd = new BSDatosCoordinador (this);        
        return pt_bd.guardar();
    }
    
    @Override
     public UsuarioCoordinador leerUsuario(int NumeroCarnet) throws ClassNotFoundException,
                                                             InstantiationException, 
                                                             IllegalAccessException, 
                                                             SQLException {
        BSDatosCoordinador bdP = new BSDatosCoordinador();
        return (UsuarioCoordinador) bdP.leer(NumeroCarnet);
    }
     
    @Override
     public int actualizarRegistro(int id) throws ClassNotFoundException,
                                            InstantiationException,
                                            IllegalAccessException,
                                            SQLException
    {
        BSDatosCoordinador pt_bd = new BSDatosCoordinador(this);
        return  pt_bd.actualizar(id);
    }
    
    public int buscarId (int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        BSDatosCoordinador pt_bd = new BSDatosCoordinador();
        return pt_bd.buscarId(NumeroCarnet);
        
    }

     @Override
    public boolean borrarRegistro(int NumeroCarnet) throws ClassNotFoundException,
                                           InstantiationException,
                                           IllegalAccessException,
                                           SQLException
    {
        BSDatosCoordinador bdP = new BSDatosCoordinador ();               
        return bdP.borrar(NumeroCarnet); 
    }
    
       public List<UsuarioCoordinador> leerPersonal () throws 
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException
    {
        BSDatosCoordinador bdP = new BSDatosCoordinador ();
        return (ArrayList) bdP.listado();
    }
       
        SimpleDateFormat fechai = new SimpleDateFormat("yyyy-MM-dd");
    public String getFechaInicio(JDateChooser jd) {
        if (jd.getDate() != null) {
            return fechai.format(jd.getDate());
        } else {
            return null;
        }
    } 
    
    public String setFechaInicio(JDateChooser jd) {
            return fechai.format(jd.getDate());

    } 
    
     SimpleDateFormat fechafin = new SimpleDateFormat("yyyy-MM-dd");
    public String getFechafin(JDateChooser jd) {
        if (jd.getDate() != null) {
            return fechafin.format(jd.getDate());
        } else {
            return null;
        }
    } 

    public String setFechafin(JDateChooser jd) {{
            return fechafin.format(jd.getDate());
        } 
        
    }
}
