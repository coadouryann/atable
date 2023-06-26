package com.yann.atable.Controller;

import com.yann.atable.Service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ServiceController {
    private final ServiceService serviceService;


}
