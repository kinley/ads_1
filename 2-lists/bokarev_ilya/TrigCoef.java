//вспомогательный класс "троек" коэффицентов многочлена
public class TrigCoef {

	int number;// номер "тройки"
	int cosCoef;// коэффицент при косинусе
	int sinCoef;// коэффицент при синусе

	public TrigCoef() { }

	public TrigCoef(int number, int cosCoef, int sinCoef) {
		this.number = number;
		this.cosCoef = cosCoef;
		this.sinCoef = sinCoef;
	}
}
