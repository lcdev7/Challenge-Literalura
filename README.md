# 📚 Challenge LiterAlura - Catálogo de Libros

Proyecto desarrollado en **Java con Spring Boot** que permite consultar libros desde la API pública **Gutendex** y almacenarlos en una base de datos **PostgreSQL** para su posterior consulta.

Este proyecto forma parte del **Challenge LiterAlura** y consiste en construir un catálogo de libros que interactúa con una API externa y una base de datos relacional.

---

# 🚀 Funcionalidades

El sistema funciona mediante un menú en consola con las siguientes opciones:

```
1 - Buscar libro por título
2 - Listar libros registrados
3 - Listar autores registrados
4 - Listar autores vivos en determinado año
5 - Listar libros por idioma
0 - Salir
```

### 🔎 Buscar libro por título

Consulta la **API Gutendex** y registra el libro en la base de datos si no existe previamente.

### 📖 Listar libros registrados

Muestra todos los libros almacenados en la base de datos.

### ✍️ Listar autores registrados

Muestra todos los autores registrados en el sistema.

### 📅 Listar autores vivos en determinado año

Permite consultar qué autores estaban vivos en un año específico.

### 🌎 Listar libros por idioma

Permite filtrar los libros registrados según su idioma.

---

# 🛠 Tecnologías utilizadas

* **Java 17**
* **Spring Boot**
* **Spring Data JPA**
* **PostgreSQL**
* **Maven**
* **Jackson**
* **API Gutendex**

---

# 🗂 Estructura del proyecto

```
challengeLiterAluragrupo9
│
├── model
│   ├── Autor.java
│   └── Libro.java
│
├── repository
│   ├── AutorRepository.java
│   └── LibroRepository.java
│
├── service
│   ├── ConsumoAPI.java
│   └── ConvierteDatos.java
│
├── dto
│   ├── DatosAutor.java
│   ├── DatosLibro.java
│   └── DatosRespuesta.java
│
├── principal
│   └── Principal.java
│
└── ChallengeLiterAluragrupo9Application.java
```

---

# ⚙️ Configuración del proyecto

## 1️⃣ Clonar el repositorio

```
git clone https://github.com/tu-usuario/challengeLiterAluragrupo9.git
```

Entrar al proyecto:

```
cd challengeLiterAluragrupo9
```

---

## 2️⃣ Configurar la base de datos

Crear una base de datos en **PostgreSQL** llamada:

```
literalura
```

Configurar el archivo:

```
src/main/resources/application.properties
```

Ejemplo:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=postgres
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.format-sql=true
```

---

## 3️⃣ Ejecutar el proyecto

Desde la terminal ejecutar:

```
mvn spring-boot:run
```

El programa iniciará y mostrará el menú en consola.

---

# 🌐 API utilizada

El proyecto consume datos de la API pública:

https://gutendex.com/

Ejemplo de consulta:

```
https://gutendex.com/books/?search=quijote
```

---

# 📌 Características importantes

✔ Consumo de API REST
✔ Conversión de JSON a objetos Java
✔ Persistencia de datos con JPA
✔ Relación entre entidades Autor y Libro
✔ Prevención de duplicados en la base de datos

---

# 👨‍💻 Autor

Proyecto desarrollado por **Felipe Caicedo** como parte del Challenge LiterAlura.

---

# 📄 Licencia

Este proyecto es solo para fines educativos.
