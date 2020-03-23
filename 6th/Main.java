/*
Sul: R$ 20.00, 
Norte: R$ 45.00, 
Nordeste: R$ 50.00, 
Sudeste: R$ 25.00, 
Centro-Oeste: R$ 35.00
*/
//Taxa
class Main {
  public static void main(String[] args) {
    CalcularTaxa calculadora = new CalcularTaxa(); 

    Sul Sul = new Sul();
    
    System.out.println(calculadora.calcularExpresso(Sul, 10));
    System.out.println(calculadora.calcularPadrao(Sul));
  }
}