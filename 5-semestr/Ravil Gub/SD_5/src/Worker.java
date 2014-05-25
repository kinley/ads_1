/**
 * Основная программа
 * Для упрвления описываемой базы данных при вводе имен законодателей
 * будем использовать односимвольные команды, за символом команды идет
 * имя законодателя.
 * Данные читаются из текстового файла
 */

public class Worker {

    public static void main(String[] args) {
        Tuna tuna = new Tuna(100);
        In in = new In("input.txt");
        String s = "";
        char a;

        while (in.hasNextLine()){
            s = in.readLine();
            a = s.charAt(0);
            Legislator legislator = new Legislator(s.substring(2, s.length()));

            if(a == 'F'){
                tuna.favor(legislator);
            }
            else if(a == 'U'){
                tuna.unfavor(legislator);
            }
            else if(a == '?'){
                tuna.report(legislator);
            }
            else {
                System.out.println("Неизвестная команда");
            }
        }
        System.out.println();
    }

}
