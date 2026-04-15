class Printing {
 synchronized void print(char ch) {
   for(int i = 0; i<=10; i++) 
   {
     for(int j = 0; j<=i; j++) 
     { 
       System.out.print(ch);
     }
    System.out.println();
   }
 }
}

class A extends Thread {
  Printing p;
  A(Printing p)
  {
    this.p = p;
  } 
 public void run() {
  p.print('*');
 }
}

class B extends Thread {
  Printing p;
  B(Printing p)
  {
    this.p = p;
  } 
 public void run() {
  p.print('#');
 }
}

class synchronization {
  public static void main(String [] args) {
    Printing aa = new Printing();
 
    A threadA = new A(aa);
    B threadB = new B(aa);

    threadA.start();
    threadB.start();
  }
}