
public class Legislator {

    private String name;

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
}