package 05;
// Главный класс-алгоритм Крускала. 

public class KruskalMST {
    private double weight;  // вес минимального остовного дерева
    private Queue<Edge> mst = new Queue<Edge>();  // ребра МОДа

    
    
    public KruskalMST(EdgeWeightedGraph G) {
        //более эффективно создать кучу, передавая массив ребер
        MinPQ<Edge> pq = new MinPQ<Edge>();
        for (Edge e : G.edges()) {
            pq.insert(e);
        } // Находит МОД в графе//Здесь используется классы EdgeWeightedGraph(реализация взвешенного графа ребер) и MinPQ(очередь с приоритетами)

        
        UF uf = new UF(G.V());
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            Edge e = pq.delMin();
            int v = e.either();
            int w = e.other(v);
            if (!uf.connected(v, w)) { // v-w не создает цикл
                uf.union(v, w);  // объединяет v и w 
                mst.enqueue(e);  // добавление ребра e в МОД
                weight += e.weight();
            }
        } // Здсь используются операции Объединить-Найти из класса UF и операции Добавить-УдалитьMin

        
        assert check(G);
    }  // проверка условий оптимальности

    
    public Iterable<Edge> edges() {
        return mst;
    } // Возвращает ребра в МОД

    
    public double weight() {
        return weight;
    } // Возвращает сумму ребер в МОД
    
    
    private boolean check(EdgeWeightedGraph G) { // проверка оптимальности решения

        double total = 0.0;                     // проверка итогового веса
        for (Edge e : edges()) {
            total += e.weight();
        }
        double EPSILON = 1E-12;
        if (Math.abs(total - weight()) > EPSILON) {
            System.err.printf("Сумма ребер не эквивалентна сумме weight(): %f vs. %f\n", total, weight());
            return false;
        }

        
        UF uf = new UF(G.V());
        for (Edge e : edges()) {
            int v = e.either(), w = e.other(v);
            if (uf.connected(v, w)) {
                System.err.println("Не дерево");
                return false;
            }
            uf.union(v, w);
        } // проверка что это дерево

        
        for (Edge e : G.edges()) {
            int v = e.either(), w = e.other(v);
            if (!uf.connected(v, w)) {
                System.err.println("Не остовное дерево");
                return false;
            }
        }   // проверка что это остовное дерево

        
        for (Edge e : edges()) {              // проверяет что это МОД

            uf = new UF(G.V());              // все ребра в МОД из e
            for (Edge f : mst) {
                int x = f.either(), y = f.other(x);
                if (f != e) uf.union(x, y);
            }
            
 
            for (Edge f : G.edges()) {
                int x = f.either(), y = f.other(x);
                if (!uf.connected(x, y)) {
                    if (f.weight() < e.weight()) {
                        System.err.println("Ребро " + f + " нарушает условия оптимальной нарезки");
                        return false;
                    }
                } // проверяет что e это минимальное взвешенное ребро в сокращении пути
            }

        }  

        return true;
    }



}