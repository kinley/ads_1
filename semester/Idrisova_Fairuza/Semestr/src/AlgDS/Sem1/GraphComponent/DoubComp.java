package AlgDS.Sem1.GraphComponent;

import java.util.Iterator;
import java.util.Stack;

public class DoubComp {
    boolean[] mark; //просматривание вершин
    int[] dfsNum;
    int[] lower;
    int[] father;
    int Counter;
    Stack<Integer> st;       //здесь будет ребра компонент;
    Graph G;
    int GV;
 //   int w;

   public Stack<Integer> MakeComp(){
       dfsCD(1);
       return st;
   }


    public DoubComp(Graph G) {
        this.G = G;
        st = new Stack();
        GV = G.getV() + 1;
        mark = new boolean[GV];
        dfsNum = new int[GV];
        lower = new int[GV];
        father = new int[GV];
        Counter = 1;
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
                    st.push(-1);  //разделитель компонент. выведем одим стеком.
                    lower[v]=Math.min(lower[w],lower[v]);

                }
            }
                else
                    if ((father[v]!=w))
                        lower[v]=Math.min(lower[v],dfsNum[w]);
        }
    }

}
