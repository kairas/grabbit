package com.twcable.grabbit.spring.batch.repository

import org.springframework.batch.core.repository.dao.JobInstanceDao

/**
 * Created by sagar.sane on 4/7/16.
 */
interface GrabbitJobInstanceDao extends JobInstanceDao {

    //Find jobInstances by "id" on jobInstances == instanceId on jobExecutions
    public List<String> getJobInstancePaths(List<String> jobExecutionResourcePaths)

}