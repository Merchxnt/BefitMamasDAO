package befitmamasfinal;

public class Nutrition {


	private int nutritionId;
	
	private String foodName;
	
	private String description;
	
	private double calories;

	public Nutrition(int nutritionId, String foodName, String description, double calories) {
		super();
		this.nutritionId = nutritionId;
		this.foodName = foodName;
		this.description = description;
		this.calories = calories;
	}

	public int getNutritionId() {
		return nutritionId;
	}

	public void setNutritionId(int nutritionId) {
		this.nutritionId = nutritionId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Nutrition [nutritionId=" + nutritionId + ", foodName=" + foodName + ", description=" + description
				+ ", calories=" + calories + "]";
	}
	

}
