class Obclss
 {
    void Fun(int a)
	{
	   a = a+5;
           System.out.println("the increased value of variable =" +a);
	}
    public static void main(String args[])
	{
 	   Obclss Obj = new Obclss();
	   Obj.Fun(12);
	}
}