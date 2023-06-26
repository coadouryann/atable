package com.yann.atable.Service;

import com.yann.atable.Repository.MenuItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuItemService {
    private final MenuItemRepository menuItemRepository;

}
