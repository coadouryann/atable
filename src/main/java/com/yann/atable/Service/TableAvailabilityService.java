package com.yann.atable.Service;

import com.yann.atable.Repository.TableAvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableAvailabilityService {
    private final TableAvailabilityRepository tableAvailabilityRepository;

    @Autowired
    public TableAvailabilityService(TableAvailabilityRepository tableAvailabilityRepository) {
        this.tableAvailabilityRepository = tableAvailabilityRepository;
    }
}
