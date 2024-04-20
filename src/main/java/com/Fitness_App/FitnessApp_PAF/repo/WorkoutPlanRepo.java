package com.Fitness_App.FitnessApp_PAF.repo;

import com.Fitness_App.FitnessApp_PAF.entity.WorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutPlanRepo extends JpaRepository<WorkoutPlan,Integer> {
}
