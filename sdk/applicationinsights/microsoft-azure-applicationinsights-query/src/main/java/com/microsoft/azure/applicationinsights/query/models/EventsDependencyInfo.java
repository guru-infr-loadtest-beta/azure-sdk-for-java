/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The dependency info.
 */
public class EventsDependencyInfo {
    /**
     * The target of the dependency.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * The data of the dependency.
     */
    @JsonProperty(value = "data")
    private String data;

    /**
     * Indicates if the dependency was successful.
     */
    @JsonProperty(value = "success")
    private String success;

    /**
     * The duration of the dependency.
     */
    @JsonProperty(value = "duration")
    private Long duration;

    /**
     * The performance bucket of the dependency.
     */
    @JsonProperty(value = "performanceBucket")
    private String performanceBucket;

    /**
     * The result code of the dependency.
     */
    @JsonProperty(value = "resultCode")
    private String resultCode;

    /**
     * The type of the dependency.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The name of the dependency.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The ID of the dependency.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the target of the dependency.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target of the dependency.
     *
     * @param target the target value to set
     * @return the EventsDependencyInfo object itself.
     */
    public EventsDependencyInfo withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the data of the dependency.
     *
     * @return the data value
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data of the dependency.
     *
     * @param data the data value to set
     * @return the EventsDependencyInfo object itself.
     */
    public EventsDependencyInfo withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get indicates if the dependency was successful.
     *
     * @return the success value
     */
    public String success() {
        return this.success;
    }

    /**
     * Set indicates if the dependency was successful.
     *
     * @param success the success value to set
     * @return the EventsDependencyInfo object itself.
     */
    public EventsDependencyInfo withSuccess(String success) {
        this.success = success;
        return this;
    }

    /**
     * Get the duration of the dependency.
     *
     * @return the duration value
     */
    public Long duration() {
        return this.duration;
    }

    /**
     * Set the duration of the dependency.
     *
     * @param duration the duration value to set
     * @return the EventsDependencyInfo object itself.
     */
    public EventsDependencyInfo withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the performance bucket of the dependency.
     *
     * @return the performanceBucket value
     */
    public String performanceBucket() {
        return this.performanceBucket;
    }

    /**
     * Set the performance bucket of the dependency.
     *
     * @param performanceBucket the performanceBucket value to set
     * @return the EventsDependencyInfo object itself.
     */
    public EventsDependencyInfo withPerformanceBucket(String performanceBucket) {
        this.performanceBucket = performanceBucket;
        return this;
    }

    /**
     * Get the result code of the dependency.
     *
     * @return the resultCode value
     */
    public String resultCode() {
        return this.resultCode;
    }

    /**
     * Set the result code of the dependency.
     *
     * @param resultCode the resultCode value to set
     * @return the EventsDependencyInfo object itself.
     */
    public EventsDependencyInfo withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * Get the type of the dependency.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the dependency.
     *
     * @param type the type value to set
     * @return the EventsDependencyInfo object itself.
     */
    public EventsDependencyInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name of the dependency.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the dependency.
     *
     * @param name the name value to set
     * @return the EventsDependencyInfo object itself.
     */
    public EventsDependencyInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ID of the dependency.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the dependency.
     *
     * @param id the id value to set
     * @return the EventsDependencyInfo object itself.
     */
    public EventsDependencyInfo withId(String id) {
        this.id = id;
        return this;
    }

}