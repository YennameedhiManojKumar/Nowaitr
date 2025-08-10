package com.nowaitr.nowaitr.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.nowaitr.nowaitr.model.MenuItem;
import com.nowaitr.nowaitr.repository.MenuItemRepository;

@Service
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;

    public MenuItemService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    public MenuItem saveMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    public MenuItem getById(Long id) {
        return menuItemRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        menuItemRepository.deleteById(id);
    }

}
