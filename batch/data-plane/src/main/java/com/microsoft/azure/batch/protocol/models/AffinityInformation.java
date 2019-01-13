// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A locality hint that can be used by the Batch service to select a compute
 * node on which to start a task.
 */
public class AffinityInformation {
    /**
     * An opaque string representing the location of a compute node or a task
     * that has run previously.
     * You can pass the affinityId of a compute node to indicate that this task
     * needs to run on that compute node. Note that this is just a soft
     * affinity. If the target node is busy or unavailable at the time the task
     * is scheduled, then the task will be scheduled elsewhere.
     */
    @JsonProperty(value = "affinityId", required = true)
    private String affinityId;

    /**
     * Get you can pass the affinityId of a compute node to indicate that this task needs to run on that compute node. Note that this is just a soft affinity. If the target node is busy or unavailable at the time the task is scheduled, then the task will be scheduled elsewhere.
     *
     * @return the affinityId value
     */
    public String affinityId() {
        return this.affinityId;
    }

    /**
     * Set you can pass the affinityId of a compute node to indicate that this task needs to run on that compute node. Note that this is just a soft affinity. If the target node is busy or unavailable at the time the task is scheduled, then the task will be scheduled elsewhere.
     *
     * @param affinityId the affinityId value to set
     * @return the AffinityInformation object itself.
     */
    public AffinityInformation withAffinityId(String affinityId) {
        this.affinityId = affinityId;
        return this;
    }

}
