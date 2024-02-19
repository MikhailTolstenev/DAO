package ru.netology.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.Servis.servis;

import java.util.List;
//import ru.netology.servise.Servise;

@RestController
@AllArgsConstructor
public class Controller {
    private servis servise;
    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam (value = "name", required = false) String name) {
        return servise.getProductName(name);

}
        }
