/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.*;
import org.openapitools.client.Pair;

import org.openapitools.client.model.Pet;
import org.openapitools.client.model.TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryApi {
  private ApiClient apiClient;

  public QueryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QueryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param integerQuery  (optional)
   * @param booleanQuery  (optional)
   * @param stringQuery  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryIntegerBooleanString(Integer integerQuery, Boolean booleanQuery, String stringQuery) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/query/integer/boolean/string";

    StringJoiner localVarQueryDeepObjectStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("integer_query", integerQuery));
    localVarQueryParams.addAll(apiClient.parameterToPair("boolean_query", booleanQuery));
    localVarQueryParams.addAll(apiClient.parameterToPair("string_query", stringQuery));
    
    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryDeepObjectStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryStyleDeepObjectExplodeTrueObject(Pet queryObject) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/query/style_deepObject/explode_true/object";

    StringJoiner localVarQueryDeepObjectStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParameterBaseName = "query_object";
    localVarQueryDeepObjectStringJoiner.add(queryObject.toUrlQueryString("query_object"));
    
    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryDeepObjectStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryStyleFormExplodeTrueArrayString(TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter queryObject) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/query/style_form/explode_true/array_string";

    StringJoiner localVarQueryDeepObjectStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "values", queryObject.getValues()));
    
    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryDeepObjectStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * Test query parameter(s)
   * Test query parameter(s)
   * @param queryObject  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testQueryStyleFormExplodeTrueObject(Pet queryObject) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/query/style_form/explode_true/object";

    StringJoiner localVarQueryDeepObjectStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("id", queryObject.getId()));
    localVarQueryParams.addAll(apiClient.parameterToPair("name", queryObject.getName()));
    localVarQueryParams.addAll(apiClient.parameterToPair("category", queryObject.getCategory()));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "photoUrls", queryObject.getPhotoUrls()));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", queryObject.getTags()));
    localVarQueryParams.addAll(apiClient.parameterToPair("status", queryObject.getStatus()));
    
    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryDeepObjectStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
