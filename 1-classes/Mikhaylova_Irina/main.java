public class main {
	public static void main(String[] args) {		//не заработало(
		Sector square=new Sector(5,10,8,4,7,6);
		System.out.println("Sector check  = "+square.Check());
		System.out.println("Sector angle = "+square.Angle());
		System.out.println("Sector radius = "+square.Radius());
		System.out.println("Sector square = "+square.Square());
		System.out.println("Sector length segment = "+square.LengthSegment());
	}

}
