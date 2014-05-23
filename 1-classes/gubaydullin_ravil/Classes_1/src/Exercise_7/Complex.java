package Exercise_7;

public class Complex {

    private double fi;          // Угол  (Аргумент)
    private double r;           // Длина радиуса  (Модуль)

    private static final double DEFAULT_VALUE = 0;

    // Методы для перевода в алгебраическую форму
    private double getA(){                      // Вещественная часть
        return getR() * Math.cos(getFi());
    }

    private double getB(){                     // Мнимая
        return getR() * Math.sin(getFi());
    }

    // Метод для первода в тригонометрическую
    private static double getModule(double a, double b){                              // Метод возращающий модуль комплексного числа
        return Math.sqrt( a * a + b * b);
    }

    private static double getArg( double a, double b ){                                 // Метод возращающий аргумент комплексного числа
        if(a > 0)
            return  Math.atan(b / a);

        else if ((a < 0) && (b > 0))
            return (Math.PI + Math.atan(b / a));

        else if ((a < 0) && (b < 0))
            return (-Math.PI + Math.atan(b / a));

        else return 0;
    }


    //Constructors
    public Complex(){
        setFi(DEFAULT_VALUE);
        setR(DEFAULT_VALUE);
    }

    public Complex(double fi, double r){
        setFi(fi);
        setR(r);
    }

    // Метод сложения
    public void sum(Complex complex){
        double a = getA() + complex.getA();
        double b = getB() + complex.getB();
        setFi(getArg(a,b));
        setR(getModule(a, b));

    }

    // Метод вычитания
    public void difference (Complex complex){
        double a = getA() - complex.getA();
        double b = getB() - complex.getB();
        setFi(getArg(a,b));
        setR(getModule(a, b));

    }

    // Метод умножения
    public void multiply(Complex complex){
        setFi(getFi() + complex.getFi());
        setR(getR() * complex.getR());
    }

    // Метод деления одного числа на другое (делимое.делитель)
    public void divide (Complex complex){
        setR(getR() / complex.getR());
        setFi(getFi() - complex.getFi());
    }

    // Метод сравнения
    public boolean equals(Object obj){
        Complex complex = (Complex) obj;
        return getA() == complex.getA() && getB() == complex.getB();
    }

    //getters & setters
    public double getFi(){
        return this.fi;
    }

    public void setFi(double fi){
        this.fi = fi;
    }

    public double getR(){
        return this.r;
    }

    public void setR (double r){
        this.r = r;
    }
}
