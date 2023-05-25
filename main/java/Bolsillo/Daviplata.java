package Bolsillo;

public class Daviplata extends BolsilloDigital
{
    private double saldo=100;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    };    
    public Daviplata(double saldo) {
        this.saldo = saldo;
    }
    public Daviplata() {
    }
    public double consultar()
    {
        return saldo;}
    ;
    public void recarga(double cantidadRecarga)
    {
        setSaldo(saldo += cantidadRecarga);
    };
    public void retiro(double cantidadRetiro)
    {
        setSaldo(saldo -= cantidadRetiro);   
    }
    
}
