package com.yann.atable.Models;

import com.yann.atable.Enums.MenuItemType;
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
@Table(name = "menuItems")
public class MenuItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private Double prix;
    private String description;

    @Enumerated(EnumType.STRING)
    private MenuItemType type;

}
