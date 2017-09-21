/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.azurespecials.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;
import com.microsoft.azure.v2.AzureProxy;

/**
 * An instance of this class provides access to all the operations defined
 * in SubscriptionInCredentials.
 */
public class SubscriptionInCredentialsInner {
    /** The RestProxy service to perform REST calls. */
    private SubscriptionInCredentialsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of SubscriptionInCredentialsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionInCredentialsInner(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(SubscriptionInCredentialsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionInCredentials to be
     * used by Retrofit to perform actually REST calls.
     */
    @Host("http://localhost")
    interface SubscriptionInCredentialsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.SubscriptionInCredentials postMethodGlobalValid" })
        @POST("azurespecials/subscriptionId/method/string/none/path/global/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        Single<Void> postMethodGlobalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.SubscriptionInCredentials postMethodGlobalNull" })
        @POST("azurespecials/subscriptionId/method/string/none/path/global/null/{subscriptionId}")
        @ExpectedResponses({200})
        Single<Void> postMethodGlobalNull(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.SubscriptionInCredentials postMethodGlobalNotProvidedValid" })
        @POST("azurespecials/subscriptionId/method/string/none/path/globalNotProvided/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        Single<Void> postMethodGlobalNotProvidedValid(@PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.SubscriptionInCredentials postPathGlobalValid" })
        @POST("azurespecials/subscriptionId/path/string/none/path/global/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        Single<Void> postPathGlobalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.SubscriptionInCredentials postSwaggerGlobalValid" })
        @POST("azurespecials/subscriptionId/swagger/string/none/path/global/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        Single<Void> postSwaggerGlobalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postMethodGlobalValid() {
        postMethodGlobalValidAsync().toBlocking().value();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postMethodGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMethodGlobalValidAsync(), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> postMethodGlobalValidAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.postMethodGlobalValid(this.client.subscriptionId(), this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to null, and client-side validation should prevent you from making this call.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postMethodGlobalNull() {
        postMethodGlobalNullAsync().toBlocking().value();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to null, and client-side validation should prevent you from making this call.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postMethodGlobalNullAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMethodGlobalNullAsync(), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to null, and client-side validation should prevent you from making this call.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> postMethodGlobalNullAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.postMethodGlobalNull(this.client.subscriptionId(), this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postMethodGlobalNotProvidedValid() {
        postMethodGlobalNotProvidedValidAsync().toBlocking().value();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postMethodGlobalNotProvidedValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMethodGlobalNotProvidedValidAsync(), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> postMethodGlobalNotProvidedValidAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.postMethodGlobalNotProvidedValid(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postPathGlobalValid() {
        postPathGlobalValidAsync().toBlocking().value();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postPathGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postPathGlobalValidAsync(), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> postPathGlobalValidAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.postPathGlobalValid(this.client.subscriptionId(), this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postSwaggerGlobalValid() {
        postSwaggerGlobalValidAsync().toBlocking().value();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postSwaggerGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postSwaggerGlobalValidAsync(), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> postSwaggerGlobalValidAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.postSwaggerGlobalValid(this.client.subscriptionId(), this.client.acceptLanguage(), this.client.userAgent());
    }


}
