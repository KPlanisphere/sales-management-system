# Customer and Product Management System

## Sistema de Gestión de Clientes y Productos de Elena (SGCP-E)

### Description

This project is a Sales Management System developed as a final project for a university course in Project Management. The system is implemented in Java and provides functionalities for managing various aspects of a sales business, including client management, product inventory, sales transactions, and reporting.

<p align= "center">
    <img src="https://github.com/KPlanisphere/sales-management-system/assets/60454942/2c5e574c-6169-4997-96b8-96f7a3ee0ab5" style="width: 70%; height: auto;">
</p>


### Features

- **Client Management**: Add, update, delete, and list clients.
- **Product Inventory**: Manage products with functionalities to add, update, delete, and list products.
- **Sales Transactions**: Handle sales operations including creating, viewing, and managing sales records.
- **User Authentication**: Secure login system for accessing the application.
- **Reporting**: Generate graphical reports for sales data analysis.
- **Database Integration**: Uses SQL databases for persistent storage of information.
- **Notifications and Alerts**: Notify administrators about product stock levels, client birthdays, and personalized messages.

### Structure

The project structure is organized as follows:

- **build/**: Contains build-related files and directories.
  - **build.xml**: Apache Ant build file for compiling and packaging the project.
  - **classes/**: Directory containing compiled classes and resources.
    - **Img/**: Contains image assets used in the project.
  - **built-jar.properties**: Properties file for the built JAR.
  
- **src/**: Contains the source code of the project.
  - **Modelo/**: Contains the Java classes for the business logic.
    - **Cliente.java**: Represents the client model.
    - **ClienteDao.java**: Data access object for client operations.
    - **Combo.java**: Represents a combo of products.
    - **Conexion.java**: Manages the database connection.
    - **Config.java**: Represents the configuration settings.
    - **Detalle.java**: Represents the details of a sale.
    - **Eventos.java**: Handles various events.
    - **login.java**: Represents the login model.
    - **LoginDAO.java**: Data access object for login operations.
    - **Productos.java**: Represents the product model.
    - **ProductosDao.java**: Data access object for product operations.
    - **Proveedor.java**: Represents the supplier model.
    - **ProveedorDao.java**: Data access object for supplier operations.
    - **Render.java**: Handles rendering operations.
    - **Venta.java**: Represents the sale model.
    - **VentaDao.java**: Data access object for sale operations.
  - **Reportes/**: Includes classes for generating graphical reports.
    - **Grafico.java**: Responsible for generating graphical reports of sales data.
  - **Vista/**: Contains the Java classes for the user interface.
    - **AudioStream.java**: Handles audio streaming.
    - **Login.form**: Form file for the login interface.
    - **Login.java**: Java class for the login interface.
    - **Sistema.form**: Form file for the main sales system interface.
    - **Sistema.java**: Java class for the main sales system interface.
  - **Img/**: Contains image assets used in the source code.

- **Ventas/**: Contains the packaged executable JAR file.
  - **SistemaVenta.jar**: Executable JAR file for the Sales Management System.

- **eteventas.sql**: SQL script for setting up the database schema and initial data.
- **pastechad.sql**: SQL script for additional database setup and data.
- **manifest.mf**: Manifest file for the JAR packaging.
- **README.md**: Project documentation file.

### Notable Code Snippets

#### 1. Client Management Example

The `ClienteDao.java` class provides data access operations for the `Cliente` model.

```java
public class ClienteDao {
    private Connection connection;

    public ClienteDao() {
        this.connection = new Conexion().getConnection();
    }

    public boolean registrarCliente(Cliente cliente) {
        String query = "INSERT INTO clientes (dni, nombre, direccion, telefono) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cliente.getDni());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getDireccion());
            stmt.setString(4, cliente.getTelefono());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Additional CRUD operations...
}
```

#### 2. Sales Reporting Example

The `Grafico.java` class is responsible for generating graphical reports of sales data.

```java
public class Grafico {
    public static void generarReporteVentas(List<Venta> ventas) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Venta venta : ventas) {
            dataset.addValue(venta.getTotal(), "Ventas", venta.getFecha());
        }

        JFreeChart chart = ChartFactory.createBarChart(
            "Reporte de Ventas",
            "Fecha",
            "Total",
            dataset,
            PlotOrientation.VERTICAL,
            false, true, false
        );

        ChartFrame frame = new ChartFrame("Reporte de Ventas", chart);
        frame.pack();
        frame.setVisible(true);
    }
}
```

### Setup Instructions

1.  **Clone the repository**:
    
```bash
    git clone https://github.com/KPlanisphere/sales-management-system.git
    cd sales-management-system
```
    
2.  **Set up the database**:
    
    -   Import the SQL scripts (`eteventas.sql` and `pastechad.sql`) into your database management system.
3.  **Build the project**:
    
    -   Use Apache Ant to compile and build the project.
    
```bash
    ant build
```
    
4.  **Run the application**:
    
    -   Execute the JAR file located in the `Ventas` directory.
    
```bash
    java -jar Ventas/SistemaVenta.jar
```
    

### Principal Document: ProyectoFinal_IS23.pdf

The [ProyectoFinal_IS23.pdf](ProyectoFinal_IS23.pdf) document provides the main context and problem statement that led to the development of this project, "Gestión de Clientes y Productos de Elena (SGCP-E)". Key points from the document include:

-   **Business Background**: Elena runs an aromatherapy business that has been managed manually. With the increasing number of clients, she decided to automate her business operations.
-   **Client Management**: The system needs to handle a continuously growing client database, storing information such as registration date, full name, address, email, phone numbers, birthday, ailments (e.g., headaches, joint pain, allergies), occupation, hobbies, and how the client was met.
-   **Product Management**: The system must track products purchased by clients, including purchase date, estimated product duration, and client feedback.
-   **Notifications and Alerts**: Automatic notifications are required to remind clients to repurchase products nearing the end of their estimated duration. Reports should be generated for products on promotion, and notifications should be sent for client birthdays.
-   **Promotions and Reports**: Regular promotions (every four weeks) and weekly promotions need detailed reports on clients who have purchased promotional products, including estimated product termination dates for follow-up.
-   **Database and Expansion**: The system should support database scalability to handle data from multiple branches as the business grows.

### Detailed Documentation

The detailed documentation of the project is provided in the [Software Requirements Specification (SRS) document](SRS_ADOO.pdf). This document includes:

-   **Introduction**: Purpose, scope, involved personnel, definitions, acronyms, and references.
-   **General Description**: Product perspective, functionality, user characteristics, constraints, assumptions, and dependencies.
-   **Specific Requirements**: Detailed functional and non-functional requirements, including:
    -   **Functional Requirements**: Register, update, delete clients and products, handle sales transactions, generate reports, notify about stock levels, alert on client birthdays, and send personalized messages.
    -   **Non-Functional Requirements**: Performance, security, reliability, availability, maintainability, and portability.
-   **Appendices**: View of Participating Classes (VOPC) and Sequence Diagrams for various use cases such as registering and updating products and clients, handling sales, generating reports, and notifications.

This SRS document serves as a comprehensive guide for understanding the system's requirements and functionalities.

### User Manual

The [User Manual for the Sistema de Gestión de Clientes y Productos de Elena (SGCP-E)](Manual de Usuario (SGCP-E).pdf) provides a comprehensive guide on how to use the system effectively. It includes detailed instructions and illustrations for each functionality of the system. The main sections of the manual are:

-   **Introduction**: Overview of the SGCP-E and its purpose.
-   **Objective**: Goals of the user manual and what it aims to achieve.
-   **Requirements**: System and hardware requirements for running the SGCP-E.
-   **System Options**:
    -   **Login**: Steps to log in to the system, including handling errors.
    -   **New Sale**: Process of creating a new sale, including product code entry, quantity, client ID, and ticket generation.
    -   **Clients**: Instructions for registering, updating, deleting, and managing client information.
    -   **Products**: Steps for registering, updating, and deleting products, as well as managing product information.
    -   **Configuration**: How to update company data such as branch number, name, address, phone, and custom messages.
    -   **Users**: Managing user accounts, including registration and viewing user information.

This user manual ensures that users can efficiently navigate and utilize all features of the SGCP-E system.

### Testing Documentation

The [Testing Documentation for the Sistema de Gestión de Clientes y Productos de Elena (SGCP-E)](Pruebas Caja BlancaNegra.pdf) provides an in-depth look into the testing process used to ensure the system's reliability and performance. The document covers:

-   **Black Box Testing**: Focuses on validating the functionality of the system without considering its internal code structure. It verifies that the system behaves as expected based on the provided inputs and the generated outputs.
    -   **Register Product**: Tests the product registration process, ensuring that the system correctly handles both normal and erroneous inputs.
    -   **Register Client**: Tests the client registration process, validating that the system correctly manages complete and incomplete data entries.
-   **White Box Testing**: Examines the internal workings of the system's code to ensure that all possible execution paths are tested.
    -   **Code Coverage**: Ensures that all lines of code and logical paths are exercised during testing.
    -   **Test Case Design**: Based on the detailed knowledge of the internal structure of the code.

The testing documentation highlights the importance of both black box and white box testing methods to provide a comprehensive evaluation of the system's functionality, performance, and reliability. It includes specific test cases, expected outcomes, actual outcomes, and detailed steps for reproducing any identified issues.
