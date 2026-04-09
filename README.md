# Sistema de Gestión de Publicaciones (Taller de Polimorfismo)

Este proyecto es una implementación en Java que demuestra los principios fundamentales de la Programación Orientada a Objetos (POO), específicamente la **Herencia** y el **Polimorfismo**.

## Descripción

El sistema permite gestionar diferentes tipos de publicaciones (Libros, Discos y Videos) a través de una jerarquía de clases bien definida. Cada tipo de publicación hereda atributos comunes de una clase base y añade sus propias propiedades específicas.

## Estructura del Proyecto

El proyecto consta de las siguientes clases:

- **`Idioma` (Enum)**: Define los idiomas disponibles (`ESPANOL`, `INGLES`, `PORTUGUES`).
- **`Publicacion` (Clase Base)**: Clase madre que contiene los atributos generales como `titulo` y `precio`.
- **`Libro`**: Especialización que añade `numeroPaginas` y `anioPublicacion`.
- **`Disco`**: Especialización que añade `duracionMinutos`.
- **`Video`**: Especialización que añade `duracionHoras` e `ididoma`.
- **`Main`**: Punto de entrada del programa para realizar pruebas de instanciación y visualización.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- Un terminal o IDE compatible con Java.

## Ejecución

Para compilar y ejecutar el proyecto desde la terminal, sigue estos pasos:

1. **Compilación**:
   ```bash
   javac *.java
   ```

2. **Ejecución**:
   ```bash
   java Main
   ```

## Ejemplo de Salida

Al ejecutar el programa, verás una representación en texto de los objetos creados:

```text
--- Sistema de Gestión de Publicaciones ---
Libro{titulo='Cien años de soledad', precio=45000.0, numeroPaginas=496, anioPublicacion=1967}
Disco{titulo='The Dark Side of the Moon', precio=55000.0, duracionMinutos=42.5}
Video{titulo='Inception', precio=30000.0, duracionHoras=2.48, idioma=ESPANOL}
```

## Características Técnicas

- **Encapsulamiento**: Todos los atributos son privados con sus respectivos métodos getter y setter.
- **Constructores múltiples**: Cada clase hija implementa tres tipos de constructores (vacío, atributos propios y completo).
- **Sobrescritura de métodos**: Uso de `@Override` en el método `toString()` para una representación personalizada.
