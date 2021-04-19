package com.redhat.eventproducer;

import java.util.*;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import io.vertx.core.json.Json;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.jboss.logging.Logger;

import io.reactivex.Flowable;
import io.smallrye.reactive.messaging.kafka.KafkaMessage;

@Path("/events")
@ApplicationScoped
public class EventProducer {
    @Inject
    KafkaController kafkaController;

    @POST
    @Path("/txn-event/{custId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void postCase(String json,@javax.ws.rs.PathParam("custId") String custId) {

        try {

            String jsonStart="{\n" +
                    " \"custId\":\"CUST6767\",\n" +
                    " \"transactionAmount\":";
            String jsonString = ",\n" +
                    " \"transactionDate\":";
            String jsonEnd = ",\n" +
                    " \"merchantName\":\"MERCH0001\",\n" +
                    " \"transactionCountry\":\"INDIA\"  \n" +
                    "  \n" +
                    "}";

            System.out.println("txn"+jsonStart+json+jsonString+new Date().getTime()+jsonEnd);

            kafkaController.produce(custId,jsonStart+json+jsonString+new Date().getTime()+jsonEnd);


        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
