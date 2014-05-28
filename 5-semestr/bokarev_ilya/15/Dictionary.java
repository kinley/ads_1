// реализаци€ словар€ на основе списка пропусков
public class Dictionary {

	public SkipList list;

	public Dictionary() {
		this.list = new SkipList();
	}

	public void insert(String s) {
		this.list.insert(s);
	}

	public void delete(String s) {
		this.list.delete(s);
	}

	public boolean member(String s) {
		return this.list.member(s);
	}

}