
// Инструменты. Словарь с операциеями "Вставить-Удалить-Принадлежать"
public class Dictionary {

    private int size;                           // Размер массива
    private LegislatorLinkList[] lists ;        // Массив списков
    private final int R = 31;                   // Число для хэш функции


    // Возращает список получаемый по хэш функции
    private LegislatorLinkList getList(Legislator legislator){
        return this.lists[h(legislator)];
    }

    // Хэш функция
    private int h (Legislator legislator){
        int hash = 0;
        int a = legislator.getName().length();

        for(int i = 0; i < a ; i++){
            hash = (R * hash + legislator.getName().charAt(i)) % (this.size - 1);
        }
        return hash;
    }

    // Конструктор
    public Dictionary(int size){
        this.size = size;
        this.lists = new LegislatorLinkList[this.size];

        for (int i = 0; i < this.size; i++){
            this.lists[i] = new LegislatorLinkList();
        }
    }

    // Метод проверки вхождения
    public boolean member(Legislator legislator){
        if(getList(legislator).contains(legislator))
            return true;
        else
            return false;
    }

    // Метод вставки
    public void insert(Legislator legislator){
        if(!member(legislator)){
            getList(legislator).add(legislator);
        }
    }

    // Метод удаления
    public void delete(Legislator legislator){
        getList(legislator).delete(legislator);
    }

    // Печатает весь словарь
    public void print(){
        int x = this.lists.length;
        for(int i = 0; i < x; i++){
            lists[i].printList();
        }
    }
}
