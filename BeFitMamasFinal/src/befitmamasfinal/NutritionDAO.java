package befitmamasfinal;

import java.sql.SQLException;

public interface NutritionDAO extends DAO<Nutrition> {

	int getNutrition(Nutrition Nutrition) throws SQLException;

	int createNutrition(Nutrition nutrition) throws SQLException;

	int updateNutrition(Nutrition nutrition) throws SQLException;

	int removeNutrition(Nutrition nutrition) throws SQLException;

}
