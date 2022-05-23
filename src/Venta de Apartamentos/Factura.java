package TallerUltimobanco;

import Utilidades.Control;
import java.util.ArrayList;
import java.util.List;

public class Factura extends Cuenta{

    public Factura(String Nombre, String Documento, String Telefono, String TipoApto, String NumeroCuenta, String movimiento, String Fecha, double Precio, double Valor, double Saldo,  Control movi) {
        super(Nombre, Documento, Telefono, TipoApto, NumeroCuenta, movimiento, Fecha , Precio, Valor, Saldo, movi);
    }   
    public Factura() {
        super();
    }

}
