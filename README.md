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
<img width="748" height="445" alt="image 45" src="https://github.com/user-attachments/assets/97ef9de9-adc0-413b-a7b4-798fd52cb13b" />

Desde la ventana inicial se puede:

- **Cargar Datos**: abre el formulario para registrar una nueva reserva
- **Ver Datos**: permite consultar la información almacenada
- **Salir**: cierra la aplicación

### Formulario de carga
<img width="3182" height="2750" alt="image 46" src="https://github.com/user-attachments/assets/ec856d93-07b5-4ec7-a156-eb64e7bd3d85" />
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
<img width="2880" height="1932" alt="image 47" src="https://github.com/user-attachments/assets/3eab04d8-f6a8-4e95-9b62-9d47b892611a" />

### Edición de registros


Al seleccionar una fila de la tabla y presionar el botón de **Editar**, se abre un formulario con los datos previamente cargados.

En esta pantalla:
<img width="3173" height="2769" alt="image 48" src="https://github.com/user-attachments/assets/9634eefb-d3b3-42e7-bb45-44385cc881af" />

- Se muestran los datos actuales del **miembro** y la **reserva**
- El usuario puede modificar cualquier campo
- Al presionar **Guardar**, los cambios se actualizan en la base de datos
- La tabla se refresca mostrando la información actualizada

### Eliminación de registros

El sistema también permite eliminar reservas registradas.

- El usuario selecciona una fila de la tabla
- Presiona el botón **Eliminar**
- Se elimina el registro de la base de datos
- La tabla se actualiza automáticamente reflejando los cambios
<img width="2880" height="1932" alt="image 49" src="https://github.com/user-attachments/assets/7a8ccfbe-0b38-4d1c-af47-d9731ed19809" />


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
