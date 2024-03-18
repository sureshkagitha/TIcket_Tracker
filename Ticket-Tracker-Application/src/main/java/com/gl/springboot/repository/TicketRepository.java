package com.gl.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.springboot.entiry.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{


}
