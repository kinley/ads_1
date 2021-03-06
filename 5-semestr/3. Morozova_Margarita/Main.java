
/**
 ����������� �������
  ��������� ��������� ��������, 1 ����, ������ 09-308, �������� �����, �(�)��. ������, 2014.
 * ������: �������� ����������.
 * ���������� � ����������: ������� ����� Dictionary � ���������� "��������-�������-����������"
 * ����������� ����������� ������� (trie).
 *
 * ��� ���������� ������� ���� ������� ������ ������:
 * - �����������: Dictionary, TrieP.
 * - ������� ������: In.
 * - �������� ��������� Main.
 * 
 * ��������� ������ ����� � ������� �� �������� ��������� ������, ����� �������������� � ��������� ������.
 *
 * ������ �������������� ����������:
 * 1. ��� �. ��������� ������ � ��������� /��� �., �������� ��., ������ ��. � �.;���.;����, 2000. - 384�.
 * 2. ������� ��. ��������������� ��������� � ��������� ������ � Delphi. � �.;���.;����, 2003. - 560 �.
 * 3. ������� �. ��������� �� Java /������� �., ���� �. - 4-� ���. - �.;���.;����, 2013. - 848�.
 */
 
//�������� ���������. �������� � ���� ������ � ������, �������� ���������� � ����� ���� � ��������.

public class Main {
	public static void main(String[] args) 
	{
		// ���� �����. ������ ������ � ������� � ������.
		In inText = new In("test-1.txt");// test-2.txt
		In inDict = new In("dict-1.txt");// dict-2.txt
		// �������� ��������������� �� ��������.
		Dictionary text = new Dictionary();
		Dictionary dict = new Dictionary();
		// � �� ����������.
		while (!inText.isEmpty())
		{
			String s = inText.readLine(); 
			text.add(s);
		}
		while (!inDict.isEmpty())
		{
			dict.add(inDict.readLine());
		}
		
		// �������� ����� ���������.
		String word = "";
		if (!text.isEmpty()) {word = text.getFirstWord();}
		// ����� ����� �� ������, ��������� �� ������� � �������. ���� ����� ����, 
		//	������� ��� �� ������. � ���������� � ������ �������� ������ ����� � ��������.
		while (!text.isChecked()) 
		{
			if (dict.inDictionary(word))
			{
				text.remove(word);
			}
			word = text.getNextWord(word);
		}
		
		// �������� ���������� ����� ������.
		text.print();
	}
}

