package ��������_���������;
//2_zadanie
import java.util.*;
public class Palindrom {

    private static Scanner in;

	public static void main(String args[])
    {
      in = new Scanner(System.in);
      System.out.println("������� ���� ������: ");
      String a=in.nextLine();
      System.out.println("���������� ������: "+a);
      StringBuffer str=new StringBuffer(a);
      StringBuffer str2=new StringBuffer(str.reverse());
      String s2=new String(str2);
      System.out.println("����������� ������: "+str2);
        if(a.equals(s2))    
            System.out.println("��� ���������");
        else
            System.out.println("��� �� ���������");
        }
}