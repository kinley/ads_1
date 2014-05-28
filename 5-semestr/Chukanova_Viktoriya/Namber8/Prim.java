package semestr2;
/*
 * На вход подаются число вершин n и n списков смежности: 
 * g[i] — это список всех рёбер, исходящих из вершины i, 
 * в виде пар (второй конец ребра, вес ребра). 
 * Алгоритм поддерживает два массива: величина {\rm min\_e}[i] 
 *хранит вес наименьшего допустимого ребра из вершины i,
 * а элемент {\rm sel\_e}[i] содержит конец этого наименьшего ребра
 *  (это нужно для вывода рёбер в ответе). Кроме того, поддерживается очередь q
 *   из всех вершин в порядке увеличения их меток {\rm min\_e}. 
 *   Алгоритм делает n шагов, на каждом из которых выбирает вершину v с наименьшей меткой 
 *   {\rm min\_e} (просто извлекая её из начала очереди), и затем просматривает все рёбра 
 *   из этой вершины, пересчитывая их метки (при пересчёте мы удаляем из очереди старую 
 *   величину, и затем кладём обратно новую).
 */
public class n{
//входные данны
private int n;
vector < pair <int> > g;
private final int INF = 1000000000; // значение "бесконечность"
}

//класс, реализующий алгоритм прима.

public class Prim {
	// алгоритм
	vector <int> void min_e (n, INF), sel_e (n, -1);
	min_e[0] = 0;
	//set < pair<int,int> > q;
	q.insert (make_pair (0, 0));
	for (int i=0; i<n; ++i) {
		if (q.empty()) {
			System.out.print("No MST!");
			exit(0);
		}
		int v = q.begin().second;
		q.erase (q.begin());
	 
		if (sel_e[v] != -1;
			System.out.print(" ", sel_e[v]);
	 
		for (size_t j=0; j<g[v].size(); ++j) {
			int to = g[v][j].first,
				cost = g[v][j].second;
			if (cost < min_e[to]) {
				q.erase (make_pair (min_e[to], to));
				min_e[to] = cost;
				sel_e[to] = v;
				q.insert (make_pair (min_e[to], to));
			}
		}
	}
}
