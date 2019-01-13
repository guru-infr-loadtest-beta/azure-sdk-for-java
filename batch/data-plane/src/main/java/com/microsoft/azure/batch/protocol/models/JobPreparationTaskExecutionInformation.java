// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about the execution of a Job Preparation task on a
 * compute node.
 */
public class JobPreparationTaskExecutionInformation {
    /**
     * The time at which the task started running.
     * If the task has been restarted or retried, this is the most recent time
     * at which the task started running.
     */
    @JsonProperty(value = "startTime", required = true)
    private DateTime startTime;

    /**
     * The time at which the Job Preparation task completed.
     * This property is set only if the task is in the Completed state.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The current state of the Job Preparation task on the compute node.
     * Possible values include: 'running', 'completed'.
     */
    @JsonProperty(value = "state", required = true)
    private JobPreparationTaskState state;

    /**
     * The root directory of the Job Preparation task on the compute node. You
     * can use this path to retrieve files created by the task, such as log
     * files.
     */
    @JsonProperty(value = "taskRootDirectory")
    private String taskRootDirectory;

    /**
     * The URL to the root directory of the Job Preparation task on the compute
     * node.
     */
    @JsonProperty(value = "taskRootDirectoryUrl")
    private String taskRootDirectoryUrl;

    /**
     * The exit code of the program specified on the task command line.
     * This parameter is returned only if the task is in the completed state.
     * The exit code for a process reflects the specific convention implemented
     * by the application developer for that process. If you use the exit code
     * value to make decisions in your code, be sure that you know the exit
     * code convention used by the application process. Note that the exit code
     * may also be generated by the compute node operating system, such as when
     * a process is forcibly terminated.
     */
    @JsonProperty(value = "exitCode")
    private Integer exitCode;

    /**
     * Information about the container under which the task is executing.
     * This property is set only if the task runs in a container context.
     */
    @JsonProperty(value = "containerInfo")
    private TaskContainerExecutionInformation containerInfo;

    /**
     * Information describing the task failure, if any.
     * This property is set only if the task is in the completed state and
     * encountered a failure.
     */
    @JsonProperty(value = "failureInfo")
    private TaskFailureInformation failureInfo;

    /**
     * The number of times the task has been retried by the Batch service. Task
     * application failures (non-zero exit code) are retried, pre-processing
     * errors (the task could not be run) and file upload errors are not
     * retried. The Batch service will retry the task up to the limit specified
     * by the constraints.
     * Task application failures (non-zero exit code) are retried,
     * pre-processing errors (the task could not be run) and file upload errors
     * are not retried. The Batch service will retry the task up to the limit
     * specified by the constraints.
     */
    @JsonProperty(value = "retryCount", required = true)
    private int retryCount;

    /**
     * The most recent time at which a retry of the Job Preparation task
     * started running.
     * This property is set only if the task was retried (i.e. retryCount is
     * nonzero). If present, this is typically the same as startTime, but may
     * be different if the task has been restarted for reasons other than
     * retry; for example, if the compute node was rebooted during a retry,
     * then the startTime is updated but the lastRetryTime is not.
     */
    @JsonProperty(value = "lastRetryTime")
    private DateTime lastRetryTime;

    /**
     * The result of the task execution.
     * If the value is 'failed', then the details of the failure can be found
     * in the failureInfo property. Possible values include: 'success',
     * 'failure'.
     */
    @JsonProperty(value = "result")
    private TaskExecutionResult result;

    /**
     * Get if the task has been restarted or retried, this is the most recent time at which the task started running.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set if the task has been restarted or retried, this is the most recent time at which the task started running.
     *
     * @param startTime the startTime value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get this property is set only if the task is in the Completed state.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set this property is set only if the task is in the Completed state.
     *
     * @param endTime the endTime value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get possible values include: 'running', 'completed'.
     *
     * @return the state value
     */
    public JobPreparationTaskState state() {
        return this.state;
    }

    /**
     * Set possible values include: 'running', 'completed'.
     *
     * @param state the state value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withState(JobPreparationTaskState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the taskRootDirectory value.
     *
     * @return the taskRootDirectory value
     */
    public String taskRootDirectory() {
        return this.taskRootDirectory;
    }

