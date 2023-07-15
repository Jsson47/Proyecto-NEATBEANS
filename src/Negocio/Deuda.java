/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;


import Datos.BSDatosDeuda;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tania Silva
 */
public class Deuda {

      public String Plazospago;
      public double TotalDeuda;
      private int Codigo;
      private int Id_Maestrante;
      
      public Deuda(){
          this.Plazospago="";
          this.TotalDeuda=0.0;
          this.Codigo=0;
          this.Id_Maestrante = 0;
      }
    public Deuda( int Codigo,String Plazospago, double TotalDeuda, int Id_Maestrante) {
        this.Plazospago = Plazospago;
        this.TotalDeuda = TotalDeuda;
        this.Codigo = Codigo;
        this.Id_Maestrante = Id_Maestrante;
    }

    public Deuda(double TotalDeuda,String Plazospago) {
        this.Plazospago = Plazospago;
        this.TotalDeuda = TotalDeuda;
    }

    public String getPlazospago() {
        return Plazospago;
    }

    public void setPlazospago(String Plazospago) {
        this.Plazospago = Plazospago;
    }

    public double getTotalDeuda() {
        return TotalDeuda;
    }

    public void setTotalDeuda(double TotalDeuda) {
        this.TotalDeuda = TotalDeuda;
    }
  
       public int getCodigo(){
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
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
        BSDatosDeuda pt_bd = new BSDatosDeuda (this);        
        return pt_bd.guardar();
    }

    public Deuda leerUsuario(int codigo) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {
        BSDatosDeuda bdP = new BSDatosDeuda();
        return (Deuda) bdP.leer(codigo);
    }
    
    public Deuda leerUsuarioEstadoCuenta(int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {
        BSDatosDeuda bdP = new BSDatosDeuda();
        return (Deuda) bdP.leerEstadoCuenta(NumeroCarnet);
    }
    
    public int actualizarRegistro(int id) throws ClassNotFoundException,
                                            InstantiationException,
                                            IllegalAccessException,
                                            SQLException
    {
        BSDatosDeuda pt_bd = new BSDatosDeuda(this);
        return  pt_bd.actualizar(id);
    }
    
    public int buscarId (int codigo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        BSDatosDeuda pt_bd = new BSDatosDeuda();
        return pt_bd.buscarId(codigo);
        
    }
    
     public List<Deuda> leerPersonal () throws 
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException
    {
        BSDatosDeuda bdP = new BSDatosDeuda ();
        return (ArrayList) bdP.listado();
    }
     
      public ArrayList <String> listaNumerocarnet() throws ClassNotFoundException,
                                                 InstantiationException,
                                                 IllegalAccessException,
                                                 SQLException
    {
        //Crear la instancia de BD_Facultad
        BSDatosDeuda fac = new BSDatosDeuda ();
        return fac.leerNumeroCarnet(); //Leer los registros
    }
      
//      private void asignarCodigo()throws ClassNotFoundException,
//                                              InstantiationException,
//                                              IllegalAccessException,
//                                              SQLException
//    {
//        try {
//            //Establecer enlace con la capa de datos para validar el n° de acta
//            BSDatosDeuda a = new BSDatosDeuda ();
//            int val = a.getCodigo(Codigo);
//            if (val == 0)
//              Codigo = 100; //Se iniciará a generar numeración a partir de 0  
//            else
//              Codigo = val + 1; //Incremenar en 1 el valor actual del acta
//        }//Fin de la instrucción try        
//        catch (ClassNotFoundException | InstantiationException | 
//                IllegalAccessException | SQLException ex) {
//            JOptionPane.showMessageDialog(null, "No se ha podido determinar"
//                    + " el Código correspondiente al registro"+ex.toString(), 
//                    "Error de Código de Registros", JOptionPane.ERROR_MESSAGE);
//        }
//    }
}
