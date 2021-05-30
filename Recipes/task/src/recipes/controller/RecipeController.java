package recipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import recipes.entity.Recipe;
import recipes.service.RecipeService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping("/recipe/{id}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable int id) {
        Recipe recipe = recipeService.getRecipe(id);
        if (recipe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(recipe, HttpStatus.OK);
    }

    @PostMapping("/recipe/new")
    public ResponseEntity<Object> addNewRecipe(@RequestBody Recipe recipe) {
        recipeService.saveRecipe(recipe);
        Map<String, Integer> resp = new HashMap<>();
        resp.put("id", recipe.getId());
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

}
