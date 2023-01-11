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



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PathApi {
  private ApiClient apiClient;

  public PathApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PathApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Test path parameter(s)
   * Test path parameter(s)
   * @param pathString  (required)
   * @param pathInteger  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testsPathStringPathStringIntegerPathInteger(String pathString, Integer pathInteger) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pathString' is set
    if (pathString == null) {
      throw new ApiException(400, "Missing the required parameter 'pathString' when calling testsPathStringPathStringIntegerPathInteger");
    }
    
    // verify the required parameter 'pathInteger' is set
    if (pathInteger == null) {
      throw new ApiException(400, "Missing the required parameter 'pathInteger' when calling testsPathStringPathStringIntegerPathInteger");
    }
    
    // create path and map variables
    String localVarPath = "/path/string/{path_string}/integer/{path_integer}"
      .replaceAll("\\{" + "path_string" + "\\}", apiClient.escapeString(pathString.toString()))
      .replaceAll("\\{" + "path_integer" + "\\}", apiClient.escapeString(pathInteger.toString()));

    StringJoiner localVarQueryDeepObjectStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    
    
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
