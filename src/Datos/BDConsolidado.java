/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negocio.Consolidado;
import Servicios.MS_SQLServer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tania Silva
 */
public class BDConsolidado {
    private MS_SQLServer cnx = null;
    private Consolidado pt;
    
     public BDConsolidado(){
        pt=null;
    }
    
    public BDConsolidado (Consolidado pt){
        this.pt = pt;
    }
    
     public List<Consolidado> listado() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        List<Consolidado> list = null; //Lista de instancia a retornar
        cnx = new MS_SQLServer(); //Establecer la instancia para la conexión
        //Consultar todos los registros que estan activo para retornarlos
        String sql = "SELECT M.NumeroCarnet, M.Nombres, M.Apellidos, M.Ingresos$, B.TotalBeca, D.DeudaTotal, D.PlazosMeses, (D.DeudaTotal - C.Monto) AS DeudaRestante\n"
                + "FROM Maestrante M\n"
                + "INNER JOIN Beca B ON M.id = B.ID_Maestrante\n"
                + "INNER JOIN Deuda D ON M.id = D.ID_Maestrante\n"
                + "INNER JOIN Comprobante C ON M.id = C.ID_Maestrante;";

        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.resultado = cnx.pst.executeQuery();

        //Verificar que se obtuvieron registros, si hay se procesan        
        if (cnx.resultado != null) {
            list = new ArrayList<>();//ArrayList almacen
            while (cnx.resultado.next()) {
                Consolidado p = new Consolidado();
                p.setNCarnet(cnx.resultado.getInt("NumeroCarnet"));
                p.setNombres(cnx.resultado.getString("Nombres"));
                p.setApellidos(cnx.resultado.getString("Apellidos"));
                p.setIngresos(cnx.resultado.getDouble("Ingresos$"));
                p.setBecaOtorgada(cnx.resultado.getInt("TotalBeca"));
                p.setDeuda(cnx.resultado.getDouble("DeudaTotal"));
                p.setPlazosMeses(cnx.resultado.getString("PlazosMeses"));
                p.setPagoPendiente(cnx.resultado.getDouble("DeudaRestante"));
                list.add(p); //Agregar el resultado a la lista
            }//Fin de la instrucción While
        }
        return list;
    }
}