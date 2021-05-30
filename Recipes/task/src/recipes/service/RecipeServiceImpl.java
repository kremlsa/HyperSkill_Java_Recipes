package recipes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipes.entity.Recipe;
import recipes.entity.RecipeLibrary;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    RecipeLibrary recipeLibrary;

    @Override
    public int saveRecipe(Recipe recipe) {
        return recipeLibrary.addRecipe(recipe);
    }

    @Override
    public Recipe getRecipe(int id) {
        return recipeLibrary.getRecipe(id);
    }
}
