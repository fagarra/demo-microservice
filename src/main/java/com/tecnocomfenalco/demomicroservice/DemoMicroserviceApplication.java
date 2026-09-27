package com.tecnocomfenalco.demomicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tecnocomfenalco.demomicroservice.model.Producto;
import com.tecnocomfenalco.demomicroservice.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMicroserviceApplication.class, args);
    }


    @Bean
    CommandLineRunner inicializarDatos(ProductoRepository productoRepository) {
        return args -> {
            productoRepository.save(new Producto(null, "Laptop Pro", "Potente laptop para desarrollo", 1299.99, true));
            productoRepository.save(new Producto(null, "Monitor UltraWide", "Monitor de 34 pulgadas", 499.50, true));
            productoRepository.save(new Producto(null, "Teclado Mecánico", "Teclado para programadores", 89.90, true));
            productoRepository.save(new Producto(null, "Mouse Gaming", "Mouse ergonómico de alta precisión", 45.00, false));
        };
    }

}
