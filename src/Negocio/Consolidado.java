/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Datos.BDConsolidado;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tania Silva
 */
public class Consolidado {

    public Consolidado(int NCarnet, String Nombres, String Apellidos, double Ingresos, int BecaOtorgada, double Deuda, String PlazosMeses, double PagoPendiente) {
        this.NCarnet = NCarnet;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Ingresos = Ingresos;
        this.BecaOtorgada = BecaOtorgada;
        this.Deuda = Deuda;
        this.PlazosMeses = PlazosMeses;
        this.PagoPendiente = PagoPendiente;
    }

    public Consolidado() {
        this.NCarnet = 0;
        this.Nombres = "";
        this.Apellidos = "";
        this.Ingresos = 0.0;
        this.BecaOtorgada = 0;
        this.Deuda = 0.0;
        this.PlazosMeses = "";
        this.PagoPendiente = 0;
    }

    public int getNCarnet() {
        return NCarnet;
    }

    public void setNCarnet(int NCarnet) {
        this.NCarnet = NCarnet;
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

    public double getIngresos() {
        return Ingresos;
    }

    public void setIngresos(double Ingresos) {
        this.Ingresos = Ingresos;
    }

    public int getBecaOtorgada() {
        return BecaOtorgada;
    }

    public void setBecaOtorgada(int BecaOtorgada) {
        this.BecaOtorgada = BecaOtorgada;
    }

    public double getDeuda() {
        return Deuda;
    }

    public void setDeuda(double Deuda) {
        this.Deuda = Deuda;
    }

    public String getPlazosMeses() {
        return PlazosMeses;
    }

    public void setPlazosMeses(String PlazosMeses) {
        this.PlazosMeses = PlazosMeses;
    }

    public double getPagoPendiente() {
        return PagoPendiente;
    }

    public void setPagoPendiente(double PagoPendiente) {
        this.PagoPendiente = PagoPendiente;
    }

    public int NCarnet;
    public String Nombres;
    public String Apellidos;
    public double Ingresos;
    public int BecaOtorgada;
    public double Deuda;
    public String PlazosMeses;
    public double PagoPendiente;

    public List<Consolidado> leerConsolidado() throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        BDConsolidado bdP = new BDConsolidado();
        return (ArrayList) bdP.listado();
    }
}
