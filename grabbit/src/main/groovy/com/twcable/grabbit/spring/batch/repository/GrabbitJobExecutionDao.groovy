package com.twcable.grabbit.spring.batch.repository

import org.springframework.batch.core.BatchStatus
import org.springframework.batch.core.repository.dao.JobExecutionDao

/**
 * Created by sagar.sane on 4/7/16.
 */
interface GrabbitJobExecutionDao extends JobExecutionDao{

    //Find jobExecutions that are older than "hours" from now
    public List<String> getOlderJobExecutions(int hours)

}