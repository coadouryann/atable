package com.yann.atable.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_client")
    private Users client;

    @ManyToOne
    @JoinColumn(name="id_service")
    private Services service;

    @ManyToOne
    @JoinColumn(name="id_table")
    private Tables table;

    private Integer nombreDePersonnes;
}
