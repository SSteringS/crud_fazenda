package br.com.satyan.stering.saita.rest;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/gado")
public class GadoResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createGado(String gadoRequest){

        return Response.ok().entity(gadoRequest).build();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}
