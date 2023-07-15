/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.sql.SQLException;
/**
 *
 * @author Tania Silva
 */
public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected int numcarnet;
    
    public abstract int agregarRegistro () throws ClassNotFoundException,
                                                  InstantiationException,
                                                  IllegalAccessException,
                                                  SQLException;
  
    public abstract Usuario leerUsuario(int val) throws ClassNotFoundException,
                                                  InstantiationException,
                                                  IllegalAccessException,
                                                  SQLException;
    
    public abstract int actualizarRegistro(int val) throws ClassNotFoundException,
                                                  InstantiationException,
                                                  IllegalAccessException,
                                                  SQLException;

    public abstract boolean borrarRegistro (int cod) throws ClassNotFoundException,
                                                 InstantiationException,
                                                 IllegalAccessException,
                                                 SQLException;
}
