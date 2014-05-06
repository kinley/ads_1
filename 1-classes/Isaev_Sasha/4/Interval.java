package hellointerval;

	public class Interval {
		public int a;
		public int b;
		public int c;
		public int d;
   
	public Interval(int a,int b,int c,int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	public void razmah(){
		Interval A=this; 	
		int z=A.b-A.a;
		System.out.println ("Размахом является " +z );	
	}
	
	public void granitsa(){
		System.out.println("Границей являются  " +a+ ","+b );
	}
    
	public void summa(){
		Interval A=this;
		int t =A.a+A.c;
		int w=A.b+A.d;
		System.out.println("Сумма [a,b]+[c,d]=[a+c,b+d]=[ "+ t+","+w+" ]");
    }
    
    public void raznostb(){
    	Interval A=this;     
    	int u= A.a - A.c;
    	int r=A.b - A.d;
    	System.out.println("Разность [a,b]-[c,d]= [a-c,b-d]=[" + u + "," + r + " ]");
    }
    
    public void chastnoe(){
    	Interval A=this;
    	double q; 
    	double p;
    	double h;
    	double m;
    	q=1.0/A.d ;
    	p=1.0/A.c;
    	h=A.a*q;
    	m=A.b*p;
    	System.out.println("Частное [a,b]/[c,d]=[a,b]*[1/d,1/c]=["+h+","+m+ "]");
    }
    
    public void proizvedenie(){
        Interval A=this;
    	int l=A.a*A.c;
        int j=A.a*A.d;
        int s=A.b*A.c;
        int g=A.b*A.d;
        int MinProizv,MaxProizv;
        int[] Mas={l,j,s,g};
        MinProizv=Mas[0];
        MaxProizv=Mas[0];
        for (int i=1;i<Mas.length;i++){
        	if (Mas[i]>MaxProizv){
        		MaxProizv=Mas[i];
        	}	
        	if	(Mas[i]<MinProizv){
        		MinProizv=Mas[i];
        	}
        	}
        System.out.println("минимальное и максимальное от произведения [a,b]*[c,d]=[MIN(ac,ad,bc,bd),MAX(ac,ad,bc,bd)]=["+MaxProizv+ "," +MinProizv+" ]");	
   }
}



