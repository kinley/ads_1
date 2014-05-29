import java.util.Stack;
public class Tree<Key> {
	
	private int MIN;
	
	private class Vertex{
		Key key;
		int value;
		Vertex left;
		Vertex right;
		
		Vertex(Key key, int value){
			this.key=key;
			this.value=value;
			this.left=null;
			this.right=null;
		
		}
	}
		
		private Vertex root=null;
		
		public void addVertex(Key key,int value){
			Vertex newV=new Vertex(key,value);
			if(root==null){
				root=newV;
			}
			else{
				Vertex watcher=root;
				while(watcher!=null){
					if(value<watcher.value){
						if(watcher.left!=null) {
							watcher=watcher.left;
						}
						else{
							watcher.left=newV;
							return;
						}
					}
					else{
						if(watcher.right!=null) {
							watcher=watcher.right;
						}
						else{
							watcher.right=newV;
							return;
						}
					}
				}
			}
		}
		
		public void printDFS(){
			Vertex writer=root;
			Stack <Vertex> st= new Stack<Vertex>();
			st.push(root);
			while(!st.isEmpty()){
				 writer=st.pop();
				 while(writer!=null){
					 System.out.println(writer.value+" "+writer.key);
					 if(writer.right!=null) st.push(writer.right);
					 writer=writer.left;
				 }
			 }
		}
		
		public void deleteVal(Key key){
			Vertex tmp=null;
			Vertex finder=root;
			Stack <Vertex> st= new Stack<Vertex>();
			st.push(root);
			while(!st.isEmpty()){
				finder=st.pop();
				while(finder!=null){
					if(finder.key.equals(key)){
						tmp=finder;
						finder=null;
						finder.left=tmp.left;
						finder.right=tmp.right;
						return;
					}
					if(finder.right!=null) st.push(finder.right);
					finder=finder.left;
				}
			}
		}
			
		
		public int getMin(){
			MIN=root.value;
			Key link=null;
			Vertex writer=root;
			Stack <Vertex> st= new Stack<Vertex>();
			st.push(root);
			while(!st.isEmpty()){
				writer=st.pop();
				while(writer!=null){
					if(writer.value<MIN){
						MIN=writer.value;
						link=writer.key;
					}
					if(writer.right!=null) st.push(writer.right);
					writer=writer.left;
				}
			}
			this.deleteVal(link);
			return MIN;
		}
		
		public void setToTree(Set array){
			Tree create=this;
			while(!array.isEmpty()){
				create.addVertex(array.getKey(),array.getVal());
				array.goHead();
			}
		}
	}

