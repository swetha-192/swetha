public class methodoverloading
{
public int add(int a,int b)
{
return a+b;
}
public int add(int a,int b,int c)
{
return a+b+c;
}
public double add(double a,double b)
{
return a+b;
}
public static void main(String args[])
{
methodoverloading obj=new methodoverloading();
System.out.println("sum of 10 and 20:"+obj.add(10,20));
System.out.println("sum of 10,20,and 30:"+obj.add(10,20,30));
System.out.println("sum of 10.5 and 20.5:"+obj.add(10.5,20.5));
}
}

