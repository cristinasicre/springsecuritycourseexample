package com.sicre.springsecurity;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/productservice")
public interface ProductService {

    @Path("/products")
    @GET
    List<Product> getProducts();

    @Path("/products")
    @POST
    long addProduct(Product product);
}
