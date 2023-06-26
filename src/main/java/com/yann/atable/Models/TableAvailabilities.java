package com.yann.atable.Models;

import com.yann.atable.Enums.TableStatus;
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
@Table(name = "TableAvailabilities")
public class TableAvailabilities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_table")
    private Tables table;

    @ManyToOne
    @JoinColumn(name="id_service")
    private Services service;

    @Enumerated(EnumType.STRING)
    private TableStatus status;

}
