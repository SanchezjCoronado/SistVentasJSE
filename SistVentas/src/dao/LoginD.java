/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.EmpleadoM;

public class LoginD extends Conexion {

    public EmpleadoM loginD(String user, String clave) throws Exception {
        EmpleadoM emp = new EmpleadoM();
        String sql = "select from Usuario where nick='" + user + "' and = clave='" + clave + "'";
        PreparedStatement ps = this.cadena().prepareStatement(sql);
        ps.setString(1, user);
        ps.setString(2, clave);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            emp.setNombres(rs.getString("nombres"));
            emp.setApellidos(rs.getString("apellidos"));
            emp.setTipo(rs.getInt("tipo"));
        }
        rs.close();
        ps.close();
        return emp;
    }

}
