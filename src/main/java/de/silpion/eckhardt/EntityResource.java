package de.silpion.eckhardt;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.quarkus.panache.common.Sort;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.List;

@Path("/entity")
public class EntityResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entity> hello() {
        return Entity.findAll(Sort.by("name")).list();
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Entity entity) {
        entity.id = null;
        entity.persist();
        return Response.status(Response.Status.CREATED).entity(entity).build();
    }
}
