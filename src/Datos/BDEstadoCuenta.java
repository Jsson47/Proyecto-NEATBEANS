/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negocio.EstadoCuenta;
import Negocio.UsuarioMaestrante;
import Servicios.MS_SQLServer;
import java.sql.SQLException;

/**
 *
 * @author Tania Silva
 */
public class BDEstadoCuenta {
    
    private UsuarioMaestrante pt;
    private MS_SQLServer cnx = null; //Manejador de conexión
    
    public BDEstadoCuenta(){
        pt = null;
    }
    public BDEstadoCuenta (UsuarioMaestrante pt){
        this.pt = pt;
    }
    
    public EstadoCuenta leerEstadoCuenta(int NumeroCarnet) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {
        EstadoCuenta p = null;
        String sql = "SELECT M.Nombres, M.Apellidos, M.Ingresos$, B.TotalBeca,B.PatrocinadorBeca, D.DeudaTotal, D.PlazosMeses, (D.DeudaTotal - C.Monto) AS DeudaRestante\n"
                + "FROM Maestrante M\n"
                + "INNER JOIN Beca B ON M.id = B.ID_Maestrante\n"
                + "INNER JOIN Deuda D ON M.id = D.ID_Maestrante\n"
                + "INNER JOIN Comprobante C ON M.id = C.ID_Maestrante where NumeroCarnet = ?;";
        cnx = new MS_SQLServer();
        //Procesar la ejecución de la consulta en la base de datos 
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setInt(1, NumeroCarnet);
        cnx.resultado = cnx.pst.executeQuery();
        //Recorrer los resultados obtenidos en la consulta si los hay 
        if (cnx.resultado.next()) {
            //Recuperar los valores del registro y asignar al objeto p
            p = new EstadoCuenta(
                    cnx.resultado.getDouble("Ingresos$"),
                    cnx.resultado.getString("Nombres"),
                    cnx.resultado.getString("Apellidos"),
                    cnx.resultado.getDouble("DeudaTotal"),
                    cnx.resultado.getString("PlazosMeses"),
                    cnx.resultado.getInt("TotalBeca"),
                    cnx.resultado.getString("PatrocinadorBeca"),
                    cnx.resultado.getDouble("DeudaRestante")
            );
        }//Fin de la instrucción if
        return p;//Retornar el objeto con los valores encontrados
    }
    
    
//      public EstadoCuenta EstadoCuenta(int NumeroCarnet) throws ClassNotFoundException,
//            InstantiationException, IllegalAccessException, SQLException {
//          
//        EstadoCuenta p = null;
//        String sql = "SELECT * FROM VistaEstado WHERE NumeroCarnet = ?;";// + noCarnetUsuario;
//
//        cnx = new MS_SQLServer();
//        //Procesar la ejecución de la consulta en la base de datos 
//        cnx.pst = cnx.conexion.prepareStatement(sql);
//        cnx.pst.setInt(1, NumeroCarnet);
//        cnx.resultado = cnx.pst.executeQuery();
//        //Recorrer los resultados obtenidos en la consulta si los hay 
//        if (cnx.resultado.next()) {
//            //Recuperar los valores del registro y asignar al objeto p
//            p = new EstadoCuenta(
//                    cnx.resultado.getDouble("Saldo")
//            );
//        }//Fin de la instrucción if
//        return p;//Retornar el objeto con los valores encontrados
//    }
}
