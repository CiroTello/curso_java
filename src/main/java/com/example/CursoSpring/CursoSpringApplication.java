package com.example.CursoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.beans.factory.annotation.Value;

import javax.sql.DataSource;
import java.net.InetAddress;
import java.sql.Connection;

@SpringBootApplication
public class CursoSpringApplication {

    @Value("${spring.application.name:Proyecto-Sin-Nombre}")
    private String appName;

    @Value("${server.port:8080}/api/")
    private String port;

    private final DataSource dataSource;

    public CursoSpringApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(CursoSpringApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void logStartup() {
        try (Connection conn = dataSource.getConnection()) {
            String dbName = conn.getMetaData().getDatabaseProductName();
            String dbVersion = conn.getMetaData().getDatabaseProductVersion();
            String hostAddress = InetAddress.getLocalHost().getHostAddress();

            System.out.println("----------------------------------------------------------");
            System.out.printf("    Application '%s' is running! Access URLs:%n", appName);
            System.out.printf("    Local:      http://localhost:%s%n", port);
            System.out.printf("    External:   http://%s:%s%n", hostAddress, port);
            System.out.printf("    Database:   %s %s%n", dbName, dbVersion);
            System.out.println("----------------------------------------------------------");

        } catch (Exception e) {
            System.out.println("⚠️ No se pudo obtener la info de la base de datos: " + e.getMessage());
        }
    }
}
