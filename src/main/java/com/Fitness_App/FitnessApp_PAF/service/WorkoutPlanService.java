package com.Fitness_App.FitnessApp_PAF.service;

import com.Fitness_App.FitnessApp_PAF.dto.WorkoutPlanDTO;
import com.Fitness_App.FitnessApp_PAF.entity.WorkoutPlan;
import com.Fitness_App.FitnessApp_PAF.repo.WorkoutPlanRepo;
import com.Fitness_App.FitnessApp_PAF.util.VarList;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class WorkoutPlanService {

    @Autowired
    private WorkoutPlanRepo workoutPlanRepo;

    @Autowired
    private ModelMapper modelMapper;

    public String saveWorkoutPlan(WorkoutPlanDTO workoutPlanDTO) {
        if (workoutPlanRepo.existsById(workoutPlanDTO.getWorkoutPlan_Id())) {
            return VarList.RSP_DUPLICATED;
        } else {
            workoutPlanRepo.save(modelMapper.map(workoutPlanDTO, WorkoutPlan.class));
            return VarList.RSP_SUCCESS;
        }
    }

    public String deleteWorkOutPlan(int WorkoutPlan_Id){
        if (workoutPlanRepo.existsById(WorkoutPlan_Id)){
            workoutPlanRepo.deleteById(WorkoutPlan_Id);
            return VarList.RSP_SUCCESS;
        }else{
            return VarList.RSP_NO_DATA_FOUND;
        }
    }


}

