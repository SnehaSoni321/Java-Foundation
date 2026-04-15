class Example 
{
static void fun1()
{
int a = 2, b = 3;
int c = a+b;
System.out.println(c);
}
static void fun2()
{
System.out.println("B");

}
public static void main(String[] args) {
System.out.println("C");
fun1();
fun2();
}
}