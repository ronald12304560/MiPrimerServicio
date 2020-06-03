/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import com.mysql.jdbc.MysqlIO;
import java.util.*;
import java.sql.*;
import conexion.Conexion;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADVANCE
 */
public class AlumnoImpl {

    Conexion x = new Conexion();
    String sql = "";
    ArrayList<Alumno> listasAlumnosEgresados = new ArrayList<Alumno>();

    public ArrayList<Alumno> listaEgresados(String s_anhio_egreso) throws Exception {
        try {
            Connection conn = x.connectDatabase();
            sql = "select * from alumno where alumno_codigo like '" + s_anhio_egreso + "%' ";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno datos = new Alumno();
                datos.setO_alumno_id(rs.getString("alumno_id"));
                datos.setO_alumno_codigo(rs.getString("alumno_codigo"));
                datos.setO_alumno_nombres(rs.getString("alumno_nombres"));
                datos.setO_alumno_apellido_paterno(rs.getString("alumno_apellido_paterno"));
                datos.setO_alumno_apellido_materno(rs.getString("alumno_apellido_materno"));
                datos.setO_alumno_direccion(rs.getString("alumno_id"));

                listasAlumnosEgresados.add(datos);
            }
        } catch (SQLException ex) {
            System.out.println("ERRORRR " + ex.getMessage());
        }
        return listasAlumnosEgresados;
    }

    public static void main(String[] args) throws Exception {
        AlumnoImpl am = new AlumnoImpl();
        for (Alumno ad : am.listaEgresados("20")) {
            System.out.println("en el foor loop");
            System.out.println(ad.getO_alumno_codigo());
            System.out.println(ad.getO_alumno_nombres());
        }

    }

}
