/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodycomplex.models.Basic;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * Basics.
 */
public interface Basics {
    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Basic object if successful.
     */
    Basic getValid();

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Basic&gt;} object.
     */
    ServiceFuture<Basic> getValidAsync(ServiceCallback<Basic> serviceCallback);

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Basic&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Basic>> getValidWithRestResponseAsync();

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @return the {@link Maybe&lt;Basic&gt;} object if successful.
     */
    Maybe<Basic> getValidAsync();

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putValid(Basic complexBody);

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putValidAsync(Basic complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putValidWithRestResponseAsync(Basic complexBody);

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putValidAsync(Basic complexBody);

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Basic object if successful.
     */
    Basic getInvalid();

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Basic&gt;} object.
     */
    ServiceFuture<Basic> getInvalidAsync(ServiceCallback<Basic> serviceCallback);

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Basic&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Basic>> getInvalidWithRestResponseAsync();

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @return the {@link Maybe&lt;Basic&gt;} object if successful.
     */
    Maybe<Basic> getInvalidAsync();

    /**
     * Get a basic complex type that is empty.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Basic object if successful.
     */
    Basic getEmpty();

    /**
     * Get a basic complex type that is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Basic&gt;} object.
     */
    ServiceFuture<Basic> getEmptyAsync(ServiceCallback<Basic> serviceCallback);

    /**
     * Get a basic complex type that is empty.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Basic&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Basic>> getEmptyWithRestResponseAsync();

    /**
     * Get a basic complex type that is empty.
     *
     * @return the {@link Maybe&lt;Basic&gt;} object if successful.
     */
    Maybe<Basic> getEmptyAsync();

    /**
     * Get a basic complex type whose properties are null.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Basic object if successful.
     */
    Basic getNull();

    /**
     * Get a basic complex type whose properties are null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Basic&gt;} object.
     */
    ServiceFuture<Basic> getNullAsync(ServiceCallback<Basic> serviceCallback);

    /**
     * Get a basic complex type whose properties are null.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Basic&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Basic>> getNullWithRestResponseAsync();

    /**
     * Get a basic complex type whose properties are null.
     *
     * @return the {@link Maybe&lt;Basic&gt;} object if successful.
     */
    Maybe<Basic> getNullAsync();

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Basic object if successful.
     */
    Basic getNotProvided();

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Basic&gt;} object.
     */
    ServiceFuture<Basic> getNotProvidedAsync(ServiceCallback<Basic> serviceCallback);

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Basic&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Basic>> getNotProvidedWithRestResponseAsync();

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @return the {@link Maybe&lt;Basic&gt;} object if successful.
     */
    Maybe<Basic> getNotProvidedAsync();
}
