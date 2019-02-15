/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Deivy
 */
public class UsuarioM {
    private int idusuario,idempleado;
    private String nick;
    private String clave;
    private String tipo;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public UsuarioM() {
    }

    public UsuarioM(int idusuario, int idempleado, String nick, String clave, String tipo) {
        this.idusuario = idusuario;
        this.idempleado = idempleado;
        this.nick = nick;
        this.clave = clave;
        this.tipo = tipo;
    }
    public String[] DatostoArray()
    {
        String[] lista= new String[5];
        lista[0]=String.valueOf(idusuario);
        lista[1]=String.valueOf(idempleado);
        lista[2]=nick;
        lista[3]=clave;
        lista[4]=tipo;
        return lista;
    }
    
    
}
