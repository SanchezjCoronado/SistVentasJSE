package controlador;

import dao.ClienteD;
import model.ClienteM;

public class ClienteC {
    
    ClienteD dao;
    ClienteM cliente;
    
        public void registrarC(){
            try{
                dao.registrar(cliente);
            }catch (Exception e) {
                System.out.println("Error al registrar"+ e.getMessage());
            }
        }
        
        public void modificarC(){
            try{
                dao.modificar(cliente);
            }catch (Exception e) {
                System.out.println("Error al modificar"+ e.getMessage());
            }
        }
        
        public void eliminarC(){
            try{
                dao.eliminar(cliente.getCodClient());
            }catch (Exception e) {
                System.out.println("Error al eliminar"+ e.getMessage());
            }
        }
}
