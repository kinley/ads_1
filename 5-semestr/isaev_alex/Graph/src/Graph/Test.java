//КОРОЧЕ Я ПОНЯЛ СВОЮ ЗАДАЧУ ВОТ ТАК:
//    1)МЫ СОЗДАЕМ СВЯЗНЫЙ СПИСОК С КЛЮЧАМИ И ЗНАЧЕНИЯМИ(КОТОРАЯ БУДЕТ ЯВЛЯТЬСЯ МНОЖЕСТВОМ ДЛЯ НАС)
//     2)МЫ СОЗДАЕМ ДЕРЕВО ИЗ ЭТОГО СПИСКА
//         3) ДАЛЕЕ ПИШЕМ ФУНКЦИЮ, КОТОРАЯ БУДЕТ ПРИНИМАТЬ КЛЮЧ,ВВЕДЕННЫЙ ПОЛЬЗОВАТЕЛЕМ, И НАХОЖИТЬ ЕГО В ДЕРЕВЕ
//          4) ДАЛЕЕ МЫ ПО ЭТОМУ КЛЮУ ПОРЕДЕЛЯЕМ ГЛУБИНУ

package Graph;
import java.lang.String;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       System.out.println("Enter count nodes");
        int n ;
        int val;
        int key;


        Link_List Node_Tree=new Link_List();
        Tree Check_Tree=new Tree();
            n=in.nextInt();
            for(int i=0; i<n;i++){
                System.out.println("Enter key and value");

                key=in.nextInt();
                val=in.nextInt();

                Node_Tree.put(key,val);
                System.out.println(Node_Tree.contains(key ));

            }

        Tree a=Node_Tree.createTree();
        a.print_Tree_Stack();
    }
}
















