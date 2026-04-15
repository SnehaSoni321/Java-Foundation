class A extends Thread {
  public void run() {
     for(int i = 1; i<=5; i++) {
       if(i == 1) {
        Thread.yield();  // bss yield nhi likha sakte ab isliye Thread.yield likhe
	System.out.println("From thread A: i " + i);
       }
      System.out.println("End of thread A");
     }
   }
 }
class B extends Thread {
  public void run() {
     for(int i = 1; i<=5; i++) {
      System.out.println("From thread B: j " + i);

      if(i == 3)
      break;  // stop() tha hata diye
     }
     System.out.println("End of thread B");

   }
 }
class C extends Thread {
  public void run() {
     for(int i = 1; i<=5; i++) {
      System.out.println("From thread C: k " + i);

      if(i == 1)
	try {
	  sleep(1000);  // isko bhi Thread.sleep likhna chiye
        }
        catch(Exception e) {
  
        }
      
     }
     System.out.println("End of thread C");

   }
 }

class LifeCycleThreadStates {
  public static void main (String []args) {
    A thread1 = new A();
    B thread2 = new B();
    C thread3 = new C();

    System.out.print("Thread A is being started...");
    thread1.start();
    System.out.print("Thread B is being started...");
    thread2.start();
    System.out.print("Thread C is being started...");
    thread3.start();
  }
}