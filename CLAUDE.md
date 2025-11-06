# CursoJava - Documentación del Proyecto

## Información General

**Nombre:** CursoJava
**Tipo:** Proyecto educativo de Java con Spring Boot
**Versión:** 0.0.1-SNAPSHOT
**Java:** 17
**Spring Boot:** 3.5.5
**Package base:** `com.example.cursoJava`

## Descripción

Proyecto de aprendizaje que cubre conceptos fundamentales y avanzados de Java, incluyendo programación funcional, genéricos, concurrencia, Optional y estructuras de datos personalizadas. Utiliza Spring Boot como framework base.

## Estructura del Proyecto

```
src/main/java/com/example/cursoJava/
├── CursoJavaApplication.java          # Clase principal de Spring Boot
├── rest/
│   └── ApiController.java             # Controlador REST básico
└── service/
    ├── concurrencia/                  # Ejemplos de programación concurrente
    │   ├── thread/
    │   │   └── ThreadExample.java     # Implementación con Thread
    │   └── runnable/
    │       └── RunnableExample.java   # Implementación con Runnable
    ├── funcional/                     # Programación funcional en Java
    │   ├── conceptos/
    │   │   ├── funcionalPuro.java           # Funciones puras
    │   │   ├── funcionalNoPuro.java         # Funciones impuras
    │   │   ├── funcionesSuperiores.java     # Higher-order functions
    │   │   └── transparenciaReferencial.java # Transparencia referencial
    │   ├── lambda/
    │   │   └── LambdaExample.java           # Expresiones lambda
    │   ├── consumer/
    │   │   └── ConsumerExample.java         # Consumer y BiConsumer
    │   ├── function/
    │   │   └── FunctionExample.java         # Function y BiFunction
    │   ├── predicate/
    │   │   └── PredicateExample.java        # Predicate y BiPredicate
    │   ├── supplier/
    │   │   ├── SupplierExample.java         # Supplier interface
    │   │   └── Persona.java                 # Clase de ejemplo
    │   ├── collections/
    │   │   ├── Collecciones.java            # Operaciones con colecciones
    │   │   └── streams/
    │   │       ├── Streams.java             # Introducción a Streams
    │   │       ├── StreamsMethods.java      # Métodos básicos de Streams
    │   │       └── StreamsMethodsAdvanced.java # Métodos avanzados
    │   ├── programacionDeclarativa.java     # Programación declarativa
    │   └── tareas/
    │       └── Calculator.java              # Ejercicios prácticos
    ├── optional/                      # Uso de Optional en Java
    │   ├── OptionalBasic.java         # Conceptos básicos de Optional
    │   └── OptionalAdvanced.java      # map, flatMap, filter en Optional
    ├── record/                        # Java Records
    │   ├── Product.java               # Clase tradicional
    │   ├── ProductDto.java            # Record (DTO inmutable)
    │   └── main.java                  # Ejemplos de uso
    └── tiposFlexibles/                # Tipos genéricos y estructuras de datos
        ├── genericos/
        │   ├── Box.java               # Clase genérica simple
        │   ├── genericosService.java  # Métodos genéricos
        │   ├── WildCardService.java   # Wildcards (?, extends, super)
        │   └── main.java              # Ejemplos de uso
        ├── linkedList/                # Implementación de lista enlazada
        │   ├── LinkedList.java        # Lista enlazada genérica
        │   ├── Node.java              # Nodo genérico
        │   └── Main.java              # Ejemplo de uso
        ├── pila/                      # Implementación de pila (Stack)
        │   ├── Stack.java             # Pila genérica (LIFO)
        │   └── Main.java              # Ejemplo de uso
        ├── cola/                      # Implementación de cola (Queue)
        │   ├── Queue.java             # Cola genérica (FIFO)
        │   └── Main.java              # Ejemplo de uso
        └── datastore/                 # Almacenamiento genérico
            ├── Datastore.java         # Almacén de datos genérico
            ├── User.java              # Clase de ejemplo
            └── Main.java              # Ejemplo de uso
```

## Dependencias Principales

### Spring Boot Starters
- `spring-boot-starter-web` - Desarrollo de APIs REST
- `spring-boot-starter-data-jpa` - Persistencia con JPA
- `spring-boot-starter-security` - Seguridad
- `spring-boot-starter-actuator` - Monitoreo y métricas
- `spring-boot-starter-validation` - Validación de datos
- `spring-boot-starter-test` - Testing

