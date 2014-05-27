package testt234;

public class Tree23 {
	private Node root = new Node();            //создаем корневой узел

	public int find(double key) 
	{
		Node curNode = root;
		int childNumber;
		while(true) 
		{
			if( (childNumber = curNode.findItem(key))  != -1)
				return childNumber;	// узел найден
			else if( curNode.isLeaf() )
				return -1;	// узел не найден
			else	// искать глубже
				curNode = getNextChild(curNode, key);
		}	
	}

	//  Вставка элемента данных
	public void insert(double dValue) 
	{
		Node curNode = root;
		DataItem tempItem = new DataItem(dValue);

		while(true) 
		{
			if(curNode.isLeaf()) 
			{  				//Если узел лист
				if(!curNode.isFull()) 
				{				//И не полон
					curNode.insertItem(tempItem); 	//То вставляем
					break;
				}
				else {								//Если нет
					split(curNode, tempItem);		//То разбиваем узел
					break;
				}
			}
			else
				curNode = getNextChild(curNode, dValue);
		}	
	}	

	public Node split(Node thisNode, DataItem newItem) 
	{	// Разбиение узла
		DataItem itemA, itemB, itemC;
		Node parent, childNew, child1, child2;
		Node result = null;

		if(newItem.dData <= thisNode.getItem(0).dData)
		{
			itemA = newItem;
			itemB = thisNode.getItem(0);
			itemC = thisNode.getItem(1);
		}
		else if(newItem.dData >= thisNode.getItem(1).dData) 
		{
			itemA = thisNode.getItem(0);
			itemB = thisNode.getItem(1);
			itemC = newItem;
		}
		else {
			itemA = thisNode.getItem(0);
			itemB = newItem;
			itemC = thisNode.getItem(1);
		}

		if(thisNode == root) 
		{
			parent = new Node();
			parent.insertItem(itemB);

			thisNode.removeItem();
			thisNode.removeItem();
			thisNode.insertItem(itemA);

			child1 = new Node();
			child1.insertItem(itemC);

			parent.connectChild(0, thisNode);
			parent.connectChild(1, child1);

			root = parent;

			result = child1;
		}
		else {
			parent = thisNode.getParent();
			if(!parent.isFull())
			{
				if(parent.getChild(0) == thisNode) 
				{
					child1 = parent.disconnectChild(1);
					parent.connectChild(2, child1);

					childNew = new Node();
					childNew.insertItem(itemC);
					parent.connectChild(1, childNew);

					parent.insertItem(itemB);

					thisNode.removeItem();
					thisNode.removeItem();
					thisNode.insertItem(itemA);

					result = childNew;
				}
				else if(parent.getChild(1) == thisNode) 
				{
					thisNode.removeItem();
					thisNode.removeItem();
					thisNode.insertItem(itemA);

					parent.insertItem(itemB);

					childNew = new Node();
					childNew.insertItem(itemC);
					parent.connectChild(2, childNew);

					result = childNew;
				}
				else
					System.err.println("error 1!");
			}
			else {
				// to do
				Node rightParent = split(parent, itemB);
				if(parent.getChild(0) == thisNode) 
				{
					thisNode.removeItem();
					thisNode.removeItem();
					thisNode.insertItem(itemA);

					parent.connectChild(0, thisNode);

					child1 = parent.disconnectChild(1);
					child2 = parent.disconnectChild(2);

					childNew = new Node();
					childNew.insertItem(itemC);
					parent.connectChild(1, childNew);

					rightParent.connectChild(0, child1);
					rightParent.connectChild(1, child2);
				}
				else if(parent.getChild(1) == thisNode) 
				{
					thisNode.removeItem();
					thisNode.removeItem();
					thisNode.insertItem(itemA);
					parent.connectChild(1, thisNode);

					child2 = parent.disconnectChild(2);
					rightParent.connectChild(1, child2);

					childNew = new Node();
					childNew.insertItem(itemC);
					rightParent.connectChild(0, childNew);
				}
				else if(parent.getChild(2) == thisNode) 
				{
					thisNode.removeItem();
					thisNode.removeItem();
					thisNode.insertItem(itemA);
					parent.disconnectChild(2);
					rightParent.connectChild(0, thisNode);

					childNew = new Node();
					childNew.insertItem(itemC);
					rightParent.connectChild(1, childNew);
				}
			}
		}

		return result;
	}	

	// Получение соответствующего потомка при поиске значения
	public Node getNextChild(Node theNode, double theValue) 
	{
		int j;
		// Предполагается, что узел не пуст, не полон и не является листом
		int numItems = theNode.getNumItems();
		for(j = 0; j < numItems; j++)
		{        // Для каждого значения в узле
			if( theValue < theNode.getItem(j).dData )
				return theNode.getChild(j);  // Вернуть левого потомка
		}	
		return theNode.getChild(j);	// Если значение больше, то возвращаем правого потомка
	}

	public void displayTree() 
	{
		recDisplayTree(root, 0, 0);
	}

	private void recDisplayTree(Node thisNode, int level, int childNumber)
	{
		System.out.print("level=" + level + " child=" + childNumber + "");
		thisNode.displayNode();               // Вывести содержимое узла
		int numItems = thisNode.getNumItems();
		for(int j = 0; j < numItems + 1; j++) 
		{ //Рекурсивный вызов для каждого
			Node nextNode = thisNode.getChild(j);
			if(nextNode != null)
				recDisplayTree(nextNode, level+1, j);
			else
				return;
		}
	}	
}	


