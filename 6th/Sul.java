public class Sul implements Taxa{
  private double Taxa;

  public Sul() { 
    this.Taxa = 20.00; 
  } 
  public double getSul() {
    return this.Taxa;
  }

  @Override 
  public double calcularPadrao() { 
    return getSul();
  }
  public double calcularExpresso() {
    return getSul();
  }
}