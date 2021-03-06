package nutricalc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import java.math.BigDecimal;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne(cascade = ALL)
    private Recipe recipe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
