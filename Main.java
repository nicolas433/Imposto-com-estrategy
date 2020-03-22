class Main { 
  public static void main(String[] args) { 
    CalcularImposto calculadora = new CalcularImposto(); 

    SaoPaulo sp = new SaoPaulo(100.0); 
    Ceara ce = new Ceara(100.0); 
    RioDeJaneiro rj = new RioDeJaneiro(100.0); 

    System.out.println(calculadora.calcular(sp)); 
    System.out.println(calculadora.calcular(ce)); 
    System.out.println(calculadora.calcular(rj)); 
  }
} 