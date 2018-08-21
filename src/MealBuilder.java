public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	public Meal prepareAnotherMeal() {
		Meal meal = new Meal();
		meal.addItem(new BurgerLongJohn());	
		meal.addItem(new Coke());
		return meal;
	}
}