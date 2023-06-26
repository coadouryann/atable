package com.yann.atable.Controller;

import com.yann.atable.Model.MenuItem;
import com.yann.atable.Service.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/menuitems")
@RequiredArgsConstructor
public class MenuItemController {
    private final MenuItemService menuItemService;

    @GetMapping("/entrees")
    public List<MenuItem> getEntrees() {
        return menuItemService.getEntrees();
    }

    @GetMapping("/plats")
    public List<MenuItem> getPlats() {
        return menuItemService.getPlats();
    }

    @GetMapping("/desserts")
    public List<MenuItem> getDesserts() {
        return menuItemService.getDesserts();
    }
}
