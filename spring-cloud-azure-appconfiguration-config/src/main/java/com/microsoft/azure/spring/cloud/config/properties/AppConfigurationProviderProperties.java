/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.azure.spring.cloud.config.properties;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.lang.Nullable;
import org.springframework.validation.annotation.Validated;

@Configuration
@Validated
@PropertySource("classpath:appConfiguration.yaml")
@ConfigurationProperties(prefix = AppConfigurationProviderProperties.CONFIG_PREFIX)
public class AppConfigurationProviderProperties {
    public static final String CONFIG_PREFIX = "spring.cloud.appconfiguration";

    @NotEmpty
    @Value("${version:1.0}")
    private String version;

    @NotNull
    @Value("${maxRetries:2}")
    private int maxRetries;

    @NotNull
    @Value("${maxRetryTime:60}")
    private int maxRetryTime;

    @NotNull
    @Value("${prekillTime:5}")
    private int prekillTime;
    
    @Value("${tokenName:}")
    @Nullable
    private String tokenName;
    
    @Value("${tokenSecret:}")
    @Nullable
    private String tokenSecret;

    private static final Date startDate = new Date();

    /**
     * @return the apiVersion
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param apiVersion the apiVersion to set
     */
    public void setVersion(String apiVersion) {
        this.version = apiVersion;
    }

    /**
     * @return the maxRetries
     */
    public int getMaxRetries() {
        return maxRetries;
    }

    /**
     * @param maxRetries the maxRetries to set
     */
    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * @return the maxRetryTime
     */
    public int getMaxRetryTime() {
        return maxRetryTime;
    }

    /**
     * @param maxRetryTime the maxRetryTime to set
     */
    public void setMaxRetryTime(int maxRetryTime) {
        this.maxRetryTime = maxRetryTime;
    }

    /**
     * @return the prekillTime
     */
    public int getPrekillTime() {
        return prekillTime;
    }

    /**
     * @param prekillTime the prekillTime to set
     */
    public void setPrekillTime(int prekillTime) {
        this.prekillTime = prekillTime;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @return the tokenName
     */
    public String getTokenName() {
        return tokenName;
    }

    /**
     * @param tokenName the tokenName to set
     */
    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    /**
     * @return the tokenSecret
     */
    public String getTokenSecret() {
        return tokenSecret;
    }

    /**
     * @param tokenSecret the tokenSecret to set
     */
    public void setTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
    }

}
