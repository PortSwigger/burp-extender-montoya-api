/*
 * Copyright (c) 2022. PortSwigger Ltd. All rights reserved.
 *
 * This code may be used to extend the functionality of Burp Suite Community Edition
 * and Burp Suite Professional, provided that this usage does not violate the
 * license terms for those products.
 */

package burp.api.montoya.http.message.responses.analysis;

import burp.api.montoya.http.message.responses.HttpResponse;

import java.util.Set;

/**
 * This interface is used to analyze HTTP responses and retrieve keywords.
 */
public interface ResponseKeywordsAnalyzer
{
    /**
     * @return A set of keywords whose counts vary between the analyzed responses.
     */
    Set<String> variantKeywords();

    /**
     * @return A set of keywords whose counts do not vary between the analyzed responses.
     */
    Set<String> invariantKeywords();

    /**
     * This method is used to update the analysis based on an additional response.
     *
     * @param response The new response to include in the analysis.
     */
    void updateWith(HttpResponse response);
}
