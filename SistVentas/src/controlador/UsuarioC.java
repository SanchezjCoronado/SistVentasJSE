/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.Conexion;
import dao.LoginD;
import java.io.Serializable;
import model.EmpleadoM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class UsuarioC implements Serializable {

    LoginD loginDao;
    EmpleadoM empleado;

    public UsuarioC() {
        loginDao = new LoginD();
        empleado = new EmpleadoM();
    }

//   private static boolean Nuevo(UsuarioM p) throws ClassNotFoundException, SQLException
//    {
//        int r=0;
//        String sql="insert into usuarios values(null,?,?,?,?)";
//        try (Connection cn= Conexion.Cadena();
//                PreparedStatement ps= cn.prepareStatement(sql)){
//            ps.setInt(1,p.getIdempleado());
//            ps.setString(2,p.getNick());
//            ps.setString(3,p.getClave());
//            ps.setString(4,p.getTipo());
//            r=ps.executeUpdate();
//        }
//        return r==1?true:false;
//    }
//    private static boolean Actualizar(UsuarioM p) throws ClassNotFoundException, SQLException
//    {
//        int r=0;
//        String sql="update usuarios set nick=?,clave=?,tipo=? where idusuario=?";
//        try (Connection cn= Conexion.Cadena();
//                PreparedStatement ps= cn.prepareStatement(sql)){
//            ps.setString(1,p.getNick());
//            ps.setString(2,p.getClave());
//            ps.setString(3,p.getTipo());
//            ps.setInt(4,p.getIdusuario());
//            r=ps.executeUpdate();
//        }
//        return r==1?true:false;
//    }
//    private static boolean Existe(UsuarioM p) throws ClassNotFoundException, SQLException
//    {
//        int r=0;
//        String sql="select ifnull(count(idusuario),0) from usuarios where idusuario=?";
//        try (Connection cn= Conexion.Cadena();
//                PreparedStatement ps= cn.prepareStatement(sql)){
//            ps.setInt(1,p.getIdusuario());
//            try (ResultSet rs= ps.executeQuery()){
//                rs.next();
//                r=rs.getInt(1);
//            }
//        }
//        return r>0?true:false;
//    }
//    private static boolean DarBaja(UsuarioM p) throws ClassNotFoundException, SQLException
//    {
//        int r=0;
//        String sql="delete from usuarios where idusuario=?";
//        try (Connection cn= Conexion.Cadena();
//                PreparedStatement ps= cn.prepareStatement(sql)){
//            ps.setInt(1,p.getIdusuario());
//            r=ps.executeUpdate();
//        }
//        return r==1?true:false;
//    }
//    private static LinkedList<UsuarioM> Lista() throws ClassNotFoundException, SQLException
//    {
//        int r=0;
//        LinkedList<UsuarioM> Lista = new LinkedList<>();
//        String sql="select * from usuarios";
//        try (Connection cn= Conexion.Cadena();
//                PreparedStatement ps= cn.prepareStatement(sql)){
//            try (ResultSet rs= ps.executeQuery()){
//               while(rs.next())
//               {
//                   Lista.add(new UsuarioM(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5)));
//               }
//            }
//        }
//        return Lista;
//    }
//    private static int Ingreso(UsuarioM p) throws ClassNotFoundException, SQLException
//    {
//        int r=0;
//        String sql="select ifnull(count(idusuario),0) from usuarios where nick=? and clave=?";
//        try (Connection cn= Conexion.Cadena();
//                PreparedStatement ps= cn.prepareStatement(sql)){
//            ps.setString(1,p.getNick());
//            ps.setString(2,p.getClave());
//            try (ResultSet rs= ps.executeQuery()){
//                rs.next();
//                r=rs.getInt(1);
//            }
//        }
//        return r;
//    }
//    public static boolean Guardar(UsuarioM p) throws ClassNotFoundException, SQLException
//    {
//        if (Existe(p)) {
//            return Actualizar(p);
//        }else
//        {
//            return Nuevo(p);
//        }
//    }
//    public static boolean Eliminar(UsuarioM p) throws ClassNotFoundException, SQLException
//    {
//        return DarBaja(p);
//    }
//    
//    public static LinkedList<UsuarioM> ListaUsuarios() throws ClassNotFoundException, SQLException
//    {
//        return Lista();
//    }
//    public static int IngresoLogin(UsuarioM p) throws ClassNotFoundException, SQLException
//    {
//        return Ingreso(p);
//    }
//    private Object dao;
    
    public int loguin() throws Exception {
        EmpleadoM emp;
        emp= loginDao.loginD("user", "1234");
        if (emp.getNombres()== null) {
            return 1;
        }else{
            return 0;
        }
    }
}
