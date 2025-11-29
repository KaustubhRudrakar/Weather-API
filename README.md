---------------------------------------------------------------------------------------------------------------------------------------------------------
## 🌦️ Weather Application

A REST API application built using Spring Boot, serving a static frontend UI and providing weather information using a nested JSON dataset.
The project demonstrates backend–frontend integration, static file hosting, and JSON-based data handling.

---------------------------------------------------------------------------------------------------------------------------------------------------------
## 📁 Project Structure

<img width="654" height="893" alt="Screenshot 2025-11-30 020115" src="https://github.com/user-attachments/assets/99d5521d-c657-44cf-a494-d337354a6975" />

---------------------------------------------------------------------------------------------------------------------------------------------------------
## 🚀 Features

**Backend (Spring Boot)**
- REST API designed to fetch weather data efficiently  
- Handles Nested JSON dataset organized by district  
- Layered Architecture implementation:  
  - Controller for request handling  
  - Service for business logic  
  - Utility for supporting functions  
- CORS Enabled to allow cross-origin requests  

**Frontend (Static: HTML + JS + CSS)**
- Powered by Spring Boot for efficient server-side processing  
- User-Friendly Interface featuring a clean design and integrated search box  
- Data Retrieval accomplished through JavaScript using the Fetch API
  
---------------------------------------------------------------------------------------------------------------------------------------------------------
## 🌐 API Endpoints

Get Weather by District
GET /api/weather/{districtName}
e.g: GET /api/weather/Pune

📊 Sample Response
{
  "district": "Pune",
  "temperature": 29,
  "humidity": 62,
  "condition": "Cloudy"
}

---------------------------------------------------------------------------------------------------------------------------------------------------------
## 🛠️ Tech Stack

- Java 8 utilized for modern programming features  
- Spring Boot framework for rapid application development  
- Maven used for dependency management and project build  
- Front-End Technologies: HTML, CSS, and JavaScript for a dynamic user interface  
- Local JSON Dataset employed for data storage and retrieval

---------------------------------------------------------------------------------------------------------------------------------------------------------
## ▶️ Running the Application

1️⃣ Clone the repository
    git clone https://github.com/KaustubhRudrakar/Weather-API.git
    cd Weather-API

2️⃣ Run the application
    mvn spring-boot:run
    
3️⃣ Open the UI
    http://localhost:8080/index.html
    
---------------------------------------------------------------------------------------------------------------------------------------------------------
## ⚙️ Configuration (Optional)

  server.port=8080
  spring.resources.static-locations=classpath:/static/
  
---------------------------------------------------------------------------------------------------------------------------------------------------------
## 🖼️ Screenshots

<img width="1919" height="1019" alt="Screenshot 2025-11-30 014130" src="https://github.com/user-attachments/assets/f022f956-88dc-44db-8272-289478e6d16b" />
<img width="1918" height="1016" alt="Screenshot 2025-11-30 014225" src="https://github.com/user-attachments/assets/0d2e0692-abed-417b-bcd7-a54f014e2401" />
<img width="1915" height="1012" alt="Screenshot 2025-11-30 014411" src="https://github.com/user-attachments/assets/7b804623-52ff-4073-9d6c-014bf198cfe6" />

---------------------------------------------------------------------------------------------------------------------------------------------------------
## 📄 License

This project is licensed under the MIT License.
See the LICENSE file in the repository.

---------------------------------------------------------------------------------------------------------------------------------------------------------
## 👨‍💻 Author 

Kaustubh Rudrakar
GitHub: https://github.com/KaustubhRudrakar

---------------------------------------------------------------------------------------------------------------------------------------------------------
