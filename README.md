# Spring Boot Test API

Este proyecto implementa dos secuencias como endpoints REST:
- **Collatz Sequence**: Calcula la secuencia de Collatz para un número dado
- **FizzBuzz**: Genera la secuencia FizzBuzz hasta un número dado

## Requisitos

- Java 17
- Gradle 7+
- Un IDE, se usó Eclipse

## Ejecución del proyecto

1. Clonar el repositorio
   ```bash
   git clone https://github.com/<tu-usuario>/spring-boot-testapi.git
2. Navegar al directorio del proyecto
   cd spring-boot-testapi
3. Usar Gradle como constructor
   ./gradlew build
4. Ejecutar la app:
   ./gradlew bootRun
   
   La aplicación estará disponible en http://localhost:8080
   
## Endpoints
1. Collatz Sequence
 -Método: PUT
 -URL: /api/secuence/collatz/{input}
 -Descripción: Devuelve la secuencia de Collatz para el número {input}
 
2. FizzBuzz
 -Método: POST
 -URL: /api/secuence/fizzbuzz/{input}
 -Descripción: Devuelve la secuencia FizzBuzz hasta el número {input}
