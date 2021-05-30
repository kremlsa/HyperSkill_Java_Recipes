package recipes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @JsonIgnore
    private int id;
    private String name;
    private String description;
    private String[] ingredients;
    private String[] directions;
}
