package recipes.entity;

import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class RecipeLibrary {
    private Map<Integer, Recipe> recipes = new LinkedHashMap<>();
    private int lastId = 0;

    public int addRecipe(Recipe recipe) {
        lastId++;
        recipe.setId(lastId);
        recipes.put(lastId, recipe);
        return lastId;
    }

    public Recipe getRecipe(int id) {
        return recipes.getOrDefault(id, null);
    }


}
