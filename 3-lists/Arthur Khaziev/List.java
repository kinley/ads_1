package polynome;


public class List {

		Item list = null;
		
		class Item {
			int value;
			int degree;
			Item next;
			Item prev;
		
			Item(int value,int degree) {
				this.value=value;
				this.degree=degree;
			}
		}
		
		public void InList(int value,int degree) {
			Item In = new Item(value,degree);
			
				if (list==null) {
					list = In; 
				}
				else {
					In.next = list;
					list.prev = In;
					list = In;
				}
		}

		public void InEndOfList(int value,int degree) {
			Item In = new Item(value,degree);
			
				if (list == null) {
				list = In;
				}
				else {
				Item lastNode = list;
				while (lastNode.next !=null)
					lastNode = lastNode.next;
				lastNode.next = In;
				In.prev = lastNode;
			}
		}
		
		public void FirstOutput() {
			Item out = list;
			list = list.next;
			System.out.print("("+out.value+")*x^"+out.degree);
		}
		
		public void LastOutput() {
			Item lastNode = list;
			Item Out;
			while (lastNode.next !=null)
				lastNode = lastNode.next;
			Out = lastNode;
			lastNode = lastNode.prev;
			lastNode.next = null;
			System.out.print("("+Out.value+")*x^"+Out.degree);
		}
		
		
	}

