public class Sudeste implements Taxa{
  private double Taxa;

  public Sudeste() { 
    this.Taxa = 25.00; 
  } 
  public double getSudeste() {
    return this.Taxa;
  }

  @Override 
  public double calcularPadrao() { 
    return getSudeste();
  }
  public double calcularExpresso() {
    return getSudeste();
  }
}