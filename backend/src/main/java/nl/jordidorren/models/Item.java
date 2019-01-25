package nl.jordidorren.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class Item {

    private int id;
    private String name;
    private int priceCents;

    @JsonCreator
    public Item(@JsonProperty("id") int id,
                @JsonProperty("name") String name,
                @JsonProperty("priceCents") int priceCents) {
        this.id = id;
        this.name = name;
        this.priceCents = priceCents;
    }

}
