package slozhenievqpredstavlenii;
/**Я так и не смогла сделать так, чтобы в список не заносились нулевые коэффициенты
 	*Разработано Семеновой Екатериной 25.04.14
**/
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Scanner;
public class SlozhenieVQPredstavlenii {
    private static Scanner sc;
 
    
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("myfile.txt"); //Из файла myfile.txt считываются 2 числа. 
            sc = new Scanner(fis);
            while(sc.hasNext()) {
            	int q = sc.nextInt();//В какой системе счисления? Рассчитывается, что пользователь заранее вводит верные числа
            int num1= sc.nextInt();//первое число
            int n1 = num1; //запоминаю число, чтобы не потерять его в ходе вычислений
       
            LinkedList<Integer> list1 = new LinkedList<Integer>();//в списке хранится первое число в обратном порядке
            while(num1 != 0) { //пока первое число не станет равным нулю
            	int j = num1 % 10; //делю число на 10
            	list1.add(j);//остаток от деления заносится в список
            	num1 = num1 / 10;//дальше работает с целой частью от деления
            	
            }

            int num2= sc.nextInt();//второе число
            int n2 = num2;//запоминаю 2 число, чтобы не потерять
            LinkedList<Integer> list2 = new LinkedList<Integer>(); //второй список я использую чтобы записать сюда результат сложения цифр
            while ((num2 != 0)&&(list1.isEmpty()!=true)){//пока второе число не равно нулю И первое число не пусто в списке
            	int k = num2 % 10;//запоминаю остаток от деления 2 числа на 10
            	list2.add(k + list1.pollFirst()-q+10);//складываю остаток с последней цифрой другого числа
            	num2 = num2 / 10;	//далее работает с целой частью 2 числа
            }
            if (n1>n2) { //если первое число больше второго
            while (list1.size()!=0) { //пока переходный результат сложения не исчезнет в списке
            	list2.add(list1.pollFirst()); //добавляю в другой список и очищаю первый. Иначе у меня будет перегруз памяти. Весьма неприятное зрелище
            }
            int s = 0;//запоминаем в уме(как мы говорили в школе)
            while (list2.size()!=0) { //пока список не пуст
            	if (list2.getFirst()>q-1){ //если первый элемент списка больше заданной степени системы счисления
            		list1.addFirst(list2.pollFirst() % 10 + s);//тогда остаток от деления на десять записывается в начало и прибавляется то что мы запомнили в уме
            		s = 1;//единицу запоминаем в уме
            	}
            	else {//если число нормальное
            		list1.addFirst(list2.pollFirst() +s);//то прибавляем то что в уме(даже если 0) и записываем в начало списка
            		s = 0;//теперь в уме 0
            	}
            }
            
            
           System.out.println(list1);// выводим окончательный список
            }
            
            else//если же второе число больше
            { while (num2 !=0){//пока 2 число не исчезнет
            	list2.add(num2 % 10);//остаток от деления на 10 в список
            	
            	num2 = num2/10;//работаем с целой частью
            	
            }//а дальше аналогично со случаем когда первое число больше: запоминаем в уме, складываем, записываем в начало и т.д.
            int s = 0;
            while (list2.size()!=0) {
            	if (list2.getFirst()>q-1){
            		list1.addFirst(Integer.parseInt(Integer.toString(list2.pollFirst() - q),q));
            		s = 1;
            	}
            	else {
            		list1.addFirst(Integer.parseInt(Integer.toString(list2.pollFirst() + s),q));
            		s = 0;
            	}
            }
            System.out.println(list1);//выводим список
            }
            } } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
//Аллелуйя! Программа работает!