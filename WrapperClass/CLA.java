class CLA {
/*
public static void main(String []args) { 
 System.out.println(args[0]);
 System.out.println(args[1]);
 System.out.println(args[2]);
 System.out.println(args[3]);
}
*/

public static void main(String []args) {
int i, s=0;
for(i=0; i<args.length; i++) {
s = s + Integer.parseInt(args[i]);
}
System.out.println("Avarge is " + s/args.length);

}
}