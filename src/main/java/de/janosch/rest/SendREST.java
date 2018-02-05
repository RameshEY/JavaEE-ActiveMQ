package de.janosch.rest;

import de.janosch.activemq.ActiveMQSender;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/send")
public class SendREST {

    @Inject
    private ActiveMQSender activeMQSender;

    @POST
    public void sendTestMessage(@QueryParam("message") String message) throws Exception {
        activeMQSender.sendMessage(message);
    }
}