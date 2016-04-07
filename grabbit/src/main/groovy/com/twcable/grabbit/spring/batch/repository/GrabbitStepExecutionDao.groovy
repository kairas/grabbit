package com.twcable.grabbit.spring.batch.repository

import org.springframework.batch.core.repository.dao.StepExecutionDao

interface GrabbitStepExecutionDao extends StepExecutionDao {

    //Find stepExecutions by "jobExecutionId" on stepExecutions == "executionId" on jobExecutions
    public List<String> getStepExecutionPaths(List<String> jobExecutionResourcePaths)
}