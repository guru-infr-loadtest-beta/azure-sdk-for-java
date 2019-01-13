// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of changes to be made to a job schedule.
 */
public class JobScheduleUpdateParameter {
    /**
     * The schedule according to which jobs will be created.
     * If you do not specify this element, it is equivalent to passing the
     * default schedule: that is, a single job scheduled to run immediately.
     */
    @JsonProperty(value = "schedule", required = true)
    private Schedule schedule;

    /**
     * Details of the jobs to be created on this schedule.
     * Updates affect only jobs that are started after the update has taken
     * place. Any currently active job continues with the older specification.
     */
    @JsonProperty(value = "jobSpecification", required = true)
    private JobSpecification jobSpecification;

    /**
     * A list of name-value pairs associated with the job schedule as metadata.
     * If you do not specify this element, it takes the default value of an
     * empty list; in effect, any existing metadata is deleted.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Get if you do not specify this element, it is equivalent to passing the default schedule: that is, a single job scheduled to run immediately.
     *
     * @return the schedule value
     */
    public Schedule schedule() {
        return this.schedule;
    }

    /**
     * Set if you do not specify this element, it is equivalent to passing the default schedule: that is, a single job scheduled to run immediately.
     *
     * @param schedule the schedule value to set
     * @return the JobScheduleUpdateParameter object itself.
     */
    public JobScheduleUpdateParameter withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get updates affect only jobs that are started after the update has taken place. Any currently active job continues with the older specification.
     *
     * @return the jobSpecification value
     */
    public JobSpecification jobSpecification() {
        return this.jobSpecification;
    }

    /**
     * Set updates affect only jobs that are started after the update has taken place. Any currently active job continues with the older specification.
     *
     * @param jobSpecification the jobSpecification value to set
     * @return the JobScheduleUpdateParameter object itself.
     */
    public JobScheduleUpdateParameter withJobSpecification(JobSpecification jobSpecification) {
        this.jobSpecification = jobSpecification;
        return this;
    }

    /**
     * Get if you do not specify this element, it takes the default value of an empty list; in effect, any existing metadata is deleted.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set if you do not specify this element, it takes the default value of an empty list; in effect, any existing metadata is deleted.
     *
     * @param metadata the metadata value to set
     * @return the JobScheduleUpdateParameter object itself.
     */
    public JobScheduleUpdateParameter withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

}
