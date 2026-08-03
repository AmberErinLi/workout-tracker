# 🏋️ Workout Tracker with ML Predictions

A full-stack workout tracking application that allows users to log workouts, visualize progress, predict future performance, and receive intelligent workout recommendations using machine learning.

---

## 🔥 Features

### 📊 Workout Tracking
- Log exercises with weight, reps, and date
- Stores data using a Spring Boot backend

### 📈 Progress Visualization
- Track max weight per day
- View estimated **1RM (one-rep max)** over time
- Clean interactive charts using Chart.js

### 🧠 Machine Learning Prediction
- Uses **linear regression** to predict future strength
- Displays projected 1RM trend on chart

### 🏆 PR Analytics
- View personal records by rep range (1RM, 2RM, 3RM, etc.)
- Helps analyze strength across different intensities

### 🤖 Smart Workout Recommendations
- Suggests next workout based on:
  - Recent performance
  - Strength trends
  - Progressive overload principles
- Uses realistic gym constraints (5 lb increments)

---

## 🛠️ Tech Stack

**Frontend**
- HTML, JavaScript
- Chart.js
- Tailwind CSS

**Backend**
- Java
- Spring Boot
- REST API

**Machine Learning**
- Linear Regression (implemented manually in JavaScript)

---

## 📂 Project Structure
The project is organized into separate frontend and backend components. The Spring Boot backend provides REST endpoints for managing workout data and performing analytics, while the frontend handles user interaction and data visualization.
```text
workout-tracker/
├── backend/
│   ├── src/               # Spring Boot source code (REST API + business logic)
│   ├── .mvn/              # Maven Wrapper configuration
│   ├── mvnw               # Maven Wrapper (Linux/macOS)
│   ├── mvnw.cmd           # Maven Wrapper (Windows)
│   └── pom.xml            # Maven dependencies and build configuration
├── frontend/
│   └── index.html         # User interface for logging workouts and viewing analytics
├── .gitignore             # Git ignore rules
└── README.md              # Project documentation
```
<details>
<summary><b>Click to view all files in /backend</b></summary>
   
```text
backend/
├── main/                         
│   ├── java/com/example/workouttracker
│   │   ├── controller
│   │   │   └── WorkoutController.java      # REST API endpoints (handles HTTP requests)
│   │   ├── model
│   │   │   └── Workout.java                # Data model (represents a workout entry)
│   │   ├── repository
│   │   │   └── WorkoutRepository.java      # Database access layer (CRUD operations)
│   │   └── WorkouttrackerApplication.java  # Main Spring Boot entry point
│   └── resources
│   │   └── application.properties          # App configuration (DB, port, settings)
└── test/java/com/example/workouttracker
│   └── WorkouttrackerApplicationTest.java  # Basic tests for application startup
```
</details>

---

## 📋 Prerequisites
- Java 17+
- VS Code (recommended)
- Live Server extension for VS Code (used to run the frontend)

---

## 🚀 Getting Started

#### 1. Clone the repository:
```bash
git clone https://github.com/AmberErinLi/workout-tracker.git
```
#### 2. Open the project in Visual Studio Code.
Open the `workout-tracker` folder in VS Code.
#### 3. Start the backend
Run the Spring Boot application from the backend directory using Maven Wrapper:
```bash
cd backend
./mvnw spring-boot:run
```
Windows PowerShell users may need to run:
```bash
cd backend
.\mvnw.cmd spring-boot:run
```
Backend runs on:
```
http://localhost:8080
```
#### 4. Start the frontend
Open `frontend/index.html` using the Live Server extension in VS Code.
#### 5. Use the application
Enter workout data and explore progress tracking, analytics, and predictions.

---

## 💡 Future Improvements
- Deploy app (AWS / Render / Vercel)
- Add user authentication
- Improve ML model (polynomial regression, more features)

---

## 🎯 Why This Project
This project demonstrates:

- Full-stack development skills
- Data visualization
- Machine learning fundamentals
- Real-world problem solving

---

## 👤 Author
Amber Li
