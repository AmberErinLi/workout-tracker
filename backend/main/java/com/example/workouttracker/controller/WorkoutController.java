package com.example.workouttracker.controller;

import com.example.workouttracker.model.Workout;
import com.example.workouttracker.repository.WorkoutRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
@CrossOrigin(origins = "*")
public class WorkoutController {

    private final WorkoutRepository repository;

    // Constructor
    public WorkoutController(WorkoutRepository repository) {
        this.repository = repository;
    }

    // POST: add a workout
    @PostMapping
    public Workout addWorkout(@RequestBody Workout workout) {
        return repository.save(workout);
    }

    // GET: get all workouts
    @GetMapping
    public List<Workout> getAllWorkouts() {
        return repository.findAll();
    }
}