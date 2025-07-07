# Conversor de Monedas

Este es un proyecto de consola en Java que te permite convertir diferentes monedas utilizando tasas de cambio actualizadas obtenidas de una API externa.

---

## Características

* **Conversión de Monedas:** Convierte entre Peso MXN, Dólar USD, Euro EUR, Yen JPY, Libra Esterlina GBP, Peso Colombiano COL y Dólar Canadiense CAD.
* **Tasas de Cambio Actualizadas:** Utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de cambio en tiempo real.
* **Interfaz de Consola Amigable:** Ofrece un menú interactivo y fácil de usar para seleccionar monedas y realizar conversiones.

---

## Cómo Empezar

### Requisitos

* **Java Development Kit (JDK) 11 o superior:** Asegúrate de tener el JDK instalado en tu sistema. Puedes descargarlo desde el sitio oficial de Oracle o a través de OpenJDK.
* **Conexión a Internet:** Necesaria para obtener las tasas de cambio de la API.
* **Clave API de ExchangeRate-API:**
    1.  Ve a [exchangerate-api.com](https://www.exchangerate-api.com/).
    2.  Regístrate para obtener una cuenta gratuita.
    3.  Obtén tu **clave API** personal. Necesitarás insertarla en el código fuente.

### Configuración del Proyecto

1.  **Clona este repositorio:**
    ```bash
    git clone [https://github.com/Javier30ivera/Conversor-de-Monedas.git](https://github.com/Javier30ivera/Conversor-de-Monedas.git)
    cd Conversor-de-Monedas
    ```

2.  **Configura tu Clave API:**
    * Abre el archivo `ConsultarAPI.java`.
    * Busca la línea que define `API_KEY`:
        ```java
        private String key = "TU_CLAVE_API_AQUI"; // Reemplaza con tu clave API real
        ```
    * Reemplaza `"TU_CLAVE_API_AQUI"` con la clave API que obtuviste de `exchangerate-api.com`.

3.  **Añade la Dependencia Gson:**
    Este proyecto utiliza la librería Gson para manejar la serialización y deserialización de JSON, lo cual es necesario para procesar la respuesta de la API.

    * **Si usas Maven (recomendado):**
        Abre el archivo `pom.xml` y añade la siguiente dependencia dentro de la sección `<dependencies>`:
        ```xml
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.10.1</version> </dependency>
        ```
        Después de añadirla, recarga tu proyecto Maven en tu IDE (IntelliJ, Eclipse, VS Code) para que descargue la dependencia.

    * **Si no usas Maven:**
        1.  Descarga el archivo JAR de Gson desde [Maven Central](https://mvnrepository.com/artifact/com.google.code.gson/gson).
        2.  Añade este JAR a la ruta de clases (classpath) de tu proyecto en tu IDE.

## Uso

Una vez que la aplicación esté ejecutándose, verás un menú en la consola:

1.  Selecciona la **moneda base** ingresando el número correspondiente.
2.  Luego, selecciona la **moneda a la que deseas convertir**.
3.  Ingresa la **cantidad** que deseas convertir.
4.  El resultado de la conversión se mostrará en pantalla.

### Opciones del Menú

* **1-7:** Seleccionar las monedas para la conversión.
* **S:** Salir del programa.

---

## Estructura del Proyecto

* `Main.java`: Contiene la lógica principal del menú y la interacción con el usuario.
* `ConsultarAPI.java`: Clase encargada de comunicarse con la API de ExchangeRate-API para obtener las tasas de cambio.

