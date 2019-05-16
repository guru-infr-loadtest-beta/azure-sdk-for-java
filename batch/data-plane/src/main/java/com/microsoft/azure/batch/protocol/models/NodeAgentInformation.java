// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the node agent.
 * The Batch node agent is a program that runs on each node in the pool and
 * provides Batch capability on the compute node.
 */
public class NodeAgentInformation {
    /**
     * The version of the Batch node agent running on the compute node.
     * This version number can be checked against the node agent release notes
     * located at
     * https://github.com/Azure/Batch/blob/master/changelogs/nodeagent/CHANGELOG.md.
     */
    @JsonProperty(value = "version", required = true)
    private String version;

    /**
     * The time when the node agent was updated on the compute node.
     * This is the most recent time that the node agent was updated to a new
     * version.
     */
    @JsonProperty(value = "lastUpdateTime", required = true)
    private DateTime lastUpdateTime;

    /**
     * Get this version number can be checked against the node agent release notes located at https://github.com/Azure/Batch/blob/master/changelogs/nodeagent/CHANGELOG.md.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set this version number can be checked against the node agent release notes located at https://github.com/Azure/Batch/blob/master/changelogs/nodeagent/CHANGELOG.md.
     *
     * @param version the version value to set
     * @return the NodeAgentInformation object itself.
     */
    public NodeAgentInformation withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get this is the most recent time that the node agent was updated to a new version.
     *
     * @return the lastUpdateTime value
     */
    public DateTime lastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Set this is the most recent time that the node agent was updated to a new version.
     *
     * @param lastUpdateTime the lastUpdateTime value to set
     * @return the NodeAgentInformation object itself.
     */
    public NodeAgentInformation withLastUpdateTime(DateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

}