package Libreria;

public class Autor {
    String nombre, paginaweb, email;
    


    //setters establecer
    
    public void setNombre(String nombreSet){
        this.nombre=nombreSet;
    }
    public void setPaginaweb(String paginawebSet){
        this.paginaweb=paginawebSet;
    }
    public void setEmail(String emailSet){
        this.email=emailSet;
    }
       

    //getters obtener
    public String getNombre(){
        return this.nombre;
    }
    public String getPaginaweb(){
        return this.paginaweb;
    }
    public String getEmail(){
        return this.email;
    }
    
    //metodos personalisados
    public void informacionautores (){

    }
    public void agregarautor (){

    }
    public void eliminarautor(){

    }
}
