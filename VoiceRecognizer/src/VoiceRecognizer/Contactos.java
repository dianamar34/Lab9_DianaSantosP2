
package VoiceRecognizer;


public class Contactos extends Usuarios{
    protected String nombre;
    protected String email;
    protected int numero;

    public Contactos() {
    }

    public Contactos(String nombre, String email, int numero) {
        this.nombre = nombre;
        this.email = email;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
