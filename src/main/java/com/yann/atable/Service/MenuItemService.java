package com.yann.atable.Service;

import com.yann.atable.Enum.MenuItemType;
import com.yann.atable.Model.MenuItem;
import com.yann.atable.Repository.MenuItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuItemService {
    private final MenuItemRepository menuItemRepository;

    public MenuItem createMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public MenuItem getMenuItem(Integer id) {
        return menuItemRepository.findById(Long.valueOf(id)).orElseThrow(() -> new RuntimeException("MenuItem not found"));
    }

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    public List<MenuItem> getMenuItemsByType(MenuItemType type) {
        return menuItemRepository.findByType(type);
    }

    public MenuItem updateMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public void deleteMenuItem(Integer id) {
        menuItemRepository.deleteById(Long.valueOf(id));
    }
}
