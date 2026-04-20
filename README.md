# 🍔 QuickBite – Food Ordering Management System

QuickBite is a simple web-based application built using **Spring Boot** and **Thymeleaf** to manage customers, menu items, and orders. It demonstrates core full-stack development concepts with a clean UI and database integration.

---

## 🚀 Features

### 👥 Customer Management

* Add customers
* View customer list
* Delete customers (with confirmation popup)

### 🍽️ Menu Management

* Add food items with price
* View menu items
* Delete items

### 🧾 Order Management

* Create orders using dropdown selection
* Select customer and food item
* Enter quantity
* Real-time total price calculation
* View all orders
* Delete orders

### 🎨 UI & UX

* Bootstrap-based modern UI
* Responsive design
* SweetAlert confirmation popups
* Clean dashboard-like layout

---

## 🛠️ Tech Stack

* **Backend:** Spring Boot, Java
* **Frontend:** Thymeleaf, HTML, CSS, JavaScript, Bootstrap
* **Database:** MySQL
* **ORM:** Spring Data JPA (Hibernate)
* **IDE:** IntelliJ IDEA

---

## 📂 Project Structure

```
com.quickbite
 ├── controller
 ├── service
 ├── repository
 ├── model
 └── QuickBiteApplication.java

resources/
 ├── templates
 ├── static
 └── application.properties
```

---

## ⚙️ Setup & Installation

### 1. Clone the Repository

```bash
git clone https://github.com/KoynaKarmakar/quickbite.git
cd quickbite
```

---

### 2. Configure MySQL

Create database:

```sql
CREATE DATABASE quickbite_db;
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/quickbite_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3. Run the Application

* Open project in IntelliJ
* Run `QuickBiteApplication.java`

---

### 4. Access the Application

```
http://localhost:8080/customers
http://localhost:8080/menu
http://localhost:8080/orders
```

---

## 🧠 Key Concepts Used

* MVC Architecture
* CRUD Operations
* Entity Relationships (Many-to-One)
* Thymeleaf Template Binding
* RESTful Routing
* Real-time UI updates with JavaScript

---

## 📸 Screenshots

*Add your screenshots here*

* Customers Page
* Menu Page
* Orders Page
* Delete Confirmation Popup

---

## ⚠️ Notes

* Delete operations may fail due to foreign key constraints
* Always delete dependent records (orders) first

---

## 🔮 Future Enhancements

* User authentication (Spring Security)
* Update/Edit functionality
* Order status tracking
* Dashboard analytics
* Advanced UI improvements

---

## 🤝 Contributing

Feel free to fork this repository and enhance it.

---

## 📄 License

This project is for educational purposes only.

---

## ✅ Status

**Completed ✔ | Ready for Demo & Submission**
