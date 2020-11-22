package dumbun.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ep2")
public class Endpoint {
//    @Get
//    @Path("1")
//    @Produces(MediaType.APPLICATION_JSON)
//    public BasicStringJson basicStringJson() {
//        return BasicStringJson;
//    }
    @GET
    public String basicStringJson() {
        return "JAYSON";
    }

    @GET
    @Path("hi")
    public String basicStringJson2() {
        return "JAYSON2";
    }

    @GET
    @Path("hi2")
    public String basicStringJson1() {
        return "other string";
    }
}
