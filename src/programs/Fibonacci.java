package programs;

public class Fibonacci {
	public int fib(int n) {

        int First = 0, Second = 1;
       

       for (int i = 1; i <= n; ++i)
        {
         

            int sum = First + Second;
            First = Second;
            Second = sum;
        }
		return Second;
    }
    
}





