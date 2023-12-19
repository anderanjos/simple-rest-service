package br.dev.a2.application.entrypoint;

import br.dev.a2.application.service.ProviderService;
import br.dev.a2.domain.Ticket;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.math.BigDecimal;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class ProviderController {

    private ProviderService service;

    public ProviderController(ProviderService service) {
        this.service = service;
    }

    @GET
    @Path("ticket")
    public Response retrieveTickets(){
        List<Ticket> tickets = service.retrieveTicketList();
        return Response
                .status(Response.Status.OK)
                .entity(tickets)
                .build();
    }

}
