package class_18;

import java.util.Scanner;

public class zadanie05 {
	//������� ��������� ����� ����������� �������
    public static long factorial(int n) {
        if(n!=1) 
        	return n * factorial(n - 1);

        else 
        	return 1;
        
    }

    public static void main(String[] args) {
    	Scanner r = new Scanner(System.in);
    	System.out.println("������� ����� N");
    	int N = r.nextInt();
    	//������� log(N!)
        System.out.print(Math.log(factorial(N)));
    }

}