# 🏋️ Workout Tracker with ML Predictions

A full-stack workout tracking application that allows users to log workouts, visualize progress, predict future performance, and receive intelligent workout recommendations using machine learning.

---

## 🌐 Live Demo
**[workout-tracker-zlro.onrender.com](https://workout-tracker-zlro.onrender.com)**

Hosted on Render's free tier with a Neon Postgres database. The free tier spins down after periods of inactivity, so the first request after a while may take 30-60 seconds to wake up.

---

## 🔥 Features

### 👤 User Accounts
- Create an account and log in with email + password
- Each user's workout data is private to their account

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
- Spring Security (session-based authentication)
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
├── Dockerfile              # Container build used for deployment
├── .dockerignore           # Files excluded from the Docker build context
├── docker-compose.yml      # Local Postgres instance, for testing the prod database config
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
│   │   │   ├── AuthController.java         # Registration + session check endpoints
│   │   │   └── WorkoutController.java      # REST API endpoints (handles HTTP requests)
│   │   ├── security
│   │   │   ├── SecurityConfig.java         # Spring Security setup (login, logout, access rules)
│   │   │   └── AppUserDetailsService.java  # Loads users for authentication
│   │   ├── model
│   │   │   ├── User.java                   # Data model (represents an account)
│   │   │   └── Workout.java                # Data model (represents a workout entry, owned by a User)
│   │   ├── repository
│   │   │   ├── UserRepository.java         # Database access layer for accounts
│   │   │   └── WorkoutRepository.java      # Database access layer (CRUD operations)
│   │   └── WorkouttrackerApplication.java  # Main Spring Boot entry point
│   └── resources
│   │   ├── application.properties          # Default (dev) config: local H2 database
│   │   ├── application-prod.properties     # Production config: Postgres via env vars
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
Create an account, log in, and explore progress tracking, analytics, and predictions. Your data is saved to a local file (`data/`) and persists between restarts. Local dev uses an embedded H2 database, so no separate database install is required.

---

## ☁️ Deploying to Production
The live demo above runs as a Docker web service on [Render](https://render.com) (free tier) with a [Neon](https://neon.tech) Postgres database (free tier), auto-deploying from the `main` branch on every push.

By default the app runs against a local H2 file, which isn't reliable for a deployed environment (many hosts don't guarantee a persistent disk). A `prod` Spring profile is included that connects to a real Postgres database instead.

To use it, set these environment variables on your deploy host and activate the profile:
```
SPRING_PROFILES_ACTIVE=prod
DB_HOST=<your-postgres-host>
DB_PORT=5432
DB_NAME=<your-database-name>
DB_USERNAME=<your-database-username>
DB_PASSWORD=<your-database-password>
```
Any managed Postgres provider works here (Neon, Render Postgres, Railway, Supabase, etc.) — just plug in its connection details.

To test the `prod` config locally before deploying, start a local Postgres with Docker:
```bash
docker compose up -d
```
Then run the app against it:
```bash
SPRING_PROFILES_ACTIVE=prod DB_HOST=localhost DB_NAME=workouttracker DB_USERNAME=workouttracker DB_PASSWORD=workouttracker ./mvnw spring-boot:run
```

---

## 💡 Future Improvements
- Track sets per workout, not just a single entry
- Allow deleting a logged workout
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
