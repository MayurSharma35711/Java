public class fooThis {
 private String name;

fooThis( ) { this("Frank"); }
fooThis ( String name ) { this.name = name;}
public void demo( ) {
 String name = "Joey";
 System.out.println("local name: "+ name);
 System.out.println( "instance name: "+ this.name);
}
 public static void main (String [] args ) {
 fooThis test1 = new fooThis ( "John");
 test1.demo();
 fooThis test2 = new fooThis();
 test2.demo();
}
}