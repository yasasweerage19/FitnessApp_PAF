package com.Fitness_App.FitnessApp_PAF.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="Workoutplans")

public class WorkoutPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int WorkoutPlan_Id;
    private String WorkoutPlan_name;
    private String Routine;
    private String Exercise;
    private int Sets;
    private int reptitions;


}
