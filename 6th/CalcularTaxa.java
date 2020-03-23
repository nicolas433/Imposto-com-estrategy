public class CalcularTaxa { 
  public double calcularExpresso(Taxa taxa, double peso) {
    return taxa.calcularExpresso()*peso;
  }
  public double calcularPadrao(Taxa taxa) {
    return taxa.calcularPadrao();
  }
}