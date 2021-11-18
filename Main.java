public class Main {
  public static void main(String[] args) {
    System.out.println("#############Arreglos");
    String mensajes[] = {"Mensaje 1", "Mensaje 2", "Mensaje 3"};
    try {
    for (int i = 0; i<=3; i++){
      System.out.println(mensajes[i]);
    }
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: apuntador fuera del rango del arreglo");
      System.out.println(e);
    }
    System.out.println("#############Aritmética");
    try{
      // Integer denominador = null;
      // floar equis = 5/denominador;
      float equis = 5/0;
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    } catch(ArithmeticException e){
      System.out.println("Error:"+e.getMessage());
    } catch(NullPointerException e){
      System.out.println("Error:"+e.getMessage());
    }

    System.out.println("#############Propagación");
    try {
      int div = division(10,0);
    } catch(ArithmeticException e){
      System.out.println("Error:"+e.getMessage());
    }
    int div2 = division2(11,0);
    System.out.println(div2);

    System.out.println("#############throw-throws");
    int div3 = 0;
    try {
      div3 = division3(10,0);
    } catch(ArithmeticException e){
      System.out.println("Error:"+e.getMessage());
    }
    System.out.println(div3);

    System.out.println("#############throw-throws");
    try{
    Cuenta micuenta = new Cuenta();
    micuenta.depositar(2000);
    micuenta.consultaSaldo();
    micuenta.retirar(1500);
    micuenta.consultaSaldo();
    micuenta.retirar(650);
    } catch (SaldoInsuficienteException e){
      System.out.println(e.getMessage());
    }
  }

  private static int division(int a, int b){
    int c = a/b;
    return c;
  }
  private static int division2(int a, int b){
    int c = 0;
    try {
      c = a/b;
    } catch(ArithmeticException e){
      System.out.println("Error:"+e.getMessage());
    }
    return c;
  }
  private static int division3(int a, int b) throws ArithmeticException{
    if (b==0) throw new ArithmeticException("No lo hagas");
    int c = a/b;
    return c;
  }
}
