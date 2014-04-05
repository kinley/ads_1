
public class ComplexNumbers {

    private double  a;                                          // Вещественная часть комплексного числа
    private double b;                                          // Мнимая часть комплексного числа
    private  static final int zero = 0;                       // Констатнта для хранения значения по умолчанию

    public ComplexNumbers(){                                    // Конструктор с параметрами по умолчанию
        this.a = zero;
        this.b = zero;
    }

    public ComplexNumbers(double a, double b){                  // Коснтруктор с заданами параметрами
        this.a = a;
        this.b = b;
    }

    public double getA(){                                      // Метод возращающий вещественную часть числа
        return this.a;
    }

    public double getB(){                                      // Метод возращаюший мнимую часть числа
        return this.b;
    }

    public String toString(){                                  // Метод возращающий строковое представление комплексного числа
        return getA() + " + " + getB() + "i";
    }

    public  boolean equals(ComplexNumbers complex){           // Метод сравнивающий два числа
        return getA() == complex.getA() || getB() == complex.getB();
    }

    public void sum(ComplexNumbers complex){                  // Метод прибавляющий к одному число другое
        this.a+= complex.getA();
        this.b+= complex.getB();
    }

    public void difference(ComplexNumbers complex){          // Метод вычитающий из одного числа другое
        this.a-= complex.getA();
        this.b-= complex.getB();
    }

    public void productOnNumber(double number){              // Метод умножающий комлексное число на действительное
        this.a*= number;
        this.b*= number;
    }

    public void  conjugate(){                                // Метод меняющий число на сопряженное
        this.b = - this.b;
    }

    public double getModule(){                              // Метод возращающий модуль комплексного числа
        return Math.sqrt(getA() * getA() + getA() * getA());
    }

    public double getArg(){                                 // Метод возращающий аргумент комплексного числа
        if(getA()>0)
            return  Math.atan(getB() / getA());

        else if((getA()<0) && (getB()>0))
            return (Math.PI + Math.atan(getB() / getA()));

        else if ((getA()<0) && (getB()<0))
            return (-Math.PI + Math.atan(getB() / getA()));

        else return 0;
    }


    public void multiply (ComplexNumbers p){                // Метод, умножающий одно комплексное число на другое
        double n = this.a;                                  // переменная для запоминания значения a до ее изменения

        this.a = this.a * p.getA() - this.b * p.getB();
        this.b = n * p.getB() + p.getA() * this.b;
    }

    public void share (ComplexNumbers p){                   // Метод, делящий первое число на второе делимое.share(делитель)
        double n = this.a;                                  // Переменная для запоминания значения a до ее изменнения

        this.a = (this.a * p.getA() + this.b * p.getB()) / (p.getA() * p.getA() + p.getB() * p.getB());
        this.b = (p.getA() * this.b - n * p.getB()) / (p.getA() * p.getA() + p.getB() * p.getB());
    }
}
