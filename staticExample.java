public class staticExample{
 static int var1=10;
 static String var2="PINTU";
int a;
int b;

  staticExample(int c,int d)
   {
    a=c;
    b=d;
    
}
 static void display()
{
 System.out.println("welcome this is 1st static method");
 
}
static void show()
{
 System.out.println("welcome this is 2nd  static method");

}
public void print1()
{
 System.out.println(a);
 System.out.println(b);
 System.out.println(var1);
  staticExample.show();
}
public static void main(String args[])
{
 staticExample ob=new staticExample(15,16);
  ob.print1();
 System.out.println(var1);
 System.out.println(var2);
 System.out.println(ob.a);
System.out.println(ob.b);
staticExample.display();
}
}

