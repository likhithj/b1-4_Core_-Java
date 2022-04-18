class Main {
  public static void main(String[] args) 
  {
	  Integer aObj = Integer.valueOf(23);
    Double bObj = Double.valueOf(5.55);
    int a = aObj.intValue();
    double b = bObj.doubleValue();

    System.out.println("The value of a: " + a);
    System.out.println("The value of b: " + b);
  }
}
