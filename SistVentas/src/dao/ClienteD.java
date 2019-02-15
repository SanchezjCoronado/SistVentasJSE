package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ClienteM;

public class ClienteD extends Conexion {

    public void registrar(ClienteM client) throws Exception {
        try {
            String sql = "insert into Cliente(nomClient,apeClient,docIdent,direcClient) values(?,?,?,?)";
            PreparedStatement ps = this.cadena().prepareStatement(sql);
            ps.setString(1, client.getNomClient());
            ps.setString(2, client.getApeClient());
            ps.setString(3, client.getDocIdent());
            ps.setString(4, client.getDirecClient());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro correcto");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificar(ClienteM client) throws Exception {
        try {
            String sql = "update Cliente set nomClient=?, apeClient=?, docIdent=?, direcClient=? where codClient=?";
            PreparedStatement ps = this.cadena().prepareStatement(sql);
            ps.setString(1, client.getNomClient());
            ps.setString(2, client.getApeClient());
            ps.setString(3, client.getDocIdent());
            ps.setString(4, client.getDirecClient());
            ps.executeUpdate();
            ps.close();
            System.out.println(client.getCodClient());
            JOptionPane.showMessageDialog(null, "Actualización correcta");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar", "Error ", JOptionPane.ERROR);
            System.out.println("Error al modificar " + e.getMessage());
        }
    }

    public void eliminar(int codClient) throws Exception {
        try {
            String sql = "delete from Cliente where codClient= " + codClient;
            Statement st = this.cadena().createStatement();
            st.executeUpdate(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Eliminación correcta");
        } catch (Exception e) {
            System.out.println("Error en base de datos " + e.getMessage());
        }
    }

}
