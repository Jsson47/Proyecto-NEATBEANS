/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
import Datos.BSDatos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tania Silva
 */
public  class UsuarioMaestrante extends Usuario {

    private double ingresoMaestrante;
    private String Estado;
    private int IdCoordinador;
   
     public UsuarioMaestrante() 
    {
        this.numcarnet = 0;
        this.nombre = "";
        this.apellido = "";
        this.ingresoMaestrante = 0.0;
        this.Estado = "";
        this.IdCoordinador = 0;          
    }
     
    public UsuarioMaestrante (int numcarnet,String nombre, String apellido, 
                              double ingresoMaestrante, int IdCoordinador)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numcarnet = numcarnet;
        this.ingresoMaestrante = ingresoMaestrante;
        this.IdCoordinador = IdCoordinador;
    }
    
    public UsuarioMaestrante (int numcarnet,String nombre, String apellido, 
                              double ingresoMaestrante,String Estado, int IdCoordinador)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numcarnet = numcarnet;
        this.Estado = Estado;
        this.ingresoMaestrante = ingresoMaestrante;
        this.IdCoordinador = IdCoordinador;
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

     public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIdCoordinadador() {
        return IdCoordinador;
    }

    public void setIdCoordinadador(int IdCoordinadador) {
        this.IdCoordinador = IdCoordinadador;
    }
    
    //----Metodos del Proyecto----//
    
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
     public UsuarioMaestrante leerUsuario(int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException 
     {
        BSDatos bdP = new BSDatos();
        return (UsuarioMaestrante) bdP.leer(NumeroCarnet);
    }
     
      @Override
    public int actualizarRegistro(int id) throws ClassNotFoundException,
                                            InstantiationException,
                                            IllegalAccessException,
                                            SQLException
    {
        BSDatos pt_bd = new BSDatos(this);
        return  pt_bd.actualizar(id);
    }
    
    public int buscarId (int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        BSDatos pt_bd = new BSDatos();
        return pt_bd.buscarId(NumeroCarnet);
        
    }
    
       @Override
    public boolean borrarRegistro(int NumeroCarnet) throws ClassNotFoundException,
                                           InstantiationException,
                                           IllegalAccessException,
                                           SQLException
    {
        //Temporalmente el método no tiene definido una funcionalidad
        BSDatos bdP = new BSDatos ();               
        return bdP.borrar(NumeroCarnet); //Valor temporal solo para evitar marca de error
    }
 
    public List<UsuarioMaestrante> leerPersonal () throws 
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException
    {
        BSDatos bdP = new BSDatos ();
        return (ArrayList) bdP.listado();
    }
     
     public ArrayList <String> listaNumerocarnet() throws ClassNotFoundException,
                                                 InstantiationException,
                                                 IllegalAccessException,
                                                 SQLException
    {
        //Crear la instancia de BD_Facultad
        BSDatos fac = new BSDatos ();
        return fac.leerNumeroCarnet(); //Leer los registros
    }

//        public Object[] Listado() throws ClassNotFoundException,
//            InstantiationException,
//            IllegalAccessException,
//            SQLException {
//        BSDatos bdP = new BSDatos(this);
//        return bdP.Listado();
//    }

}
