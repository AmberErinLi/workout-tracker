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
The project is a single Spring Boot application that serves the REST API and hosts the frontend as a static resource, so everything runs from one process on one port.
```text
workout-tracker/
├── src/                    # Spring Boot source code (REST API + business logic)
├── .mvn/                   # Maven Wrapper configuration
├── mvnw                    # Maven Wrapper (Linux/macOS)
├── mvnw.cmd                # Maven Wrapper (Windows)
├── pom.xml                 # Maven dependencies and build configuration
├── .gitignore              # Git ignore rules
└── README.md               # Project documentation
```
<details>
<summary><b>Click to view all files in /src</b></summary>
   
```text
src/
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
│   │   ├── application.properties          # App configuration (DB, port, settings)
│   │   └── static/index.html               # Frontend UI, served directly by Spring Boot
└── test/java/com/example/workouttracker
│   └── WorkouttrackerApplicationTest.java  # Basic tests for application startup
```
</details>

---

## 📋 Prerequisites
- Java 17+

---

## 🚀 Getting Started

#### 1. Clone the repository:
```bash
git clone https://github.com/AmberErinLi/workout-tracker.git
cd workout-tracker
```
#### 2. Run the application
Using Maven Wrapper:
```bash
./mvnw spring-boot:run
```
Windows PowerShell users may need to run:
```bash
.\mvnw.cmd spring-boot:run
```
#### 3. Use the application
Open your browser to:
```
http://localhost:8080
```
Enter workout data and explore progress tracking, analytics, and predictions. Your data is saved to a local file (`data/`) and persists between restarts.

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
