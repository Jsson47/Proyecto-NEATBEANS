/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;


import Datos.BDEstadoCuenta;
import Datos.BSDatos;
import java.sql.SQLException;

/**
 *
 * @author ESTUDIANTES
 */
public class EstadoCuenta {

    public EstadoCuenta(double Ingresos, String Nombres, String Apellidos, double TotalDeuda, String Plazos, int Beca, String Patrocinador, double deudapendiente) {
        this.Ingresos = Ingresos;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.TotalDeuda = TotalDeuda;
        this.Plazos = Plazos;
        this.Beca = Beca;
        this.Patrocinador = Patrocinador;
        this.deudapendiente = deudapendiente;
    }
    
    public double Ingresos;
    public String Nombres;
    public String Apellidos;
    public double TotalDeuda;
    public String Plazos;
    public int Beca;
    public String Patrocinador;
    public double deudapendiente; 

    public EstadoCuenta(){
        this.Ingresos = 0.0;
        this.Nombres = "";
        this.Apellidos = "";
        this.TotalDeuda = 0.0;
        this.Plazos = "";
        this.Beca = 0;
        this.Patrocinador = "";
        this.deudapendiente = 0.0;
        
    }
    public double getIngresos() {
        return Ingresos;
    }

    public void setIngresos(double Ingresos) {
        this.Ingresos = Ingresos;
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

    public double getTotalDeuda() {
        return TotalDeuda;
    }

    public void setTotalDeuda(double TotalDeuda) {
        this.TotalDeuda = TotalDeuda;
    }

    public String getPlazos() {
        return Plazos;
    }

    public void setPlazos(String Plazos) {
        this.Plazos = Plazos;
    }

    public int getBeca() {
        return Beca;
    }

    public void setBeca(int Beca) {
        this.Beca = Beca;
    }

    public String getPatrocinador() {
        return Patrocinador;
    }

    public void setPatrocinador(String Patrocinador) {
        this.Patrocinador = Patrocinador;
    }

    public double getDeudapendiente() {
        return deudapendiente;
    }

    public void setDeudapendiente(double deudapendiente) {
        this.deudapendiente = deudapendiente;
    }
       
     public UsuarioMaestrante leerUsuario(int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException 
     {
        BSDatos bdP = new BSDatos();
        return (UsuarioMaestrante) bdP.leer(NumeroCarnet);
    }
     
     
     public EstadoCuenta leerUsuarioEstadocuenta(int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {
        BDEstadoCuenta bdP = new BDEstadoCuenta();
        return (EstadoCuenta) bdP.leerEstadoCuenta(NumeroCarnet);
    }
//     
//      public EstadoCuenta EstadoCuenta(int NumeroCarnet) throws ClassNotFoundException,
//            InstantiationException, IllegalAccessException, SQLException 
//     {
//        BDEstadoCuenta bdP = new BDEstadoCuenta();
//        return (EstadoCuenta) bdP.EstadoCuenta(NumeroCarnet);
//    }
}
