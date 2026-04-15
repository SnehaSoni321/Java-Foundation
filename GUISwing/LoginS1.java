import javax.swing.*;
class LoginS1 extends JFrame {

LoginS1(String s1) {
 super(s1);
}
LoginS1() {
 
}
  public static void main(String []args) {
   LoginS1 s1 = new LoginS1("Welcome bro");
   s1.setVisible(true);
   s1.setSize(700,700);
   s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}