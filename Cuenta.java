public class Cuenta {
  private double saldo;
  private int retiros;

  public Cuenta(){
    saldo = 0;
    retiros = 0;
  }
  public void depositar(double monto) throws SaldoMaximoSuperadoException{
    if (monto>20000) throw new SaldoMaximoSuperadoException();
    System.out.println("Depositando: " +monto);
    saldo += monto;
    retiros++;
  }
  public void retirar(double monto) throws SaldoInsuficienteException{
    if (saldo<monto) throw new SaldoInsuficienteException();
    System.out.println("Retirando: " +monto);
    saldo -= monto;
  }
  public void consultaSaldo(){
    System.out.println("Hay: " +saldo);
  }
}
