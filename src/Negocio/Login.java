/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Datos.BDLogin;
import java.sql.SQLException;
/**
 *
 * @author Tania Silva
 */
public class Login {
    
    public String Usuario;
    public String Contrasenia;
    public String Privilegio;

    public Login(String Usuario, String Contrasenia, String Privilegio) {
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.Privilegio = Privilegio;
    }

    public Login(String Usuario) {
        this.Usuario = Usuario;

    }
    
    public Login() {
        this.Usuario="";
        this.Contrasenia="";
        this.Privilegio="";
    }
     public Login(String Usuario, String Contrasenia) {
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
    }
     
    public String getPrivilegio() {
        return Privilegio;
    }

    public void setPrivilegio(String Privilegio) {
        this.Privilegio = Privilegio;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }
    
    public int agregarRegistro() throws ClassNotFoundException,
                                        InstantiationException,
                                        IllegalAccessException,
                                        SQLException 
    {
        BDLogin pt_bd = new BDLogin (this);        
        return pt_bd.guardar();
    }
//     public Login VerificarRegistro(String Usuario,String Contraseña, String Privilegio) throws ClassNotFoundException,
//            InstantiationException,
//            IllegalAccessException,
//            SQLException {
//        BDLogin bdP = new BDLogin(this);
//        return (Login) bdP.verificarPerfil(Usuario,Contraseña, Privilegio);
//    }
}
