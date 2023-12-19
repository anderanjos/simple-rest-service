package br.dev.a2.application.service;

import br.dev.a2.domain.Ticket;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class ProviderServiceTest {

    @Inject
    private ProviderService sut;

    @Test
    @DisplayName("Given a new request for tickets, just return hardcoded list")
    public void retrieveTicketList(){
        List<Ticket> tickets = sut.retrieveTicketList();
        assertEquals(7, tickets.size());
    }

}