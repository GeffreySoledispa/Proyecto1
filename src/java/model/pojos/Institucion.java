package model.pojos;
// Generated ago 5, 2017 7:19:54 p.m. by Hibernate Tools 4.3.1



/**
 * Institucion generated by hbm2java
 */
public class Institucion  implements java.io.Serializable {


     private String administrador;
     private int contrasena;

    public Institucion() {
    }
    

	
    public Institucion(String administrador) {
        this.administrador = administrador;
    }
    public Institucion(String administrador, int contrasena) {
       this.administrador = administrador;
       this.contrasena = contrasena;
    }
   
    public String getAdministrador() {
        return this.administrador;
    }
    
    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }
    public int getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }




}

