package edik;

class vector{
	int a, b;
	void init(int xx, int yy){
		a = xx; b = yy;
	}
	void plusing(vector vv){
		a = a+vv.a;
		b = b+vv.b;
	}
	void minusing(vector vv){
		a = a-vv.a;
		b = b-vv.b;
	}
	void constconjunction(int n){
		a = a*n;
		b = b*n;
	}
	int scalarconjunction(vector vv){
		int abcos = a*vv.a+b*vv.b;
		return abcos;
	}
}

public class classes8 {
	public static void main(String args[]){
		vector v1 = new vector();
		vector v2 = new vector();
		v1.init(5, 7);
		v2.init(9, 3);
		v1.plusing(v2);
		v1.minusing(v2);
		v1.constconjunction(5);
		v1.scalarconjunction(v2);
	}
}