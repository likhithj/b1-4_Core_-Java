package assignment4;
//import java.io.*;
import java.util.*;
class hh {

  static int person(int n, int k)
  {
      if (n == 1)
          return 1;
      else
          
          return (person(n - 1, k) + k - 1) % n + 1;
  }

  
  public static void main(String[] args)
  {
      int n = 5;
      int k = 2;
      System.out.println("The chosen place is "
                         + person(n, k));
  }
}



