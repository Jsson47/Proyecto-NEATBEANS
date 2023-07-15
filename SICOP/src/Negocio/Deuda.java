/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;


import Datos.BSDatosDeuda;
import java.sql.SQLException;

/**
 *
 * @author Tania Silva
 */
public class Deuda {

    public Deuda(int Plazospago, int TotalDeuda) {
        this.Plazospago = Plazospago;
        this.TotalDeuda = TotalDeuda;
    }

    public int getPlazospago() {
        return Plazospago;
    }

    public void setPlazospago(int Plazospago) {
        this.Plazospago = Plazospago;
    }

    public int getTotalDeuda() {
        return TotalDeuda;
    }

    public void setTotalDeuda(int TotalDeuda) {
        this.TotalDeuda = TotalDeuda;
    }
    public int Plazospago;
    public int TotalDeuda;
           
    public int agregarRegistro() throws ClassNotFoundException,
                                        InstantiationException,
                                        IllegalAccessException,
                                        SQLException 
    {
        BSDatosDeuda pt_bd = new BSDatosDeuda (this);        
        return pt_bd.guardar();
    }

    public int borrarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }        
}
