
package Utilidades;

import java.util.ArrayList;
import java.util.List;

public class Control {
     public List<String> control;

    public Control(List<String> control) {
        this.control = control;
    }

    public Control() {
        this.control = new ArrayList<>();
      
    }

    @Override
    public String toString() {
        return "Control:\n"
                + datos();
    }

    public String datos() {
        String datos = "";
        for (String mov : this.getControl()) {
            datos += mov + "\n";
        }
        return datos;
    }

    public List<String> getControl() {
        return control;
    }

    public void setControl(List<String> control) {
        this.control = control;
    }  
}
