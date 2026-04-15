abstract class Demo {
  int x, y;
  void f1() {

  }

  abstract void f2();

}
class Demo1 extends Demo {
  int z;
  void f2() {
  
  }
}

class Abstract {
 public static void main(String []args) {
   Demo1 d1 = new Demo1();
   d1.f2();
 }
 
}