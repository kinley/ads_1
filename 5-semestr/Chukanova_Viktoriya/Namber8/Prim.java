package semestr2;
/*
 * �� ���� �������� ����� ������ n � n ������� ���������: 
 * g[i] � ��� ������ ���� ����, ��������� �� ������� i, 
 * � ���� ��� (������ ����� �����, ��� �����). 
 * �������� ������������ ��� �������: �������� {\rm min\_e}[i] 
 *������ ��� ����������� ����������� ����� �� ������� i,
 * � ������� {\rm sel\_e}[i] �������� ����� ����� ����������� �����
 *  (��� ����� ��� ������ ���� � ������). ����� ����, �������������� ������� q
 *   �� ���� ������ � ������� ���������� �� ����� {\rm min\_e}. 
 *   �������� ������ n �����, �� ������ �� ������� �������� ������� v � ���������� ������ 
 *   {\rm min\_e} (������ �������� � �� ������ �������), � ����� ������������� ��� ���� 
 *   �� ���� �������, ������������ �� ����� (��� ��������� �� ������� �� ������� ������ 
 *   ��������, � ����� ����� ������� �����).
 */
public class n{
//������� �����
private int n;
vector < pair <int> > g;
private final int INF = 1000000000; // �������� "�������������"
}

//�����, ����������� �������� �����.

public class Prim {
	// ��������
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
