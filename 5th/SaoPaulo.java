public class SaoPaulo implements Imposto {
  private double valor; 

  public SaoPaulo(double valor) { 
    this.valor = valor; 
  } 
  
  @Override 
  public double calcular() { 
    return this.valor * 0.05;
  }
}