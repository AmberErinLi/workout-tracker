package com.example.workouttracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String exercise;
    private double weight;
    private int reps;
    private LocalDate date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User owner;

    // Constructors
    public Workout() {}

    public Workout(String exercise, double weight, int reps, LocalDate date) {
        this.exercise = exercise;
        this.weight = weight;
        this.reps = reps;
        this.date = date;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public User getOwner() { return owner; }
    public void setOwner(User owner) { this.owner = owner; }

    public String getExercise() { return exercise; }
    public void setExercise(String exercise) { this.exercise = exercise; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public int getReps() { return reps; }
    public void setReps(int reps) { this.reps = reps; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}