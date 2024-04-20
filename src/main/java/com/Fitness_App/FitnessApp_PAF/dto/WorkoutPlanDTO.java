package com.Fitness_App.FitnessApp_PAF.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkoutPlanDTO {

    private int WorkoutPlan_Id;
    private String WorkoutPlan_name;
    private String Routine;
    private String Exercise;
    private int Sets;
    private int reptitions;
}
