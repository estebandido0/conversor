# Conversor de Divisas

## Vista General

El conversor de divisas es un reto propuesto por el programa [Oracle Next Education](https://www.oracle.com/cl/education/oracle-next-education/) en conjunto con [Alura Latam](https://www.aluracursos.com/), para aplicar los conocimientos adquiridos durante los cursos de Java.

![alt text](/assets/preview.gif)

## Requisitos

El unico requisito para ejecutar el programa es tener java 8.

## Instalación

### Opción más rápida

Es requerido java 8 para la ejecucion.

La opción más rápida es descargar la última versión de `conversor.jar` en la sección de [releases](https://github.com/estebandido0/conversor/releases). Para luego ejecutarla mediante el comando

```bash
java -jar conversor.jar
```

### Opción recomendada

La opción recomendada es clonar el repositorio con el comando

```bash
git clone https://github.com/estebandido0/conversor.git
```

Luego navegar a la carpeta `src` y compilar la clase principal.

```bash
javac Main.java
```

Finalmente ejecuta el programa con `java Main`

## Uso

- Selecciona las divisas entre las cuales deseas convertir el dinero con las listas desplegables.
- Ingresa el monto a convertir en el espacio designado.
- Presiona el botón `Convertir!`

## Estructura del proyecto

Dentro de la carpeta [source](/src) están los archivos del programa. La organización y función de ellos es la siguiente:

- [`Moneda.java`](/src/Moneda.java) Es la clase encargada de realizar la conversión mediante una instancia de ella. Además, usa las constantes definidas en [`Divisas.java`](/src/Divisas.java) para hacer las conversiones.

- [`Divisas.java`](/src/Divisas.java) Es un enum que contiene los factores de conversión de divisas.

- [`ConversorGui.java`](/src/ConversorGui.java) Es la clase que crea la ventana principal del programa. Contiene todos los componentes y estilos, pero sin una funcionalidad determinada.

- [`Main.java`](/src/Main.java) Es la clase principal del programa. Donde se agregan funcionalidad a los componentes de la interfaz gráfica.

En la carpeta [bin](/bin/) se encuentra el bytecode generado por el programa.

## Sugerencias y Preguntas

Cualquier sugerencia o retroalimentación es bienvenida, puedes contactame por github, o por discord `Estebandido#1901`.
