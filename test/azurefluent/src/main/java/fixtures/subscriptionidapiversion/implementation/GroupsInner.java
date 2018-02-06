/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.subscriptionidapiversion.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.subscriptionidapiversion.ErrorException;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/**
 * An instance of this class provides access to all the operations defined in
 * Groups.
 */
public class GroupsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private GroupsService service;

    /**
     * The service client containing this operation class.
     */
    private MicrosoftAzureTestUrlImpl client;

    /**
     * Initializes an instance of GroupsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public GroupsInner(MicrosoftAzureTestUrlImpl client) {
        this.service = AzureProxy.create(GroupsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Groups to be used by the
     * proxy service to perform REST calls.
     */
    @Host("https://management.azure.com/")
    interface GroupsService {
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, SampleResourceGroupInner>> getSampleResourceGroup(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SampleResourceGroupInner object if successful.
     */
    public SampleResourceGroupInner getSampleResourceGroup(String resourceGroupName) {
        return getSampleResourceGroupAsync(resourceGroupName).blockingGet();
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;SampleResourceGroupInner&gt;} object.
     */
    public ServiceFuture<SampleResourceGroupInner> getSampleResourceGroupAsync(String resourceGroupName, ServiceCallback<SampleResourceGroupInner> serviceCallback) {
        return ServiceFuture.fromBody(getSampleResourceGroupAsync(resourceGroupName), serviceCallback);
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, SampleResourceGroupInner&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, SampleResourceGroupInner>> getSampleResourceGroupWithRestResponseAsync(String resourceGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getSampleResourceGroup(this.client.subscriptionId(), resourceGroupName, this.client.apiVersion(), this.client.acceptLanguage());
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;SampleResourceGroupInner&gt;} object if successful.
     */
    public Maybe<SampleResourceGroupInner> getSampleResourceGroupAsync(String resourceGroupName) {
        return getSampleResourceGroupWithRestResponseAsync(resourceGroupName)
            .flatMapMaybe(new Function<RestResponse<Void, SampleResourceGroupInner>, Maybe<SampleResourceGroupInner>>() {
                public Maybe<SampleResourceGroupInner> apply(RestResponse<Void, SampleResourceGroupInner> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }
}
