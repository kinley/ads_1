package testt234;

import java.io.*;

class Tree234App {

	public static void main(String[] args) throws IOException
	{
	double value;
	Tree23 theTree = new Tree23();
	theTree.insert(50);
	theTree.insert(40);
	theTree.insert(60);
	theTree.insert(30);
	theTree.insert(70);
	while(true)
	{
	System.out.print("������� �������: ");
	System.out.print("��������(s), �������(i), �����(f): ");
	char choice = getChar();
	switch(choice)
	{
	case 's':
	theTree.displayTree();
	break;
	case 'i':
	System.out.print("������� �������� ��� �������: ");
	value = getInt();
	theTree.insert(value);
	break;
	case 'f':
	System.out.print("������� �������� ��� ������:  ");
	value = getInt();
	int found = theTree.find(value);
	if(found != -1)
	System.out.println("������� "+value);
	else
	System.out.println("�� ������� "+value);
	break;
	default:
	System.out.print("������������ ����\n");
	}
	}
	}



	public static String getString() throws IOException
	{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String s = br.readLine();
	return s;
	}

	public static char getChar() throws IOException
	{
	String s = getString();
	return s.charAt(0);
	}

	public static int getInt() throws IOException
	{
	String s = getString();
	return Integer.parseInt(s);
	}

}
