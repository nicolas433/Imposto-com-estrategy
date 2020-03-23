public class RioDeJaneiro implements Imposto {
  private double valor; 
  
  public RioDeJaneiro(double valor) { 
    this.valor = valor; 
  } 
  
  @Override 
  public double calcular() { 
    return this.valor * 0.08;
  }
}