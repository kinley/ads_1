package sem;

public class StackX {
		private final int size = 20;
		private int[] st;
		private int top;
		public StackX()//�����������
		{
			st = new int[size];//�������� �������
			top = -1;
		}
		public void push(int j)//���������� �������� � �����
		{
			st[++top] = j;
		}
		public int pop()//���������� �������� �� �����
		{
			return st[top--];
		}
		public int peek()//������ � ������� �����
		{
			return st[top];
		}
		public boolean isEmpty()//true, ���� ���� ����
		{
			return (top == -1);
		}
	}

