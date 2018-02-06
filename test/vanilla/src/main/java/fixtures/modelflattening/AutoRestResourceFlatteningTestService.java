/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.modelflattening;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.modelflattening.models.FlattenedProduct;
import fixtures.modelflattening.models.FlattenParameterGroup;
import fixtures.modelflattening.models.ProductWrapper;
import fixtures.modelflattening.models.Resource;
import fixtures.modelflattening.models.ResourceCollection;
import fixtures.modelflattening.models.SimpleProduct;
import fixtures.modelflattening.models.WrappedProduct;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;

/**
 * The interface for AutoRestResourceFlatteningTestService class.
 */
public interface AutoRestResourceFlatteningTestService {
    /**
     * Put External Resource as an Array.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putArray();

    /**
     * Put External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putArrayAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as an Array.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putArrayWithRestResponseAsync();

    /**
     * Put External Resource as an Array.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable putArrayAsync();

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putArray(List<Resource> resourceArray);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putArrayAsync(List<Resource> resourceArray, ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putArrayWithRestResponseAsync(List<Resource> resourceArray);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putArrayAsync(List<Resource> resourceArray);

    /**
     * Get External Resource as an Array.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;FlattenedProduct&gt; object if successful.
     */
    List<FlattenedProduct> getArray();

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;List&lt;FlattenedProduct&gt;&gt;} object.
     */
    ServiceFuture<List<FlattenedProduct>> getArrayAsync(ServiceCallback<List<FlattenedProduct>> serviceCallback);

    /**
     * Get External Resource as an Array.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, List&lt;FlattenedProduct&gt;&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, List<FlattenedProduct>>> getArrayWithRestResponseAsync();

    /**
     * Get External Resource as an Array.
     *
     * @return the {@link Maybe&lt;List&lt;FlattenedProduct&gt;&gt;} object if successful.
     */
    Maybe<List<FlattenedProduct>> getArrayAsync();

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putWrappedArray();

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putWrappedArrayAsync(ServiceCallback<Void> serviceCallback);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putWrappedArrayWithRestResponseAsync();

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable putWrappedArrayAsync();

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putWrappedArray(List<WrappedProduct> resourceArray);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putWrappedArrayAsync(List<WrappedProduct> resourceArray, ServiceCallback<Void> serviceCallback);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putWrappedArrayWithRestResponseAsync(List<WrappedProduct> resourceArray);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putWrappedArrayAsync(List<WrappedProduct> resourceArray);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;ProductWrapper&gt; object if successful.
     */
    List<ProductWrapper> getWrappedArray();

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;List&lt;ProductWrapper&gt;&gt;} object.
     */
    ServiceFuture<List<ProductWrapper>> getWrappedArrayAsync(ServiceCallback<List<ProductWrapper>> serviceCallback);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, List&lt;ProductWrapper&gt;&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, List<ProductWrapper>>> getWrappedArrayWithRestResponseAsync();

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @return the {@link Maybe&lt;List&lt;ProductWrapper&gt;&gt;} object if successful.
     */
    Maybe<List<ProductWrapper>> getWrappedArrayAsync();

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putDictionary();

    /**
     * Put External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putDictionaryAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a Dictionary.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putDictionaryWithRestResponseAsync();

    /**
     * Put External Resource as a Dictionary.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable putDictionaryAsync();

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putDictionary(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary, ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putDictionaryWithRestResponseAsync(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Map&lt;String, FlattenedProduct&gt; object if successful.
     */
    Map<String, FlattenedProduct> getDictionary();

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Map&lt;String, FlattenedProduct&gt;&gt;} object.
     */
    ServiceFuture<Map<String, FlattenedProduct>> getDictionaryAsync(ServiceCallback<Map<String, FlattenedProduct>> serviceCallback);

    /**
     * Get External Resource as a Dictionary.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Map&lt;String, FlattenedProduct&gt;&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Map<String, FlattenedProduct>>> getDictionaryWithRestResponseAsync();

    /**
     * Get External Resource as a Dictionary.
     *
     * @return the {@link Maybe&lt;Map&lt;String, FlattenedProduct&gt;&gt;} object if successful.
     */
    Maybe<Map<String, FlattenedProduct>> getDictionaryAsync();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putResourceCollection();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putResourceCollectionAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putResourceCollectionWithRestResponseAsync();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable putResourceCollectionAsync();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putResourceCollection(ResourceCollection resourceComplexObject);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putResourceCollectionAsync(ResourceCollection resourceComplexObject, ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putResourceCollectionWithRestResponseAsync(ResourceCollection resourceComplexObject);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putResourceCollectionAsync(ResourceCollection resourceComplexObject);

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ResourceCollection object if successful.
     */
    ResourceCollection getResourceCollection();

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;ResourceCollection&gt;} object.
     */
    ServiceFuture<ResourceCollection> getResourceCollectionAsync(ServiceCallback<ResourceCollection> serviceCallback);

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, ResourceCollection&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, ResourceCollection>> getResourceCollectionWithRestResponseAsync();

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return the {@link Maybe&lt;ResourceCollection&gt;} object if successful.
     */
    Maybe<ResourceCollection> getResourceCollectionAsync();

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct putSimpleProduct();

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;SimpleProduct&gt;} object.
     */
    ServiceFuture<SimpleProduct> putSimpleProductAsync(ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, SimpleProduct&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, SimpleProduct>> putSimpleProductWithRestResponseAsync();

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @return the {@link Maybe&lt;SimpleProduct&gt;} object if successful.
     */
    Maybe<SimpleProduct> putSimpleProductAsync();

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct putSimpleProduct(SimpleProduct simpleBodyProduct);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;SimpleProduct&gt;} object.
     */
    ServiceFuture<SimpleProduct> putSimpleProductAsync(SimpleProduct simpleBodyProduct, ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, SimpleProduct&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, SimpleProduct>> putSimpleProductWithRestResponseAsync(SimpleProduct simpleBodyProduct);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;SimpleProduct&gt;} object if successful.
     */
    Maybe<SimpleProduct> putSimpleProductAsync(SimpleProduct simpleBodyProduct);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct postFlattenedSimpleProduct(String productId, String maxProductDisplayName);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;SimpleProduct&gt;} object.
     */
    ServiceFuture<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, SimpleProduct&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, SimpleProduct>> postFlattenedSimpleProductWithRestResponseAsync(String productId, String maxProductDisplayName);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;SimpleProduct&gt;} object if successful.
     */
    Maybe<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct postFlattenedSimpleProduct(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;SimpleProduct&gt;} object.
     */
    ServiceFuture<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue, ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, SimpleProduct&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, SimpleProduct>> postFlattenedSimpleProductWithRestResponseAsync(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;SimpleProduct&gt;} object if successful.
     */
    Maybe<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct putSimpleProductWithGrouping(FlattenParameterGroup flattenParameterGroup);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;SimpleProduct&gt;} object.
     */
    ServiceFuture<SimpleProduct> putSimpleProductWithGroupingAsync(FlattenParameterGroup flattenParameterGroup, ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, SimpleProduct&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, SimpleProduct>> putSimpleProductWithGroupingWithRestResponseAsync(FlattenParameterGroup flattenParameterGroup);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;SimpleProduct&gt;} object if successful.
     */
    Maybe<SimpleProduct> putSimpleProductWithGroupingAsync(FlattenParameterGroup flattenParameterGroup);
}
