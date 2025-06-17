package org.example.spring_exercice_product.controller;

import org.example.spring_exercice_product.model.Product;
import org.example.spring_exercice_product.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@Controller
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public String homePage(){
        return "homepage";
    }

    @GetMapping("/listproducts")
    public String list(Model model){
        List<Product> products = productService.getProducts();
        model.addAttribute("product", products);
        return "page_produits";
    }
    @GetMapping("/detail/{productId}")
    public String detailPage(@PathVariable("productId") UUID productID, Model model){
        Product products = productService.getProductByID(productID);
        model.addAttribute("product", products);
        return "page_details";
    }

}
