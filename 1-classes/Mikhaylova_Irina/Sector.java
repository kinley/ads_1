public class Sector {

	private Vertex a,b,c;	//три вершины сектора
	
	public class Vertex{	//конструктор для вершины
		
		public int x,y;	//координаты вершины
		
		public Vertex(int x,int y){
			this.x=x;
			this.y=y;
		}
		
		public double GetLength(){	//длина вектора
			return Math.sqrt(this.x * this.x + this.y * this.y);	
		}
		
		public double LengthSqr(){	//квадрат длины(удобно в одном методе)
			return GetLength() * GetLength();
		}
	}
	
	public Sector(int x1, int x2,int x3,int y1,int y2,int y3){	//конструктор сектора(3 вершины)
		
		a=new Vertex(x1,y1);		//  <-ЦЕНТРАЛЬНЫЙ УГОЛ
		b=new Vertex(x2,y2);
		c=new Vertex(x3,y3);
	}
	
	
	
	
	
	public boolean Check(){	//проверка сектора на правильность
		if(this.a.GetLength()==this.b.GetLength() || this.a.GetLength()==this.c.GetLength() || this.b.GetLength()==this.c.GetLength())
				return true;
		return false;
	}
	
	public double Angle(){	//центральный угол(надеюсь)
		return Math.acos((this.b.LengthSqr()+this.c.LengthSqr()-this.a.LengthSqr())/(2*this.b.GetLength()*this.c.GetLength()));
	}
	
	public double Radius(){	//Радиус
		if(Check()){
		if(this.a.GetLength()==this.b.GetLength()){
			return this.a.GetLength();
		}
		else return this.b.GetLength();
		}
		return 0;
	}
	
	public double Square(){	//Площадь сектора
		return (Math.PI*this.Radius()*this.Radius()*this.Angle())/360;
	}
	
	public double LengthSegment(){	//Длина дуги
		return Math.PI*this.Radius()*(this.Angle()/180);
	}
}