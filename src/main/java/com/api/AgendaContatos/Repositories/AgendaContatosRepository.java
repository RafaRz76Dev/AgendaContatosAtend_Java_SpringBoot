package com.api.AgendaContatos.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.AgendaContatos.Models.AgendaContatosModels;

public interface AgendaContatosRepository extends JpaRepository<AgendaContatosModels, Long> { 

} 