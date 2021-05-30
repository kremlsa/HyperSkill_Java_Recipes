package recipes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipes.dao.RecipeRepository;
import recipes.entity.Recipe;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    RecipeRepository recipeRepository;

    @Override
    public Recipe getRecipe(int id) {
        Recipe recipe = null;
        Optional<Recipe> rcp = recipeRepository.findById(id);
        if (rcp.isPresent()) {
            recipe = rcp.get();
        }
        return recipe;
    }

    @Override
    public void deleteRecipe(int id) {
        recipeRepository.deleteById(id);
    }

    @Override
    public void saveRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    @Override
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }


}
