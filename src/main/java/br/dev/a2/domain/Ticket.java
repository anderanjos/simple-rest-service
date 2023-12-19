package br.dev.a2.domain;

import java.math.BigDecimal;

public class Ticket {
    private String destination;
    private BigDecimal price;

    public String getDestination() {
        return destination;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public static final class TicketBuilder {
        private String destination;
        private BigDecimal price;

        private TicketBuilder() {
        }

        public static TicketBuilder builder() {
            return new TicketBuilder();
        }

        public TicketBuilder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public TicketBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Ticket build() {
            Ticket ticket = new Ticket();
            ticket.destination = this.destination;
            ticket.price = this.price;
            return ticket;
        }
    }
}
