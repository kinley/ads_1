package faktorial;

public class ��������� {
	int fact(int n)
	{
	  if (n<2) return 1;
	else return n*fact(n-1); 
	}
	
	int main()
	{
	  System.out.println(Math.log(fact(10))); 
	return 0; 
    }
}