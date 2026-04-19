class Area {
    static void fun1() {
        System.out.println("C");
    }
}


public class Example1 {

    static void fun1() {
        System.out.println("A");
    }
    static void fun2() {
        System.out.println("B");
    }
    public static void main(String []args) {
        fun1();
        Example1.fun2();
        Area.fun1();
    }
}
