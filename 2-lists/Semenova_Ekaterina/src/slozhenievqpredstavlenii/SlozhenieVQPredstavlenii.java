package slozhenievqpredstavlenii;
/**� ��� � �� ������ ������� ���, ����� � ������ �� ���������� ������� ������������
 	*����������� ��������� ���������� 25.04.14
**/
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Scanner;
public class SlozhenieVQPredstavlenii {
    private static Scanner sc;
 
    
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("myfile.txt"); //�� ����� myfile.txt ����������� 2 �����. 
            sc = new Scanner(fis);
            while(sc.hasNext()) {
            	int q = sc.nextInt();//� ����� ������� ���������? ��������������, ��� ������������ ������� ������ ������ �����
            int num1= sc.nextInt();//������ �����
            int n1 = num1; //��������� �����, ����� �� �������� ��� � ���� ����������
       
            LinkedList<Integer> list1 = new LinkedList<Integer>();//� ������ �������� ������ ����� � �������� �������
            while(num1 != 0) { //���� ������ ����� �� ������ ������ ����
            	int j = num1 % 10; //���� ����� �� 10
            	list1.add(j);//������� �� ������� ��������� � ������
            	num1 = num1 / 10;//������ �������� � ����� ������ �� �������
            	
            }

            int num2= sc.nextInt();//������ �����
            int n2 = num2;//��������� 2 �����, ����� �� ��������
            LinkedList<Integer> list2 = new LinkedList<Integer>(); //������ ������ � ��������� ����� �������� ���� ��������� �������� ����
            while ((num2 != 0)&&(list1.isEmpty()!=true)){//���� ������ ����� �� ����� ���� � ������ ����� �� ����� � ������
            	int k = num2 % 10;//��������� ������� �� ������� 2 ����� �� 10
            	list2.add(k + list1.pollFirst()-q+10);//��������� ������� � ��������� ������ ������� �����
            	num2 = num2 / 10;	//����� �������� � ����� ������ 2 �����
            }
            if (n1>n2) { //���� ������ ����� ������ �������
            while (list1.size()!=0) { //���� ���������� ��������� �������� �� �������� � ������
            	list2.add(list1.pollFirst()); //�������� � ������ ������ � ������ ������. ����� � ���� ����� �������� ������. ������ ���������� �������
            }
            int s = 0;//���������� � ���(��� �� �������� � �����)
            while (list2.size()!=0) { //���� ������ �� ����
            	if (list2.getFirst()>q-1){ //���� ������ ������� ������ ������ �������� ������� ������� ���������
            		list1.addFirst(list2.pollFirst() % 10 + s);//����� ������� �� ������� �� ������ ������������ � ������ � ������������ �� ��� �� ��������� � ���
            		s = 1;//������� ���������� � ���
            	}
            	else {//���� ����� ����������
            		list1.addFirst(list2.pollFirst() +s);//�� ���������� �� ��� � ���(���� ���� 0) � ���������� � ������ ������
            		s = 0;//������ � ��� 0
            	}
            }
            
            
           System.out.println(list1);// ������� ������������� ������
            }
            
            else//���� �� ������ ����� ������
            { while (num2 !=0){//���� 2 ����� �� ��������
            	list2.add(num2 % 10);//������� �� ������� �� 10 � ������
            	
            	num2 = num2/10;//�������� � ����� ������
            	
            }//� ������ ���������� �� ������� ����� ������ ����� ������: ���������� � ���, ����������, ���������� � ������ � �.�.
            int s = 0;
            while (list2.size()!=0) {
            	if (list2.getFirst()>q-1){
            		list1.addFirst(Integer.parseInt(Integer.toString(list2.pollFirst() - q),q));
            		s = 1;
            	}
            	else {
            		list1.addFirst(Integer.parseInt(Integer.toString(list2.pollFirst() + s),q));
            		s = 0;
            	}
            }
            System.out.println(list1);//������� ������
            }
            } } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
//��������! ��������� ��������!