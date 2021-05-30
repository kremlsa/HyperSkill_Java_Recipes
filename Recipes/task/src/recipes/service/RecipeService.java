package recipes.service;

import recipes.entity.Recipe;

public interface RecipeService {

    public int saveRecipe(Recipe recipe);

    public Recipe getRecipe(int id);

}
