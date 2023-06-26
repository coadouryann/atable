package com.yann.atable.Model;

import com.yann.atable.Enum.TableStatus;
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
@jakarta.persistence.Table(name = "_TableAvailability")
public class TableAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_table")
    private Table table;

    @ManyToOne
    @JoinColumn(name="id_service")
    private Service service;

    @Enumerated(EnumType.STRING)
    private TableStatus status;

}
