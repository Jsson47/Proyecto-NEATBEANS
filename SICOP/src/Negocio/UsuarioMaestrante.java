/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
import Datos.BSDatos;
import java.sql.SQLException;
/**
 *
 * @author Tania Silva
 */
public  class UsuarioMaestrante extends Usuario {

    
    public UsuarioMaestrante (String nombre, String apellido, 
                            int numcarnet, int becaotorgada, double ingresoMaestrante)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numcarnet = numcarnet;
        this.becaotorgada = becaotorgada;
        this.ingresoMaestrante = ingresoMaestrante;
   
    }

    public double getIngresoMaestrante() {
        return ingresoMaestrante;
    }

    public void setIngresoMaestrante(double ingresoMaestrante) {
        this.ingresoMaestrante = ingresoMaestrante;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumcarnet() {
        return numcarnet;
    }

    public void setNumcarnet(int numcarnet) {
        this.numcarnet = numcarnet;
    }

    public int getBecaotorgada() {
        return becaotorgada;
    }

    public void setBecaotorgada(int becaotorgada) {
        this.becaotorgada = becaotorgada;
    }

  @Override
    public int agregarRegistro() throws ClassNotFoundException,
                                        InstantiationException,
                                        IllegalAccessException,
                                        SQLException 
    {
        BSDatos pt_bd = new BSDatos (this);        
        return pt_bd.guardar();
    }

    @Override
    public int borrarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
