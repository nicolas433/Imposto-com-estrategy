public class Ceara implements Imposto {
  private double valor; 
  
  public Ceara(double valor) { 
    this.valor = valor; 
  } 
  
  @Override 
  public double calcular() { 
    return this.valor * 0.1;
  }
}