### Bases de Datos
- **H2** - Base de datos en memoria (desarrollo)
- **PostgreSQL** - Base de datos relacional (staging/producción)

### Herramientas
- **Lombok** - Reducción de código boilerplate
- **DevTools** - Hot reload en desarrollo

## Configuración de Perfiles

### Desarrollo (dev)
- Base de datos: H2 en memoria
- URL: `jdbc:h2:mem:cursojava_dev`
- Consola H2 habilitada
- Usuario: sa (sin contraseña)

### Staging (stg)
- Base de datos: PostgreSQL
- URL: `jdbc:postgresql://localhost:5433/cursojava`
- Usuario: postgres
- Contraseña: 1234

**Perfil activo por defecto:** `dev`

## Temas Cubiertos

### 1. Programación Funcional
- **Conceptos teóricos:** Funciones puras, impuras, higher-order functions, transparencia referencial
- **Interfaces funcionales:** Consumer, Function, Predicate, Supplier (versiones simples y Bi-)
- **Expresiones lambda:** Sintaxis y uso
- **Streams API:** Operaciones intermedias y terminales, map, filter, reduce, collect, groupingBy, etc.
- **Programación declarativa vs imperativa**

### 2. Optional
- **Básico:** empty, of, ofNullable, orElse, orElseThrow, isPresent, ifPresent
- **Avanzado:** map, flatMap, filter (para evitar null pointer exceptions)

### 3. Records (Java 14+)
- Clases inmutables simplificadas
- Comparación con POJOs tradicionales
- Uso como DTOs

### 4. Tipos Genéricos
- **Genéricos básicos:** Clases y métodos genéricos
- **Wildcards:** `?`, `? extends T`, `? super T`
- **Bounded types:** Restricciones de tipos

### 5. Estructuras de Datos Personalizadas
- **LinkedList:** Lista enlazada genérica
- **Stack:** Pila LIFO
- **Queue:** Cola FIFO
- **Datastore:** Almacén genérico con búsqueda

### 6. Concurrencia (En progreso)
- **Thread:** Extensión de la clase Thread
- **Runnable:** Implementación de la interfaz Runnable
- *Nota: Esta sección está en desarrollo*

## Comandos Útiles

### Ejecución
```bash
# Ejecutar con perfil dev
mvn spring-boot:run -Pdev

# Ejecutar con perfil stg
mvn spring-boot:run -Pstg
```

### Build
```bash
# Compilar el proyecto
mvn clean install

# Ejecutar tests
mvn test
```

### Bases de Datos
```bash
# Acceder a consola H2 (dev)
http://localhost:8080/h2-console

# Conectar a PostgreSQL (stg)
psql -h localhost -p 5433 -U postgres -d cursojava
```

## Notas de Implementación

### Convenciones de Código
- **Paquetes:** camelCase (ejemplo: `cursoJava`)
- **Clases:** PascalCase (ejemplo: `ConsumerExample`)
- **Métodos:** camelCase (ejemplo: `printUpper`)
- **Constantes:** UPPER_SNAKE_CASE

### Patrones de Ejemplo
La mayoría de las clases incluyen:
1. Comentarios explicativos de los conceptos
2. Método `main()` con ejemplos de uso
3. Múltiples ejemplos por concepto cuando es relevante

### Testing
Estructura base de tests en `src/test/java/com/example/cursoJava/`
- Tests unitarios pendientes de implementación

## Roadmap / Temas Pendientes

- [ ] Completar implementación de Runnable con ejemplos
- [ ] ExecutorService y Thread Pools
- [ ] CompletableFuture
- [ ] Streams paralelos
- [ ] Implementar tests unitarios
- [ ] Añadir documentación Javadoc
- [ ] Implementar endpoints REST funcionales
- [ ] Configurar seguridad básica

## Recursos Adicionales

### Referencias Java
- [Java 17 Documentation](https://docs.oracle.com/en/java/javase/17/)
- [Stream API Guide](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/package-summary.html)
- [Optional Guide](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Optional.html)

### Referencias Spring Boot
- [Spring Boot 3.5.5 Documentation](https://docs.spring.io/spring-boot/docs/3.5.5/reference/html/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

## Contacto y Contribuciones

Este es un proyecto educativo. Los ejemplos están diseñados para ser claros y didácticos, priorizando la comprensión sobre la optimización.
