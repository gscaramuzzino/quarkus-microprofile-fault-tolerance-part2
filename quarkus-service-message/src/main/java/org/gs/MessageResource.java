package org.gs;

import io.netty.util.Timeout;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

@Path("/message")
public class MessageResource {

    @GET
    public String message() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello from MessageResource";
    }
}