package n5;

public class Dictionary
{
	public List leglist;
	
	public Dictionary()
	{
		this.leglist = new List();
	}
	
	public void InsertMember(String legislator)
	{
		leglist.InsertMember(legislator);
	}
	
	public void DeleteMember(String legislator)
	{
		leglist.DeleteMember(legislator);
	}
	
	public boolean IsMember(String legislator)
	{
		return leglist.IsMember(legislator);
	}
}
