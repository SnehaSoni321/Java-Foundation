class Shape {
 void area() {
  System.out.println("Calculate area");
 }
}
class Circle extends Shape {
  void area() {
  System.out.println("Area of circle");
 }
}
class Rectangle extends Shape {
  void area() {
  System.out.println("Area of rectangle");
 }
}

// Run Time Polymorphism (Method Overriding)


class RunTimePolymorphism {
 public static void main(String []args) {
  Shape obj = new Circle();
  obj.area();
 }
}