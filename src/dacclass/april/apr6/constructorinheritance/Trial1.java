package dacclass.april.apr6.constructorinheritance;

//constructor in inheritance 
class Test
{
	Test()
	  {
		  System.out.println("base constructor");
	  }
	  
}
class Trail extends Test
{
	Trail()
	  {
		  System.out.println("parent constructor");
	  }
	  
}
public class Trial1 extends Trail
{  
  public Trial1()
  {
	  System.out.println("child constructor  ");
  }
  public static void main(String a[])
  {
	  Trail r= new Trail();
	 //note whenever we make object of a class first its parent default 
	  //or no argument constructor is called 
  }
  
}

