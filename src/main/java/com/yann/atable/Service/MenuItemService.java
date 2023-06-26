package com.yann.atable.Service;

import com.yann.atable.Enum.MenuItemType;
import com.yann.atable.Model.MenuItem;
import com.yann.atable.Repository.MenuItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuItemService {
    private final MenuItemRepository menuItemRepository;

    public List<MenuItem> getEntrees() {
        return menuItemRepository.findByType(MenuItemType.ENTREE);
    }

    public List<MenuItem> getPlats() {
        return menuItemRepository.findByType(MenuItemType.PLAT);
    }

    public List<MenuItem> getDesserts() {
        return menuItemRepository.findByType(MenuItemType.DESSERT);
    }

}
