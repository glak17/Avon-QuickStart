package com.mycompany.projects.services;

import javax.jcr.RepositoryException;
import javax.ws.rs.core.Response;

import info.magnolia.rest.EndpointDefinition;

public interface HelloService extends EndpointDefinition{
    public Response createMessage(String workspaceName, String parentPath, String message) throws RepositoryException;
}
