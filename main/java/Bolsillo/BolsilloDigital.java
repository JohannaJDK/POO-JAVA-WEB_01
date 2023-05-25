package Bolsillo;

public abstract class BolsilloDigital 
{
    private double saldo;
    
    public BolsilloDigital(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public BolsilloDigital() {
    }
    // Clase abstracta, únuicamente se establecen sus métodos
    public double consultar()
    {
        return saldo;
    };
    public void recarga(double cantidadRecarga){};
    public void retiro(double cantidadRetiro){};
}
