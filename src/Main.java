class Main {
  public static void main(String[] args) {
     Bank dflt = new Bank();
     SNB snb = new SNB();
     SAB sab = new SAB();

      System.out.println("Interest Rate of normal Bank: " + dflt.getRateOfInterest() + "%");
      System.out.println("the intrst Rate of SNB: " + snb.getRateOfInterest() + "%");
      System.out.println("the intrest Rate of SAB: " + sab.getRateOfInterest() + "%");
  }
}

class Bank {
    public double getRateOfInterest() {
        return 0.0;
    }
}

class SNB extends Bank{
  public double getRateOfInterest() {
        return 8.2; 
    }
}

class SAB extends Bank{
  public double getRateOfInterest() {
        return 2.9; 
    }
}
