# Foodies - Full Stack Food Ordering Application

## Overview

Foodies is a full-stack e-commerce web application for online food ordering. It provides a seamless experience for users to browse, order, and securely pay for food items, along with an admin panel for system management.

The application is built using a React-based frontend and a Spring Boot backend, connected via RESTful APIs. The frontend is deployed, while the backend runs locally to enable full functionality.

---

## Architecture

The project consists of three main components:

* Frontend: User-facing application built with React.js (Vite)
* Backend: REST API built with Spring Boot
* Admin Panel: Separate React-based interface for administrative tasks

---

## Features

### User Module

* Secure authentication using JWT
* Role-based access control (User/Admin)
* User profile management

---

### Product and Catalog

* Browse food items with detailed information
* Search and filter products by category
* Add items to cart

---

### Cart and Orders

* Add and remove items from cart
* Place orders with secure checkout
* View order history

---

### Payment Integration

* Integrated Razorpay payment gateway
* Secure online transactions
* Order confirmation after successful payment
* Backend verification of payment for security

---

### Admin Panel

* Manage products (Create, Read, Update, Delete)
* Manage users and orders
* Monitor application data

---

## Technology Stack

### Frontend

* React.js (Vite)
* Bootstrap CSS
* Axios

---

### Backend

* Java 17+
* Spring Boot
* Spring Security with JWT
* MongoDB

---

### Payments

* Razorpay API (Payment Gateway Integration)

---

### Tools

* Postman (API testing)
* Docker (optional containerization)
* Git (version control)

---

## Project Structure

```id="w3k8vn"
foodies/              # Frontend (React - deployed)
foodiesapi/      # Backend (Spring Boot - local)
adminpanel/          # Admin frontend
```

---

## Setup Instructions

### Backend Setup

```bash id="q2v7ld"
cd foodies_backend
mvn clean install
mvn spring-boot:run
```

Ensure MongoDB is running locally.

---

### Frontend Setup (Optional)

```bash id="n8x1rp"
cd foodies
npm install
npm run dev
```

---

## System Requirements

* Java 17 or higher
* Node.js 18 or higher
* MongoDB
* Maven
* Git

---

## Future Enhancements

* Add multiple payment options
* Order tracking system
* Recommendation system
* Deploy backend to cloud

---

## Author

Jayapriya R
GitHub: https://github.com/jennyr17
