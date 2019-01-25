package nl.jordidorren.resources;

import com.codahale.metrics.annotation.Timed;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import nl.jordidorren.daos.ItemDao;
import nl.jordidorren.models.Item;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/item")
@Produces(MediaType.APPLICATION_JSON)
public class ItemResource {

    @JsonProperty("itemDao")
    private ItemDao itemDao;

    @JsonCreator
    public ItemResource(
            @JsonProperty("itemDao") ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @GET
    @Timed
    @Path("/all")
    public List<Item> getAll() {
        return itemDao.getAll();
    }
}
