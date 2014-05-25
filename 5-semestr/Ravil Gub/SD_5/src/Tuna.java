
public class Tuna {

    private Dictionary goodGuys;
    private Dictionary badGuys;

    // Конструктор
    public Tuna(int size) {
        this.goodGuys = new Dictionary(size);
        this.badGuys = new Dictionary(size);
    }

    /**
     * Заносит законадателя в список goodguys
     * и вычеркивает из списка badguys
     * @param legislator
     */
    public void favor(Legislator legislator){
        goodGuys.insert(legislator);
        badGuys.delete(legislator);
    }


    /**
     * Заносит законодателя в список badguys
     * и вычеркивает из списка goodguys
     * @param legislator
     */
    public void unfavor(Legislator legislator){
        badGuys.insert(legislator);
        goodGuys.delete(legislator);
    }

    /**
     *  Вывод информации о законадателе
     * @param legislator
     */
    public void report(Legislator legislator){
        if(goodGuys.member(legislator))
            System.out.println(legislator + " это друг");

        else if(badGuys.member(legislator))
            System.out.println(legislator + " 'это враг");

        else
            System.out.println(legislator + " о нем нет данных");
    }


    /**
     * Вывод списка goodguys
     */
    public void printGoodGuys(){
        goodGuys.print();
    }

    /**
     * Вывод списка badguys
     */
    public void printBadGuys(){
        badGuys.print();
    }
}
