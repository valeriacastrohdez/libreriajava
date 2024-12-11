package Libreria;

public class Editorial {
    String nombre, direccion, telefono, contacto;
    


    //setters establecer
    public void setNombre(String nombreSet){
        this.nombre=nombreSet;
    }
    public void setDireccion(String direccionSet){
        this.direccion=direccionSet;
    }
    public void setTelefono(String telefonoSet){
        this.telefono=telefonoSet;
    }
    public void setContacto(String contactoSet){
        this.contacto=contactoSet;
    }
    

    //getters obtener
    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public String getContacto(){
        return this.contacto;
    }

    //metodos personalisados
    public void informacioneditoriales (){

    }
    public void agregareditorial (){

    }
    public void cambiardatoseditorial(){

    }
    public void eliminareditorial(){

    }
}
