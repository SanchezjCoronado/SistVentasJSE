package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection cnx = null;

    public static Connection cadena() throws Exception {
//        InputStream inputStream
//                = Conexion.class.getClassLoader().getResourceAsStream("propiedades/db.properties");
//        Properties properties = new Properties();
//        try {
//            properties.load(inputStream);
//            String user = properties.getProperty("user");
//            String pwd = properties.getProperty("pwd");
//            String url = properties.getProperty("url");
//            String driver = properties.getProperty("driver");
        if (cnx != null) {
            return cnx;
        }
        try {
            String url = "jdbc:sqlserver://192.168.8.103;databaseName=sisventas";
//            String url = "jdbc:mysql://localhost:3306/bdhospital";
            String user = "sa";
            String password = "vallegrande2019";
//            String driver = "com.mysql.jdbc.Driver";
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//            String driver = "oracle.jdbc.OracleDriver";
            Class.forName(driver).newInstance();
            cnx = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el: " + ex.getMessage());
        }
        return cnx;
    }

    public static void cerrarCnx() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }

    public static void main(String[] args) throws Exception {
       cadena();
       if (cnx != null) {
            System.out.println("abierta");
        }else{
           System.out.println("cerrada");
       }
    }
}
