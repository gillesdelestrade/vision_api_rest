package fr.d4immobilier.visionapirest.config;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class CharsetFilter implements ContainerResponseFilter {
    
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {
        
        MediaType contentType = responseContext.getMediaType();
        
        if (contentType != null && contentType.isCompatible(MediaType.APPLICATION_JSON_TYPE)) {
            responseContext.getHeaders().putSingle("Content-Type", 
                MediaType.APPLICATION_JSON + "; charset=UTF-8");
        }
    }
}