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
```text
workout-tracker/
├── frontend/              # Static frontend (HTML, JS, charts, UI logic)
│   └── index.html         # Main user interface for logging workouts & viewing analytics
├── backend/               # Spring Boot backend (REST API + business logic)
├── .gitignore             # Specifies files/folders Git should ignore
├── README.md              # Project documentation and overview
├── mvnw                   # Maven wrapper (Linux/Mac) for running the project
├── mvnw.cmd               # Maven wrapper (Windows)
└── pom.xml                # Maven configuration (dependencies, build settings)
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

## 🚀 Getting Started

### 1. Run Backend

```bash
cd workouttracker
```
**Mac/Linux:**
```bash
./mvnw spring-boot:run
```
**Windows:**
```bash
mvnw.cmd spring-boot:run
```
Backend runs on:
```
http://localhost:8080
```
### 1. Run Frontend
Open `frontend/index.html` using Live Server in VS Code

---

## 📊 Example Features
- Track strength progression over time
- Predict future performance using ML
- Get personalized workout recommendations

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
