
package VoiceRecognizer;

import java.util.ArrayList;


public class Usuarios {
    protected String username;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected int edad;
    ArrayList contactos = new ArrayList();
    
    public Usuarios() {
    }

    public Usuarios(String username, String nombre, String apellido, String email, int edad) {
        this.username = username;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Usuarios(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return  username ;
    }

    
    
}
