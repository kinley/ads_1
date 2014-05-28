package Graph;
import java.util.Stack;
public class Tree {
    private int val;
    private int key;
    private Tree left;
    private Tree right;
    private Tree root=null;
    //private int sum;

public Tree(){
    this.left=null;
    this.right=null;
    root=this;
    }

public Tree(int value, int key){
    this.left=null;
    this.right=null;
    this.key=key;
    this.val=val;
    root=this;
}

public void add_Tree(int val, int key ){
    Tree newNode = new Tree(val,key);
    newNode.val=val;
    newNode.key=key;
    newNode.right=null;
    newNode.left=null;
    if(root==null){
        root=newNode;
        return ;
    }
    else{
        Tree step=root;
        while(step!=null){
            if(val<step.val){
                if(step.left!=null) {
                    step=step.left;
                }
                else{
                    step.left=newNode;
                    break;
                }
            }
            else{
                if(step.right!=null){
                    step=step.right;
                }
                else{
                    step.right=newNode;
                    break;
                }
            }
        }
    }
return;
}

       int sum;
     public void print_Tree_Stack(){
        sum=0;
        Tree tmp=new Tree();
        Stack <Tree> st= new Stack<Tree>();
        System.out.println(this.root.val);
        st.push(root);
        while (!st.empty()){

           tmp = st.peek();
           st.pop();
            while (tmp != null) {
                System.out.println(tmp.key);
                sum+=tmp.key;
                if (tmp.right != null) {
                    st.push(tmp.right);
                }
                tmp = tmp.left;
            }
         }

    }
int get_sum(){
    return sum;
}

}