package nl.jordidorren;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import nl.jordidorren.resources.ItemResource;

import javax.validation.constraints.*;

public class ApiConfiguration extends Configuration {

    @NotNull
    @JsonProperty("itemResource")
    private ItemResource itemResource;

    public ItemResource getItemResource() {
        return this.itemResource;
    }

}
