package com.kudiukin.homework3.repository;

import com.kudiukin.homework3.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
public class ProductCollection {

    private final Map<Integer, Product> products = new HashMap<>();

}
