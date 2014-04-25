class nod{

	public static void main (String [] args) {
	int c;
		int a=75; //Здесь можно прописать ввод с клавиатуры
		int b=25;
		while (b!=0) {
			c=a%b;
			a=b;
			b=c;
		}
		System.out.print("NOD is " + a);
}
}
