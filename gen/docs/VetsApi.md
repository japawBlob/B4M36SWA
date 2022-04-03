# VetsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllVets**](VetsApi.md#getAllVets) | **GET** /vets | List all vets


<a name="getAllVets"></a>
# **getAllVets**
> List&lt;Vet&gt; getAllVets()

List all vets

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VetsApi apiInstance = new VetsApi(defaultClient);
    try {
      List<Vet> result = apiInstance.getAllVets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VetsApi#getAllVets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Vet&gt;**](Vet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of vets |  -  |
**0** | unexpected error |  -  |

