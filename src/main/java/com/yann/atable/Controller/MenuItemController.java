package com.yann.atable.Controller;

import com.yann.atable.Enum.MenuItemType;
import com.yann.atable.Model.MenuItem;
import com.yann.atable.Service.MenuItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menuitem")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class MenuItemController {
    private final MenuItemService menuItemService;

    @PostMapping
    public ResponseEntity<MenuItem> createMenuItem(@RequestBody MenuItem menuItem) {
        log.info("Creating new MenuItem: {}", menuItem);
        return new ResponseEntity<>(menuItemService.createMenuItem(menuItem), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenuItem> getMenuItem(@PathVariable Integer id) {
        log.info("Fetching MenuItem with id: {}", id);
        return new ResponseEntity<>(menuItemService.getMenuItem(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MenuItem>> getAllMenuItems() {
        log.info("Fetching all MenuItems");
        return new ResponseEntity<>(menuItemService.getAllMenuItems(), HttpStatus.OK);
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<MenuItem>> getMenuItemsByType(@PathVariable MenuItemType type) {
        log.info("Fetching MenuItems of type: {}", type);
        return new ResponseEntity<>(menuItemService.getMenuItemsByType(type), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<MenuItem> updateMenuItem(@RequestBody MenuItem menuItem) {
        log.info("Updating MenuItem: {}", menuItem);
        return new ResponseEntity<>(menuItemService.updateMenuItem(menuItem), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenuItem(@PathVariable Integer id) {
        log.info("Deleting MenuItem with id: {}", id);
        menuItemService.deleteMenuItem(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
