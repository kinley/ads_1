import java.util.Iterator;
import java.util.Stack;

public class DoubComp {
    boolean[] mark; //просматривание вершин
    int[] dfsNum;
    int[] lower;
    int[] father;
    int Counter;
    Stack<Integer> st;       //здесь будут ребра компонент;
    Stack<Integer> st1;
    Graph G;
    int GV;
    int countCom;

    public Stack<Integer> MakeComp(){
        return st1;
    }

    public int getCountCom() {
        return countCom;
    }


    public DoubComp(Graph G) {
        this.G = G;
        st = new Stack();
        st1 = new Stack();
        GV = G.getV() + 1;
        mark = new boolean[GV];
        dfsNum = new int[GV];
        lower = new int[GV];
        father = new int[GV];
        Counter = 1;
        countCom = 0;
        for (int i=1;i<GV;i++) {
            if(mark[i]==false) {
                Counter = 1;
                dfsCD(i);
            }
        }
    }

    public void dfsCD(int v) {
        mark[v] = true;  //старый
        dfsNum[v] = Counter;
        Counter++;
        lower[v] = dfsNum[v];

        for (Iterator<Integer> j = G.getAllV(v).iterator(); j.hasNext(); )
        {
            int w;
            w = j.next();
            if (mark[w]==false)  //не брали. новый.
            {
                if (!(((w == father[v])&&(v>w))|| ((v<w) &&(mark[w]==true)))) //если еще не добавляли(симметричность ребер)
                {
                    st.push(v);
                    st.push(w);     //добавляем в стек ребра компоненты
                }

                father[w]=v;
                dfsCD(w);

                if (lower[w]>=dfsNum[v])
                {
                    //двусвязная компонента найдена.
                     //разделитель компонент. выведем одим стеком.
                    countCom++;
                    int w1=0;
                    int v1=0;

                    while (( v1 != v) && (w1 != w)) {
                        w1 = st.pop();
                        v1 = st.pop();
                        st1.push(v1);
                        st1.push(w1);
                    }
                    st1.push(-1);
                    lower[v]=Math.min(lower[w],lower[v]);

                }
            }
            else
             if ((father[v]!=w) && (dfsNum[w]<dfsNum[v]) ){
                 st.push(v);
                 st.push(w);
                lower[v]=Math.min(lower[v],dfsNum[w]);
             }
        }
    }

}
