# Event Booking App – Full Stack (Spring Boot + Angular)

A full-stack web application for managing and booking events. The **backend** is built with Spring Boot, and the **frontend** with Angular. Designed for both customers and administrators, it supports secure user authentication, event browsing/booking, and admin-level management.

---

## Project Context

The company requires a complete event booking system. responsibility was to build and document both the **backend API** and the **frontend application**. The backend handles authentication (JWT), CRUD operations, and business logic, while the frontend offers an interactive UI for users and admins.

---

## Project Structure
event-booking/
│
├── backend/ # Spring Boot API
│ └── src/...
│
├── frontend/ # Angular frontend
│ └── src/...


---

## Features

### For Clients:
- View homepage events
- Register and log in
- View/update user profile
- Search and filter events (by date, location, category)
- Book events
- View team information (About page)

### For Admins:
- Dashboard statistics (users, bookings, events)
- Manage users (view/delete)
- Manage events (create, update, delete, view details)

---

## Security

- JWT-based authentication
- Role-based access control (`ADMIN`, `USER`)
- Spring Security for protecting backend endpoints

---

## Technologies Used

- **Backend:** Java, Spring Boot, Spring Security, JWT, JPA/Hibernate, MySQL
- **Frontend:** Angular, TypeScript, HTML, SCSS, Bootstrap
- **Tools:** Maven, Postman, VS Code, IntelliJ IDEA

---

## Setup Instructions

### Backend (Spring Boot)

1. Go to the `backend/` folder.
2. Configure `application.properties` with your database credentials.
3. Run the project using your IDE or terminal:
---
### CLASS UML
![classes uml](uml\DiagramDeClass.png)
---

### USE_CASE UML
![use case uml](uml\DiagramDeCasDeUtulisation.png)(uml\)
---

### SEQUENCE UML
![SEQUENCE uml](uml\sequenceUML.png)
---
