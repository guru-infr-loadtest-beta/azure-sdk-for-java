// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.BastionHostIpConfiguration;
import com.azure.resourcemanager.network.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The BastionHost model. */
@JsonFlatten
@Fluent
public class BastionHostInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BastionHostInner.class);

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * IP configuration of the Bastion Host resource.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<BastionHostIpConfiguration> ipConfigurations;

    /*
     * FQDN for the endpoint on which bastion host is accessible.
     */
    @JsonProperty(value = "properties.dnsName")
    private String dnsName;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the ipConfigurations property: IP configuration of the Bastion Host resource.
     *
     * @return the ipConfigurations value.
     */
    public List<BastionHostIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: IP configuration of the Bastion Host resource.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withIpConfigurations(List<BastionHostIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     *
     * @return the dnsName value.
     */
    public String dnsName() {
        return this.dnsName;
    }

    /**
     * Set the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     *
     * @param dnsName the dnsName value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
