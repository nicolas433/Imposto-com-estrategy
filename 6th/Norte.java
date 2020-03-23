public class Norte implements Taxa{
  private double Taxa;

  public Norte() { 
    this.Taxa = 45.00; 
  } 
  public double getNorte() {
    return this.Taxa;
  }

  @Override 
  public double calcularPadrao() { 
    return getNorte();
  }
  public double calcularExpresso() {
    return getNorte();
  }
}