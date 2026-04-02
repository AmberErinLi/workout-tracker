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
├── frontend/ # HTML + JS frontend
├── src/ # Sprint Boot API backend
├── .gitignore
├── README.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```
<details>
<summary><b>Click to view all files in /src</b></summary>
   
```text
src/
├── main/                         
│   ├── java/com/example/workouttracker
│   │   ├── controller
│   │   │   └── WorkoutController.java
│   │   ├── model
│   │   │   └── Workout.java
│   │   ├── repository
│   │   │   └── WorkoutRepository.java
│   │   └── WorkouttrackerApplication.java
│   └── resources
│   │   └── application.properties
└── test/java/com/example/workouttracker
│   └── WorkouttrackerApplicationTest.java
```
</details>

---

## 🚀 Getting Started

### 1. Run Backend

```bash
cd backend
./mvnw spring-boot:run
```
Backend runs on:
```
http://localhost:8080
```
### 1. Run Frontend
Open `frontend/index.html` using Live Server in VS Code
