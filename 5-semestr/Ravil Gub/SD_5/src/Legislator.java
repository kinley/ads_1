
public class Legislator {

    private String name;    // Имя законодателя

    // Конструктор
    public Legislator(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object obj){
        Legislator legislator = (Legislator) obj;
        return getName().equals(legislator.getName());
    }

    public String toString(){
        return "Законодатель " + getName() + " ";
    }

    // Пример работы с классом
    public static void main(String[] args) {
        Legislator legislator =  new Legislator("Name");
        Legislator legislator1 = new Legislator("Name2");

        System.out.println(legislator);
        System.out.println(legislator1);

        System.out.println(legislator.equals(legislator1));
    }
}