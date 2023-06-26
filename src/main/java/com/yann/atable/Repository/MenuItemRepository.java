package com.yann.atable.Repository;

import com.yann.atable.Enum.MenuItemType;
import com.yann.atable.Model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findByType(MenuItemType type);
}
