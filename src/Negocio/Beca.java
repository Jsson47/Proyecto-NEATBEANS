/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Datos.BDBeca;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ESTUDIANTES
 */
public class Beca {

    private int Codigo;
    public String PatrocinadoresBecas;
    public int Beca;
    private int ID_Maestrante;

    public Beca(){
        this.PatrocinadoresBecas ="";
        this.Codigo = 0;
        this.Beca=0;
        this.ID_Maestrante=0;
    }
    public Beca(int Codigo, String PatrocinadoresBecas, int Beca, int ID_Maestrante) {
        this.PatrocinadoresBecas = PatrocinadoresBecas;
        this.Codigo = Codigo;
        this.Beca = Beca;
        this.ID_Maestrante= ID_Maestrante;
    }
    
      public Beca( int Beca, String PatrocinadoresBecas) {
        this.PatrocinadoresBecas = PatrocinadoresBecas;
        this.Beca = Beca;
    }
    public String getPatrocinadoresBecas() {
        return PatrocinadoresBecas;
    }

    public void setPatrocinadoresBecas(String PatrocinadoresBecas) {
        this.PatrocinadoresBecas = PatrocinadoresBecas;
    }

    public int getBeca() {
        return Beca;
    }

    public void setBeca(int Beca) {
        this.Beca = Beca;
    }

        public int getID_Maestrante() {
        return ID_Maestrante;
    }

    public void setID_Coordinador(int ID_Maestrante) {
        this.ID_Maestrante = ID_Maestrante;
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
   public int agregarRegistro() throws ClassNotFoundException,
                                        InstantiationException,
                                        IllegalAccessException,
                                        SQLException 
    {
        BDBeca pt_bd = new BDBeca (this);        
        return pt_bd.guardar();
    }

    public Beca leerUsuario(int codigo) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {
        BDBeca bdP = new BDBeca();
        return (Beca) bdP.leer(codigo);
    }
    
    public Beca leerUsuarioEstadouenta(int Numerocarnet) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {
        BDBeca bdP = new BDBeca();
        return (Beca) bdP.leerEstadoCuenta(Numerocarnet);
    }
    
    public int actualizarRegistro(int id) throws ClassNotFoundException,
                                            InstantiationException,
                                            IllegalAccessException,
                                            SQLException
    {
        BDBeca pt_bd = new BDBeca(this);
        return  pt_bd.actualizar(id);
    }
    
    public int buscarId (int codigo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        BDBeca pt_bd = new BDBeca();
        return pt_bd.buscarId(codigo);
        
    }
    
     public List<Beca> leerPersonal () throws 
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException
    {
        BDBeca bdP = new BDBeca ();
        return (ArrayList) bdP.listado();
    }
     
      public ArrayList <String> listaNumerocarnet() throws ClassNotFoundException,
                                                 InstantiationException,
                                                 IllegalAccessException,
                                                 SQLException
    {
        //Crear la instancia de BD_Facultad
        BDBeca fac = new BDBeca ();
        return fac.leerNumeroCarnet(); //Leer los registros
    }
}
