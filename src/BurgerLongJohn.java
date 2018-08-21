
public class BurgerLongJohn extends Burger {
	@Override
	public float price() {
		return 20.0f;
	}

	@Override
	public String name() {
		return "Burger Long John";
	}
	
	public Packing packing() {
		return new KertasNasi();
	}
}
