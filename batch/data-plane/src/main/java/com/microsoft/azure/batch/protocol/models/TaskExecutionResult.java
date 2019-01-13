// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TaskExecutionResult.
 */
public enum TaskExecutionResult {
    /** The task ran successfully. */
    SUCCESS("success"),

    /** There was an error during processing of the task. The failure may have occurred before the task process was launched, while the task process was executing, or after the task process exited. */
    FAILURE("failure");

    /** The actual serialized value for a TaskExecutionResult instance. */
    private String value;

    TaskExecutionResult(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TaskExecutionResult instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TaskExecutionResult object, or null if unable to parse.
     */
    @JsonCreator
    public static TaskExecutionResult fromString(String value) {
        TaskExecutionResult[] items = TaskExecutionResult.values();
        for (TaskExecutionResult item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
