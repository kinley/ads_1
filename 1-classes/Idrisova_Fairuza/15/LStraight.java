/*Классы (Прямая Y=k*X+b, заданная парой (k,b)).
Методы класса - создать прямую, р-поворотом построить по одной прямой 
другую (домножением коэффициента  «k» на «р»), параллельный d-сдвиг 
(по прямой (k,b) дает прямую (k,b+d)), проверить пару прямых на 
параллельность (равенство коэффициентов «k»), найти точку пересечения 
двух прямых.
*/
import java.util.*;

public class LStraight {

	private int k;
	private int b;

	public LStraight(int k, int b){ 	//конструктор
		this.k = k;
		this.b = b;
	}

	public void Povorot(int p){ 		//поворот прямой
			p = k*p;
			Print(p,b);

	}

	public void Move(int d){ 		//смещение прямой
			int bm = b+d;
			Print(k, bm);
	}

	public boolean Parall(LStraight l){ 	//проверка на параллельность
			if (l.k == k) {
				return(true);
			}
			else{
				return(false);
			}
	}

	public void Cross(LStraight l){		//точка пересечения
			double x = (l.b-b)/(k-l.k);
			System.out.print("("+x+" , "+ (k*x+b)+')');
	}

	public void Print(int k, int b){	//вывод прямой
			System.out.println("y="+k+'x'+'+'+b);
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите коэффициенты прямой. y=kx+b. k?  b?");
		LStraight l1 = new LStraight(sc.nextInt(), sc.nextInt());
		
		System.out.println("Введите угол поворота");
		l1.Povorot(sc.nextInt());
		
		System.out.println("Введите на сколько нужно сдвинуть прямую");
		l1.Move(sc.nextInt());
		
		System.out.println("Введите коэффициенты второй прямой. y=kx+b. k?  b?");
		LStraight l2 = new LStraight(sc.nextInt(), sc.nextInt());
		if (l1.Parall(l2)){
			System.out.println("Прямые параллельны");
		}
		else{
			System.out.println("Прямые не параллельны. Пересекаются в точке:");
			l1.Cross(l2);
		}

		
	}

}


