package com.infinitycloud.rest;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class OrderServiceCodebuildPipelineEcrApplication {
	@Autowired
    private OrderDao orderDao;
	@GetMapping("/details")
	public String getDetails() {
		return "welcome to ECS";}
	

    @GetMapping("/orders")
    public List<Order> fetchOrders() {
        return orderDao.getOrders().stream().
                sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
    }
    


	public static void main(String[] args) {
		SpringApplication.run(OrderServiceCodebuildPipelineEcrApplication.class, args);
	}

}
