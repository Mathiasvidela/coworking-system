# Co-Working App

Aplicación de escritorio desarrollada en **Java** para la gestión de reservas de un espacio de coworking.  
El sistema permite registrar miembros, cargar reservas y visualizar los datos almacenados, utilizando una interfaz gráfica construida con **Java Swing** y persistencia de datos con un modelo por capas.

---

## Características

- Registro de reservas
- Registro de miembros
- Interfaz gráfica con Java Swing
- Navegación entre pantallas
- Persistencia de datos
- Diseño basado en modelo por capas
- Estilo visual moderno con FlatLaf

---

## Tecnologías utilizadas

- **Java**
- **Java Swing**
- **Maven**
- **FlatLaf**
- **POO (Programación Orientada a Objetos)**

---

## Estructura del proyecto

El proyecto está organizado en capas para mantener una mejor separación de responsabilidades:

- **igu**  
  Contiene las ventanas y componentes de la interfaz gráfica.

- **logica**  
  Contiene la lógica del sistema y las clases del dominio.

- **persistencia**  
  Encargada del acceso y almacenamiento de datos.

---

## Funcionamiento

La aplicación cuenta con una pantalla principal desde donde el usuario puede acceder a las distintas acciones del sistema.

### Pantalla principal
Desde la ventana inicial se puede:

- **Cargar Datos**: abre el formulario para registrar una nueva reserva
- **Ver Datos**: permite consultar la información almacenada
- **Salir**: cierra la aplicación

### Formulario de carga
En la pantalla de carga de datos se ingresan dos grupos de información:

#### Reserva
- Fecha
- Hora de inicio
- Hora de fin
- Tipo de reserva
- Espacio
- Estado
- Observaciones

#### Miembro
- Nombre
- Apellido
- Celular
- Email
- Tipo de cliente

Al presionar el botón **Guardar**, los datos ingresados se envían a la capa lógica para ser procesados y almacenados.

---

## Flujo general del sistema

1. El usuario abre la aplicación
2. Ingresa a la pantalla de carga de datos
3. Completa la información de la reserva y del miembro
4. Presiona el botón **Guardar**
5. Los datos se envían a la capa lógica
6. El sistema almacena la información
7. Se muestra un mensaje de confirmación

---

## Instalación y ejecución

### Requisitos
- Java JDK 17 o superior
- Maven
- NetBeans o cualquier IDE compatible con proyectos Maven

### Ejecutar el proyecto
1. Clonar este repositorio:
```bash
git clone https://github.com/Mathiasvidela/coworking-system/tree/master
