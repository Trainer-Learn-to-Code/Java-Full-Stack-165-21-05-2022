package inheritance2;
class JavaExample implements X, Y
{
   public void myMethod()
   {
       System.out.println("Implementing more than one interfaces");
   }
   public static void main(String args[]){
	   JavaExample obj = new JavaExample();
	   obj.myMethod();
   }
}