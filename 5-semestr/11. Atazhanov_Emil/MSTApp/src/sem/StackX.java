package sem;

public class StackX {
		private final int size = 20;
		private int[] st;
		private int top;
		public StackX()//конструктор
		{
			st = new int[size];//создание массива
			top = -1;
		}
		public void push(int j)//размещение элемента в стеке
		{
			st[++top] = j;
		}
		public int pop()//извлечение элемента из стека
		{
			return st[top--];
		}
		public int peek()//чтение с вершины стека
		{
			return st[top];
		}
		public boolean isEmpty()//true, если стек пуст
		{
			return (top == -1);
		}
	}

