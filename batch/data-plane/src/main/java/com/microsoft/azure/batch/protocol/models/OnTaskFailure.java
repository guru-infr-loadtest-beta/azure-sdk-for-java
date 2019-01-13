// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OnTaskFailure.
 */
public enum OnTaskFailure {
    /** Do nothing. The job remains active unless terminated or disabled by some other means. */
    NO_ACTION("noaction"),

    /** Take the action associated with the task exit condition in the task's exitConditions collection. (This may still result in no action being taken, if that is what the task specifies.). */
    PERFORM_EXIT_OPTIONS_JOB_ACTION("performexitoptionsjobaction");

    /** The actual serialized value for a OnTaskFailure instance. */
    private String value;

    OnTaskFailure(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OnTaskFailure instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OnTaskFailure object, or null if unable to parse.
     */
    @JsonCreator
    public static OnTaskFailure fromString(String value) {
        OnTaskFailure[] items = OnTaskFailure.values();
        for (OnTaskFailure item : items) {
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
