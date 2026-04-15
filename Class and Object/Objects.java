class Example
{
int x;
int y;

void fun1()
{
System.out.println("Example 1");
} 
void fun2() 
{
System.out.println("Example 2");
}
}

class Objects 
{
public static void main(String[] args) 
{
System.out.println("main");

Example e1 = new Example();
e1.x = 5;
e1.fun1();
System.out.println(e1.x);

}
 }