package model;

public class ClienteM {

    public int getCodClient() {
        return codClient;
    }

    public void setCodClient(int codClient) {
        this.codClient = codClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getApeClient() {
        return apeClient;
    }

    public void setApeClient(String apeClient) {
        this.apeClient = apeClient;
    }

    public String getDocIdent() {
        return docIdent;
    }

    public void setDocIdent(String docIdent) {
        this.docIdent = docIdent;
    }

    public String getDirecClient() {
        return direcClient;
    }

    public void setDirecClient(String direcClient) {
        this.direcClient = direcClient;
    }
    
    private int codClient;
    private String nomClient;
    private String apeClient;
    private String docIdent;
    private String direcClient;
    
    public ClienteM(){
    
    }
    
}
