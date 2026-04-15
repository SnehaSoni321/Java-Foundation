class A extends Thread {
  public void run() {
    System.out.println("Thread A started");
    for(int i = 1; i<=5; i++) {
      System.out.println("form thread A: i= " +i);
    }
     System.out.println("Thread A End Here...");
  }
}

class B extends Thread {
  public void run() {
    System.out.println("Thread B started");
    for(int j = 1; j<=5; j++) {
      System.out.println("form thread B: j= " +j);
    }
     System.out.println("Thread B End Here...");
  }
}

class C extends Thread {
  public void run() {
    System.out.println("Thread C started");
    for(int k = 1; k<=5; k++) {
      System.out.println("form thread C: k= " +k);
    }
     System.out.println("Thread C End Here...");
  }
}

class ThreadPriority {
  public static void main(String []args) {
   A aa = new A();
   B bb = new B();
   C cc = new C();
  cc.setPriority(Thread.MAX_PRIORITY);
  bb.setPriority(aa.getPriority()+1);
  aa.setPriority(Thread.MIN_PRIORITY);
  System.out.println("Thread A started...");
  aa.start();
  System.out.println("Thread B started...");
  bb.start();
  System.out.println("Thread C started...");
  cc.start();
  System.out.println("Main Thread Ended:");
  }

}