public class CentroOeste implements Taxa{
  private double Taxa;

  public CentroOeste() { 
    this.Taxa = 35.00; 
  } 
  public double getCentroOeste() {
    return this.Taxa;
  }

  @Override 
  public double calcularPadrao() { 
    return getCentroOeste();
  }
  public double calcularExpresso() {
    return getCentroOeste();
  }
}