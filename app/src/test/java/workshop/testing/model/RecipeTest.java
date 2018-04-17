package workshop.testing.model;

import org.junit.Test;

import java.io.InputStream;

import workshop.testing.data.model.Recipe;

import static org.junit.Assert.*;

/**
 * Created by tungas on 17/4/2018 AD.
 */
public class RecipeTest {

    @Test
    public void water(){
        InputStream inputStream
                = RecipeTest.class.getResourceAsStream("/recipes/water.txt");
        Recipe recipe = Recipe.readFromStream(inputStream);

        assertNotNull(recipe);

        assertEquals("water",recipe.id);
        assertEquals("Water",recipe.title);
        assertEquals("Put glass under tap. Open tap. Close tap. Drink.", recipe.description);
    }

}