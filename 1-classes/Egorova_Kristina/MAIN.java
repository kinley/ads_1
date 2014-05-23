
public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polus A=new Polus(4,5);
		Polus B=new Polus(3,2);
		System.out.println(A.voltage());
		System.out.println(B.voltage());
		A.parallel_connection(B);
	}

}
