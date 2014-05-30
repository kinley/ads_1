package class11;

public class PolarTriangle {
	public double ra, aa, rb, ab, rc, ac; //���� ����������(����� ������� r, ��� ���� a)
	public double AB, BC, AC, Alpha, Beta, Gamma, Sq;	
	
	public PolarTriangle(double ra, double aa, double rb, double ab, double rc, double ac)//������ ��� �����������
	{
		this.ra = ra;
		this.aa = aa;
		this.rb = rb;
		this.ab = ab;
		this.rc = rc;
		this.ac = ac;
	}
	public void Show()//����� � �������
	{
		PolarTriangle A = this;
		System.out.print("����������� � ��������� � ������:\nA("+A.ra+","+Math.toDegrees(A.aa)+"�) "+ 
															"\nB("+A.rb+","+Math.toDegrees(A.ab)+"�) " +
															"\nC("+A.rc+","+Math.toDegrees(A.ac)+"�)\n");
	}
	public void Length() //����� ��� ���������� ���� ������ ������ ������������
	{
		this.AB = Math.sqrt(ra*ra+rb*rb - 2*ra*rb*Math.cos(ab-aa));
		this.BC = Math.sqrt(rb*rb+rc*rc - 2*rb*rc*Math.cos(ac-ab));
		this.AC = Math.sqrt(ra*ra+rc*rc - 2*ra*rc*Math.cos(ac-aa));
		System.out.println(	"\n����� ������� AB = " + AB + 
							"\n����� ������� BC = " + BC + 
							"\n����� ������� AC = " + AC);
	}
	public void Angle()//����� ��� ����������� ����� ����� ��������� ������ ������������
	{
		this.Alpha=(Math.acos((AC*AC+AB*AB-BC*BC)/(2*AC*AB)));
		this.Beta=(Math.acos((BC*BC+AB*AB-AC*AC)/(2*AB*BC)));
		this.Gamma=(Math.acos((AC*AC+BC*BC-AB*AB)/(2*AC*BC)));
		System.out.println(	"\n���� ����� ��������� AB � �� = " + Math.toDegrees(Alpha) + 
							"\n���� ����� ��������� AB � BC = " + Math.toDegrees(Beta) + 
							"\n���� ����� ��������� BC � �� = " + Math.toDegrees(Gamma));
	}
	public void Square()//������� ������������
	{
		this.Sq = (BC*AC*Math.sin(Gamma))/2;
		System.out.println("\n������� ������������ = " + Sq);
	}
	public PolarTriangle Turn(PolarTriangle a, double ang)
	{
		PolarTriangle b = new PolarTriangle(a.ra,a.aa,a.rb,a.ab,a.rc,a.ac);
		b.ra = a.ra;
		b.aa = a.aa+ang;
		b.rb = a.rb;
		b.ab = a.ab+ang;
		b.rc = a.rc;
		b.ac = a.ac+ang;
		PolarTriangle c = new PolarTriangle(b.ra,b.aa,b.rb,b.ab,b.rc,b.ac);
		System.out.println("\n��� �������� �� " + Math.toDegrees(ang) + "�  �� ��������\n");
		c.Show();
		return a;
	}
	public PolarTriangle Shift(PolarTriangle a, double sh)//����� ������������
	{
		PolarTriangle b = new PolarTriangle(a.ra,a.aa,a.rb,a.ab,a.rc,a.ac);
		b.ra = (sh*sh)/a.ra;
		b.aa = a.aa;
		b.rb = (sh*sh)/a.rb;
		b.ab = a.ab;
		b.rc = (sh*sh)/a.rc;
		b.ac = a.ac;
		PolarTriangle c = new PolarTriangle(b.ra,b.aa,b.rb,b.ab,b.rc,b.ac);
		System.out.println("\n��� ������ �� ��������\n");
		c.Show();
		return a;
	}
	
}
