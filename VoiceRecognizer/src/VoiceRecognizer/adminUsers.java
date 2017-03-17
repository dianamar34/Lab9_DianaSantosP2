
package VoiceRecognizer;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminUsers {
    
    private ArrayList<Usuarios> users = new ArrayList(); //rom
    private File archivo = null;

    public adminUsers(String path) {
        archivo = new File(path);//archivo que guarda la info
    }

    public ArrayList<Usuarios> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuarios> users) {
        this.users = users;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    //mutador extra para un solo user
    public void setUsuarios(Usuarios a){
        users.add(a);
    }
    
    //cargar el archivo binario. Pasar del ROM al RAM
    public void cargarArchivo(){
        try {
            users = new ArrayList();
            Usuarios temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuarios) objeto.readObject()) != null){
                        users.add(temp);
                    }
                } catch (EOFException e) {//siempre ocuure
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //escribir
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuarios t : users) {
                bw.writeObject(t);
            }
            bw.flush();
            
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
    
}
