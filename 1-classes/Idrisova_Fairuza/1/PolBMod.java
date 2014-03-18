import java.util.*;
import java.lang.Math;
//Polinoms MOD (x^2+1) and field = p {0...p-1}. Their operations.
public class PolBMod {
	int k, b;
	String ss;
	int p; 
	private int[] a = new int[200]; 
	private	int deg; 
	private	int ko;

	public  PolBMod (String ss, int p){
		this.ss = ss;
		this.p = p;
		Massivmaker(ss);

	}	

	public void Massivmaker(String ss){
		int len = ss.length();
		int poz;

		while (len>0){
						poz = ss.lastIndexOf('+');
						if (poz>ss.lastIndexOf('-')){
							poz = ss.lastIndexOf('-');
						}
					PartKoef(ss.substring(poz,ss.length()));	//������������� �������� ������ ���� ��������	
					a[deg]=ko; 
					ss = ss.substring(0,poz); // ������� �������������
					len = ss.length(); //��������� ����� �����
		}
						Lin(); //���������� ��������������
						this.k = Ostat(a[1]); //� ���� � ���. �������� ������������.
						this.b = Ostat(a[0]);
						Writing(k,b);
						Sq(k,b);
						
	}

		public void PartKoef (String s) { //��������� ����� �������� �� ���������� ������ ��� �����
										//����� ���������� � �������. ������� - ������ �������.
			 
			 if (s.indexOf('^') != -1){
				 deg = Integer.parseInt(s.substring(s.indexOf('^')+1,s.length()));
				 if (s.indexOf('^')>1){
				 ko = Integer.parseInt(s.substring(0,s.indexOf('^')-2));}
			 }
			 		else if (s.indexOf('x') != -1){
					 deg = 1;
					 if (s.indexOf('x')>0){
					 ko = Integer.parseInt(s.substring(0,s.indexOf('x')-1));}
			 		}
			 				else  {
			 					deg = 0;
			 					ko = Integer.parseInt(s.substring(0,s.length()));
			 				}
		}

		public void Lin(){ //������� �� x^2+1; ������ ��� ��������
						for (int i = deg;i>1;i--){ 
								a[i-2]-=a[i];
						}
		}
		
				public int get_k(){
					return k;
				}

				public int get_b(){                        
					return b;
				}

				public void Writing(int kw, int bw){ //����� ��������� ���������
					System.out.println("���������:  "+ Ostat(kw)+"x "+ ' ' +Ostat(bw));
				}
				
				public int Ostat(int o){ //M����� ��� �����
					return ((o+p)%p);
				}
				
				public void Sq(int kn, int bn){  //������ ��� ��������� ���������
					
					System.out.println("������ ��������� = "+ -1*bn*Ostat((int)Math.pow(kn, p-2)));
				}
				
				public void Summ(PolBMod pp){
					int k2 = pp.get_k();
					int b2 = pp.get_b();
					Writing(k+k2,b+b2);
				}
				public  void Minus(PolBMod pp){
					int k2 = pp.get_k();
					int b2 = pp.get_b();
					Writing(k-k2,b-b2);
				}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �� ������ (x^2+1) � �����  p = {0...p-1}.\n � �������� ��� ����.\n ������� ������ p");
		int p = sc.nextInt();
		sc.nextLine();
		System.out.println("������ �������");
		PolBMod Po = new PolBMod(sc.nextLine(), p);

		System.out.println("������ ������ �������");
		PolBMod Po2 = new PolBMod(sc.nextLine(), p);
		sc.close();
		System.out.println("����� ���������: ");							
		Po.Summ(Po2);
		System.out.println("�������� ���������: ");
		Po.Minus(Po2);
		
	}

}