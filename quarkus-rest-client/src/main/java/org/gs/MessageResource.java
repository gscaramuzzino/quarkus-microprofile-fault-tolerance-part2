package org.gs;

import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class MessageResource {

    @RestClient
    MessageClient client;

    @GET
    @Timeout(200)
    @Fallback(fallbackMethod = "fallbackMessage")
    @CircuitBreaker(
            requestVolumeThreshold = 8,
            failureRatio = 0.5,
            delay = 5000,
            successThreshold = 4)
    @Retry(maxRetries = 5)
    public String message() {
        return client.get();
    }

    private String fallbackMessage() {
        return "Fallback Message";
    }
}