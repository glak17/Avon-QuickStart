package com.mycompany.projects.services.impl;

import javax.jcr.RepositoryException;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.mycompany.projects.services.HelloService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
/**
 * Service for accessing and manipulating properties.
 *
 * @param <D> The endpoint definition
 */
@Api(value = "/message/v1", description = "The messages API")
@Path("/message/v1")
public class HelloServiceImpl implements HelloService {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

   
    /**
     * Adds a property to a node. Does not support multi-value properties.
     */
    @Override
    @PUT
    @Path("/{workspace}/{path:(.)*}")
    @ApiOperation(value = "Create a new message", notes = "Send a message")
    public Response createMessage(  
            @PathParam("workspace") String workspaceName,
            @PathParam("path") String parentPath,
            @QueryParam("message") String message) throws RepositoryException {
        System.out.println("[Message]:" + message);
        return Response.status(Response.Status.OK).build();
    }
    
    @Override
    public Class<?> getImplementationClass() {
        return null;
    }

    @Override
    public String getName() {
        return "HelloService";
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
