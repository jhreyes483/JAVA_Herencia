
package Herencia;


public class Persona {
    
    
    private String nombre;
    private String apellido;
    private int edad;
    
    //contructor
    public Persona(String nombre, String apellido, int edad)
    {    
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
      
     
     //gets   
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
