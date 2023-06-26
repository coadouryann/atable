package com.yann.atable.Service;

import com.yann.atable.Repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceService {
    private final ServiceRepository serviceRepository;

}
