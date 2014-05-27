package testt234;


class DataItem {
	public double dData; // Один объект данных
	
	public DataItem(double dd) //Конструктор
	{dData = dd;}
	
	public void displayItem() // Вывод элемента в формате"/27"
	{System.out.print("/"+dData);}
 }
