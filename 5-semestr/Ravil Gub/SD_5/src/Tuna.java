
public class Tuna {

    private Dictionary goodGuys;
    private Dictionary badGuys;

    public Tuna(int size) {
        this.goodGuys = new Dictionary(size);
        this.badGuys = new Dictionary(size);
    }

    public void favor(Legislator legislator){
        goodGuys.insert(legislator);
        badGuys.delete(legislator);
    }

    public void unfavor(Legislator legislator){
        badGuys.insert(legislator);
        goodGuys.delete(legislator);
    }

    public void report(Legislator legislator){
        if(goodGuys.member(legislator))
            System.out.println(legislator + " это брат");

        else if(badGuys.member(legislator))
            System.out.println(legislator + " 'это враг");

        else
            System.out.println(legislator + " о нем нет данных");
    }


    public void printGoodGuys(){
        goodGuys.print();
    }

    public void printBadGuys(){
        badGuys.print();
    }
}
