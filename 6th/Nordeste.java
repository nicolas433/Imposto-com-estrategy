public class Nordeste implements Taxa{
  private double Taxa;

  public Nordeste() { 
    this.Taxa = 50.00; 
  } 
  public double getNordeste() {
    return this.Taxa;
  }

  @Override 
  public double calcularPadrao() { 
    return getNordeste();
  }
  public double calcularExpresso() {
    return getNordeste();
  }
}