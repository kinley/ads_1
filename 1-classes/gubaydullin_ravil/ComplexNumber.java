/**x
 * Created by ravil on 07.03.14.
 */
public class ComplexNumber {                         // Класс комлексных чисел
    private double a,b ;                            // a - вещественная часть, b - мнимая часть
    private char i;                                // i - мнимая единица

    public ComplexNumber(int n, int m){          // Конструктор класса комлексное число, задает вещественную и мнимую часть
        a = n;
        b = m;
        i  ='i';
    }

    public void get(){                                  // Метод, выводящий все число
        System.out.println(a + " + " + b + i);
    }

    public double get_a(){                         // Метод, возращающий вещественную часть числа
        return a;
    }

    public double get_b(){                         // Метод, возращающий мнимую часть числа
        return b;
    }

    public void plus(ComplexNumber p){              // Метод, складывающий два числа
        double a1 = p.get_a();                     // Присваеваем переменной a1 вещественную часть комплексного числа p
        a = a + a1;                               // Складываем вещественные части
        double b1 = p.get_b();                   // Присваеваем перемнной b1 мнимую часть комлпексного числа p
        b = b + b1;                             // Складываем мнимые части
        get();
    }

    public void minus(ComplexNumber p){               // Метод, вычитающий из одного числа другое
        double a1 = p.get_a();                       // Присваеваем перемнной a1 вещественную часть комплексного числа p
        a = a -a1;
        double b1 = p.get_b();                     // Присваеваем переменной b1 мнимую часть комплексного числа p
        b = b - b1;
        get();
    }

    public void multiply (ComplexNumber p){         // Метод, умножающий два числа
        double a1 = p.get_a();                     // Присваеваем перемнной a1 вещественную часть комплексного числа p
        double b1 = p.get_b();                    // Присваеваем переменной b1 мнимую часть комплексного числа p
        double n = a;                            // переменная для запоминания значения a до ее изменения
        a = a*a1 -b*b1;
        b = n*b1 + a1*b;
        get();
    }

    public void share (ComplexNumber p){            // Метод, делящий первое число на второе  делимое.share(делитель)
        double a1 = p.get_a();                     // Присваеваем переменной a1 вещественную часть комплексного числа p
        double b1 = p.get_b();                    // Присваеваем переменной b1 мнимую часть комплексного числа p
        double n = a;                            // Переменная для запоминания значения a до ее изменнения
        a = (a*a1+b*b1)/(a1*a1+b1*b1);
        b = (a1*b-n*b1)/(a1*a1+b1*b1);
        get();
    }

    public void compare(ComplexNumber p){            // Метод сравнивающий два числа
        double a1 = p.get_a();
        double b1 = p.get_b();
        if ((a == a1) && (b==b1)){
            System.out.println("Числа равны между собой");
        }
        else {
            System.out.println("Числа не равны");
        }
    }

    public static void main(String[] args){
        ComplexNumber c = new ComplexNumber(1,3);
        c.get();
        ComplexNumber c1 = new ComplexNumber(1,3);
        c1.get();
        c.compare(c1);
    }
}