package org.example.order.service;

import org.example.order.dto.OrderResponseDto;
import org.example.order.entity.Customer;
import org.example.order.entity.Order;
import org.example.order.entity.Product;
import org.example.order.util.RestClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;


@Service
public class OrderService {
    private RestTemplate restTemplate;

    public Order getOrderById(@PathVariable int id) {
        Order order = new Order();
        order.setId(id);
        order.setDescription("test");
        Customer customer = restTemplate.getForObject(
                "http://CUSTOMER/customer/{id}",
                Customer.class,
                id
        );
        order.setCustomer(customer);
        Product product = restTemplate.getForObject(
                "http://PRODUCT/product/{id}",
                Product.class,
                id
        );
        order.setProduct(product);
        return order;
    }




    public OrderResponseDto orderToOrderResponseDto(Order order){
        OrderResponseDto orderResponseDto = new OrderResponseDto();
        orderResponseDto.setId(order.getId());
        orderResponseDto.setDescription(order.getDescription());
        RestClient<Product> productRestClient = new RestClient<>("http://PRODUCT/product/6"+order.getProductId());
        Product product = productRestClient.get(Product.class);
        orderResponseDto.setProduct(product);
        RestClient<Customer> customerRestClient = new RestClient<>("http://CUSTOMER/customer/6");
        Customer customer = customerRestClient.get(Customer.class);
        orderResponseDto.setCustomer(customer);
        return orderResponseDto;
    }


}
