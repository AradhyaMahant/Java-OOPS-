public class Cal
{
public static void main(String args[])
 {
	int a= Integer.parseInt(args[0]);
	String b= args[1];
	int c= Integer.parseInt(args[2]);
	int result=0;

	if(b.equals("+"))
	  {  
	    result=a+c;
	  }
	else if(b.equals("-"))
	  {  
	    result=a-c;
	  }
	else if(b.equals(" *c "))
	  {  
	    result=a*c;
	  }
	else if(b.equals("/"))
	  {  
	    result=a/c;
	  }
	else
	  {
	    System.out.println("not valid");
	  }
	System.out.println("result is ="+result);
 }
}
		