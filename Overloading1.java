package coding1;

   class Helper1  {
    static int Multiply (int a, int b)
    {
      return a * b ;
    }
    static int Multiply (int a, int b, int c)
    {
      return a * b * c ;		 
    }
   }  		 
   
   class Overloading1 {

	public static void main(String[] args) {
		System.out.println(Helper1.Multiply(2, 4));
		System.out.println(Helper1.Multiply(2, 3, 4));
     }
}
