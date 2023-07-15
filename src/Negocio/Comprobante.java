/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Datos.BDComprobante;
import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Tania Silva
 */
public class Comprobante {

    private String fecha;
    private int NumComprobante;
    private double Monto;
    private int Id_Maestrante;
    
    public Comprobante(){
        this.fecha = "yyyy-MM-dd";
        this.NumComprobante = 0;
        this.Monto = 0.0;
        this.Id_Maestrante = 0;
    }
    
    public Comprobante(String fecha, double Monto, int NumComprobante, int Id_Maestrante) {
        this.fecha = fecha;
        this.NumComprobante = NumComprobante;
        this.Monto = Monto;
        this.Id_Maestrante = Id_Maestrante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumComprobante() {
        return NumComprobante;
    }

    public void setNumComprobante(int NumComprobante) {
        this.NumComprobante = NumComprobante;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
  
    
    public int getId_Maestrante() {
        return Id_Maestrante;
    }

    public void setId_Maestrante(int Id_Maestrante) {
        this.Id_Maestrante = Id_Maestrante;
    }
    
      public int agregarRegistro() throws ClassNotFoundException,
                                        InstantiationException,
                                        IllegalAccessException,
                                        SQLException 
    {
        BDComprobante pt_bd = new BDComprobante (this);        
        return pt_bd.guardar();
    }
     
              public List<Comprobante> leerPersonal () throws 
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException
    {
        BDComprobante bdP = new BDComprobante ();
        return (ArrayList) bdP.listado();
    }
              
               public ArrayList <String> listaNumerocarnet() throws ClassNotFoundException,
                                                 InstantiationException,
                                                 IllegalAccessException,
                                                 SQLException
    {
        //Crear la instancia de BD_Facultad
        BDComprobante fac = new BDComprobante ();
        return fac.leerNumeroCarnet(); //Leer los registros
    }
               
               
     //Cambio de formato de la fecha          
     SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return yyyyMMdd.format(jd.getDate());
        } else {
            return null;
        }
    }          
}
