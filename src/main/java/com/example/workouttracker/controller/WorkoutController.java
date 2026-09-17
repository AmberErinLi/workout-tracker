package com.example.workouttracker.controller;

import com.example.workouttracker.model.User;
import com.example.workouttracker.model.Workout;
import com.example.workouttracker.repository.UserRepository;
import com.example.workouttracker.repository.WorkoutRepository;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    private final WorkoutRepository repository;
    private final UserRepository userRepository;

    public WorkoutController(WorkoutRepository repository, UserRepository userRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
    }

    // POST: add a workout for the logged-in user
    @PostMapping
    public Workout addWorkout(@RequestBody Workout workout, Authentication authentication) {
        workout.setOwner(currentUser(authentication));
        return repository.save(workout);
    }

    // GET: get all workouts belonging to the logged-in user
    @GetMapping
    public List<Workout> getAllWorkouts(Authentication authentication) {
        return repository.findByOwner(currentUser(authentication));
    }

    private User currentUser(Authentication authentication) {
        return userRepository.findByEmail(authentication.getName())
                .orElseThrow(() -> new IllegalStateException("Authenticated user not found: " + authentication.getName()));
    }
}
