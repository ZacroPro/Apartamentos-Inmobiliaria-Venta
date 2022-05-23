package TallerUltimobanco;

import Utilidades.Control;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    protected String Nombre; 
    protected String Documento;
    protected String Telefono;
    protected String Cuenta;
    protected String NumeroCuenta;
    protected String movimiento;
    protected String Fecha;
    protected double Precio;
    protected double Valor;
    protected double Saldo;

    Control movi;

    public Cuenta(String Nombre, String Documento, String Telefono, String Cuenta, String NumeroCuenta, String movimiento, String Fecha, double Precio, double Valor, double Saldo, Control movi) {
        this.Nombre = Nombre;
        this.Documento = Documento;
        this.Telefono = Telefono;
        this.Cuenta = Cuenta;
        this.NumeroCuenta = NumeroCuenta;
        this.movimiento = movimiento;
        this.Fecha = Fecha;
        this.Precio = Precio;
        this.Valor = Valor;
        this.Saldo = Saldo;
        this.movi = movi;
    }

  

    public Cuenta() {
        this.movi = new Control();
        this.Nombre = "";
        this.Documento = "";
        this.Telefono = "";
        this.Cuenta = "";
        this.Fecha = "";
        this.Valor = 0;
        this.NumeroCuenta = "";
        this.Saldo = 0;
        this.Precio = 0;

    }

    public String Saldo() {
        double s = 0, sl = 0;
        s += getValor();
        sl = s + getSaldo();
        return String.valueOf(sl);
    }

    public void consignar(double s, String f) {
        movi.control.add("\nConsignacion\nvalor: " + s + "\nFecha: " + f);
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Nombre=" + Nombre + ", Documento=" + Documento + ", Telefono=" + Telefono + ", Cuenta=" + Cuenta + ", NumeroCuenta=" + NumeroCuenta + ", movimiento=" + movimiento + ", Fecha=" + Fecha  + ", Valor=" + Valor + ", Saldo=" + Saldo + '}';
    }

    public Control getMovi() {
        return movi;
    }

    public void setMovi(Control movi) {
        this.movi = movi;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String control) {
        this.movimiento = control;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public double  getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
}
