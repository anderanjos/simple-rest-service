package br.dev.a2.application.service;

import br.dev.a2.domain.Ticket;
import jakarta.enterprise.context.RequestScoped;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RequestScoped
public class ProviderService {
    public List<Ticket> retrieveTicketList() {
        List<String> cities = List.of("Tokyo", "Rio de Janeiro", "London", "Amsterdam", "Paris", "Barcelona", "Berlin");

        return cities.stream()
                .map(city ->
                        Ticket.TicketBuilder.builder()
                                .destination(city)
                                .price(BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(2000.0, 4000.0))
                                        .setScale(2, RoundingMode.DOWN))
                                .build()
                ).toList();
    }
}
