package nutricalc.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
public class RecipeLine {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private Long recipeId;
    private Long specificationId;
}