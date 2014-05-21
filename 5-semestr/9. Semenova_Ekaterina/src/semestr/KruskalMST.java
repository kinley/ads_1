package semestr;
// Главный класс, реализующий алгоритм Крускала. Включает в себя почти все остальные классы. В классе также добавлены проверки на правильность дерева, чтобы оповестить в случае ошибок.

public class KruskalMST {
    private double weight;  // вес минимального остовного дерева(МОД)
    private Queue<Edge> mst = new Queue<Edge>();  // ребра МОДа

    /**
     * Находит МОД в графе.
     * @param G взвешенный граф ребер
     */
    //Здесь используется классы EdgeWeightedGraph(реализация взвешенного графа ребер) и MinPQ(очередь с приоритетами)
    public KruskalMST(EdgeWeightedGraph G) {
        //более эффективно создать кучу, передавая массив ребер
        MinPQ<Edge> pq = new MinPQ<Edge>();
        for (Edge e : G.edges()) {
            pq.insert(e);
        }

        // Здсь используются операции Объединить-Найти из класса UF и операции Добавить-УдалитьMin
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
        }

        // проверка условий оптимальности
        assert check(G);
    }

    /**
     * Возвращает ребра в МОД
     */
    public Iterable<Edge> edges() {
        return mst;
    }

    /**
     * Возвращает сумму ребер в МОД
     */
    public double weight() {
        return weight;
    }
    
    // проверка оптимальности решения
    private boolean check(EdgeWeightedGraph G) {

        // проверка итогового веса
        double total = 0.0;
        for (Edge e : edges()) {
            total += e.weight();
        }
        double EPSILON = 1E-12;
        if (Math.abs(total - weight()) > EPSILON) {
            System.err.printf("Сумма ребер не эквивалентна сумме weight(): %f vs. %f\n", total, weight());
            return false;
        }

        // проверка что это дерево
        UF uf = new UF(G.V());
        for (Edge e : edges()) {
            int v = e.either(), w = e.other(v);
            if (uf.connected(v, w)) {
                System.err.println("Не дерево");
                return false;
            }
            uf.union(v, w);
        }

        // проверка что это остовное дерево
        for (Edge e : G.edges()) {
            int v = e.either(), w = e.other(v);
            if (!uf.connected(v, w)) {
                System.err.println("Не остовное дерево");
                return false;
            }
        }

        // проверяет что это МОД
        for (Edge e : edges()) {

            // все ребра в МОД из e
            uf = new UF(G.V());
            for (Edge f : mst) {
                int x = f.either(), y = f.other(x);
                if (f != e) uf.union(x, y);
            }
            
            // проверяет что e это минимальное взвешенное ребро в сокращении пути
            for (Edge f : G.edges()) {
                int x = f.either(), y = f.other(x);
                if (!uf.connected(x, y)) {
                    if (f.weight() < e.weight()) {
                        System.err.println("Ребро " + f + " нарушает условия оптимальной нарезки");
                        return false;
                    }
                }
            }

        }

        return true;
    }



}