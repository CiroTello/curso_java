package com.example.CursoSpring.service.funcional.collections.streams;

import com.example.CursoSpring.service.record.ProductDto;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMethodsAvanced {
    public static void main (String[] args) {
        List<ProductDto> products = List.of(
                new ProductDto("Laptop", 1000),
                new ProductDto("Phone", 500),
                new ProductDto("Keyboard", 80)
        );

        // 0. GroupingBy: Agrupa los elementos por una clave
        Map<String, List<ProductDto>> groupByPrice = products.stream()
                .collect(Collectors
                        .groupingBy(product -> product.price() < 100 ? "Cheap" : "Affordable")
                );
        System.out.println(groupByPrice);

        Map<String, Long> countByRange = products.stream()
                .collect(Collectors.groupingBy(
                        productDto -> productDto.price() > 50.0 ? "Caro" : "Barato",
                        Collectors.counting()
                ));

        // 1. Transformación de datos
        List<String> discountedProducts = products.stream()
                .map( productDto -> new ProductDto(productDto.name(), productDto.price()*0.9))
                .map(productDto -> String.format("%s: $%.2f", productDto.name(), productDto.price()))
                .toList();
        System.out.println(discountedProducts);

        // 2. Reducción matemática
        Double total = products.stream()
                .map(productDto -> productDto.price())
                .reduce(0.0, (sum, price)-> sum + price);
        System.out.println(total);

        String productSummary = products.stream()
                .map( p -> p.name() + "( $" + p.price() + " )")
                .reduce("", (s1, s2) -> {
                    if(s1.isEmpty()){
                        return s2;
                    }else{
                        return s1 + " | " + s2;
                    }
                });
        System.out.println(productSummary);

        // 3. Conversión entre colecciones
        Set<Double> uniquePrices = products.stream()
                .map(ProductDto::price)
                .collect(Collectors.toSet());
        System.out.println(uniquePrices);

        // De List a Map
        Map<String, Double> productMap = products.stream()
                .collect(Collectors.toMap(
                        ProductDto::name,
                        ProductDto::price,
                        (oldVal, newVal) -> newVal
                ));
        System.out.println(productMap);

        // De Map a List
        List<ProductDto> expensiveProducts = productMap.entrySet().stream()
                .filter(e -> e.getValue() > 50.0)
                .map(e -> new ProductDto(e.getKey(), e.getValue()))
                .toList();

        System.out.println(expensiveProducts);

    }
}