    /**
     * Set the taskRootDirectory value.
     *
     * @param taskRootDirectory the taskRootDirectory value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withTaskRootDirectory(String taskRootDirectory) {
        this.taskRootDirectory = taskRootDirectory;
        return this;
    }

    /**
     * Get the taskRootDirectoryUrl value.
     *
     * @return the taskRootDirectoryUrl value
     */
    public String taskRootDirectoryUrl() {
        return this.taskRootDirectoryUrl;
    }

    /**
     * Set the taskRootDirectoryUrl value.
     *
     * @param taskRootDirectoryUrl the taskRootDirectoryUrl value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withTaskRootDirectoryUrl(String taskRootDirectoryUrl) {
        this.taskRootDirectoryUrl = taskRootDirectoryUrl;
        return this;
    }

    /**
     * Get this parameter is returned only if the task is in the completed state. The exit code for a process reflects the specific convention implemented by the application developer for that process. If you use the exit code value to make decisions in your code, be sure that you know the exit code convention used by the application process. Note that the exit code may also be generated by the compute node operating system, such as when a process is forcibly terminated.
     *
     * @return the exitCode value
     */
    public Integer exitCode() {
        return this.exitCode;
    }

    /**
     * Set this parameter is returned only if the task is in the completed state. The exit code for a process reflects the specific convention implemented by the application developer for that process. If you use the exit code value to make decisions in your code, be sure that you know the exit code convention used by the application process. Note that the exit code may also be generated by the compute node operating system, such as when a process is forcibly terminated.
     *
     * @param exitCode the exitCode value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get this property is set only if the task runs in a container context.
     *
     * @return the containerInfo value
     */
    public TaskContainerExecutionInformation containerInfo() {
        return this.containerInfo;
    }

    /**
     * Set this property is set only if the task runs in a container context.
     *
     * @param containerInfo the containerInfo value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withContainerInfo(TaskContainerExecutionInformation containerInfo) {
        this.containerInfo = containerInfo;
        return this;
    }

    /**
     * Get this property is set only if the task is in the completed state and encountered a failure.
     *
     * @return the failureInfo value
     */
    public TaskFailureInformation failureInfo() {
        return this.failureInfo;
    }

    /**
     * Set this property is set only if the task is in the completed state and encountered a failure.
     *
     * @param failureInfo the failureInfo value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withFailureInfo(TaskFailureInformation failureInfo) {
        this.failureInfo = failureInfo;
        return this;
    }

    /**
     * Get task application failures (non-zero exit code) are retried, pre-processing errors (the task could not be run) and file upload errors are not retried. The Batch service will retry the task up to the limit specified by the constraints.
     *
     * @return the retryCount value
     */
    public int retryCount() {
        return this.retryCount;
    }

    /**
     * Set task application failures (non-zero exit code) are retried, pre-processing errors (the task could not be run) and file upload errors are not retried. The Batch service will retry the task up to the limit specified by the constraints.
     *
     * @param retryCount the retryCount value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withRetryCount(int retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * Get this property is set only if the task was retried (i.e. retryCount is nonzero). If present, this is typically the same as startTime, but may be different if the task has been restarted for reasons other than retry; for example, if the compute node was rebooted during a retry, then the startTime is updated but the lastRetryTime is not.
     *
     * @return the lastRetryTime value
     */
    public DateTime lastRetryTime() {
        return this.lastRetryTime;
    }

    /**
     * Set this property is set only if the task was retried (i.e. retryCount is nonzero). If present, this is typically the same as startTime, but may be different if the task has been restarted for reasons other than retry; for example, if the compute node was rebooted during a retry, then the startTime is updated but the lastRetryTime is not.
     *
     * @param lastRetryTime the lastRetryTime value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withLastRetryTime(DateTime lastRetryTime) {
        this.lastRetryTime = lastRetryTime;
        return this;
    }

    /**
     * Get if the value is 'failed', then the details of the failure can be found in the failureInfo property. Possible values include: 'success', 'failure'.
     *
     * @return the result value
     */
    public TaskExecutionResult result() {
        return this.result;
    }

    /**
     * Set if the value is 'failed', then the details of the failure can be found in the failureInfo property. Possible values include: 'success', 'failure'.
     *
     * @param result the result value to set
     * @return the JobPreparationTaskExecutionInformation object itself.
     */
    public JobPreparationTaskExecutionInformation withResult(TaskExecutionResult result) {
        this.result = result;
        return this;
    }

}
