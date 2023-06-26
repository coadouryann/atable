package com.yann.atable.Model;

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
@jakarta.persistence.Table(name = "_reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_client")
    private User client;

    @ManyToOne
    @JoinColumn(name="id_service")
    private Service service;

    @ManyToOne
    @JoinColumn(name="id_table")
    private Table table;

    private Integer nombreDePersonnes;
}
