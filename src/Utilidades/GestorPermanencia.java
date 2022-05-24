
package Utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorPermanencia {
        private static final String archivo = "Factura.cam";
    public static boolean guardar(Object dato){
        File file = new File(archivo);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dato);
            oos.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorPermanencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestorPermanencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static Object recuperar(){
        File file = new File(archivo);
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object objeto = ois.readObject();
            return objeto;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorPermanencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(GestorPermanencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

