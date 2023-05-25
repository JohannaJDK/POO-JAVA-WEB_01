package Bolsillo;

public class Nequi extends BolsilloDigital
{
    private double saldo=100;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    };    
    public Nequi(double saldo) {
        this.saldo = saldo;
    }
    public Nequi() {
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
    //private double Saldo = 0;
    //private double Recarga;
  //  private double Retiro;

    //double TotalS =0;
    //double TotalR;
    //double TotalRe;
    
    //public double getSaldo() {
      //  return Saldo;
    //}
    //public void setSaldo(double saldo) {
     //   Saldo = Recarga;
    //}
    //public double getRecarga() {
     //   return Recarga;
   // }
    //public void setRecarga(double recarga) {
      //  Recarga = recarga;
    //}
    ////public double getRetiro() {
        //return Retiro;
    //}
    //public void setRetiro(double retiro) {
     //   Retiro = retiro;
//    }

  //  public double SaldoDinero(){
    //    double TotalS = Recarga - Retiro;
      //  return TotalS;
    //}

    //public double SaldoRecarga(){
      //   double TotalR = Saldo + Recarga;
        // return TotalR;
   // }

    //public double SaldoRetiro(){
      //  double TotalRe = Saldo - Retiro;
        //return TotalRe;

    //}
    //public static void setRecargarN(double recargarN) {
    //}
    //public static double RecargarN() {
      //  return 0;
    //}
    //public static void setConsultarN(double consultarN) {
    //}
    //public static double ConsultarN() {
      //  return 0;
    //}
    //public static double setRetirarN() {
      //  return 0;
    //}
    //public static void setRetirarN(double retirarN) {
    //}

}
