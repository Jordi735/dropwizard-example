package nl.jordidorren.daos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import nl.jordidorren.models.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDao {

    @JsonProperty
    private String tableName;
    @JsonProperty
    private String[] columnNames;

    @JsonCreator
    public ItemDao(@JsonProperty("tableName") String tableName,
                   @JsonProperty("columnNames") String[] columnNames) {
        this.tableName = tableName;
        this.columnNames = columnNames;
    }

    // fake dao simulator
    public List<Item> getAll() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "foo", 100));
        return items;
    }

}
