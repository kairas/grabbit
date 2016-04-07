package com.twcable.grabbit.spring.batch.repository

import org.springframework.batch.core.repository.dao.ExecutionContextDao

/**
 * Created by sagar.sane on 4/7/16.
 */
interface GrabbitExecutionContextDao extends ExecutionContextDao {

    //Find executionContexts/job by "executionId" on executionContexts/job == "executionId" on jobExecutions
    public List<String> getJobExecutionContextPaths(List<String> jobExecutionResourcePaths)

    //Find executionContexts/step by "executionId" on executionContexts/step == "id" on stepExecutionsToRemove
    public List<String> getStepExecutionContextPaths(List<String> stepExecutionResourcePaths)
}