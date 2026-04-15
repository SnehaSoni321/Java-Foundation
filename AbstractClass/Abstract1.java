abstract class Animal {
  void eat() {                       // eat is a normal method 
    System.out.println("Eating 1");
  }
  abstract void eats();             // eats is a abstract method that's way we overrite to it in child class
}

class Dog extends Animal {
  void eats() {
    System.out.println("Eating 2");
  }
}

class Abstract1 {
  public static void main(String []args) {
    Dog d1 = new Dog();
    d1.eat();
    d1.eats();
  }
}


