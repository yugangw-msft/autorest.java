/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.xml;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.xml.models.AppleBarrel;
import fixtures.xml.models.Banana;
import fixtures.xml.models.ErrorException;
import fixtures.xml.models.Slideshow;
import fixtures.xml.models.XmlGetHeadersHeaders;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in
 * Xmls.
 */
public interface Xmls {
    /**
     * Get a simple XML document.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Slideshow object if successful.
     */
    Slideshow getSimple();

    /**
     * Get a simple XML document.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Slideshow> getSimpleAsync(ServiceCallback<Slideshow> serviceCallback);

    /**
     * Get a simple XML document.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Slideshow>> getSimpleWithRestResponseAsync();

    /**
     * Get a simple XML document.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Slideshow> getSimpleAsync();

    /**
     * Put a simple XML document.
     *
     * @param wrappedLists the Slideshow value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putSimple(@NonNull Slideshow wrappedLists);

    /**
     * Put a simple XML document.
     *
     * @param wrappedLists the Slideshow value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putSimpleAsync(@NonNull Slideshow wrappedLists, ServiceCallback<Void> serviceCallback);

    /**
     * Put a simple XML document.
     *
     * @param wrappedLists the Slideshow value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putSimpleWithRestResponseAsync(@NonNull Slideshow wrappedLists);

    /**
     * Put a simple XML document.
     *
     * @param wrappedLists the Slideshow value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putSimpleAsync(@NonNull Slideshow wrappedLists);

    /**
     * Get an XML document with multiple wrapped lists.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppleBarrel object if successful.
     */
    AppleBarrel getWrappedLists();

    /**
     * Get an XML document with multiple wrapped lists.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<AppleBarrel> getWrappedListsAsync(ServiceCallback<AppleBarrel> serviceCallback);

    /**
     * Get an XML document with multiple wrapped lists.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, AppleBarrel>> getWrappedListsWithRestResponseAsync();

    /**
     * Get an XML document with multiple wrapped lists.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<AppleBarrel> getWrappedListsAsync();

    /**
     * Put an XML document with multiple wrapped lists.
     *
     * @param wrappedLists the AppleBarrel value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putWrappedLists(@NonNull AppleBarrel wrappedLists);

    /**
     * Put an XML document with multiple wrapped lists.
     *
     * @param wrappedLists the AppleBarrel value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putWrappedListsAsync(@NonNull AppleBarrel wrappedLists, ServiceCallback<Void> serviceCallback);

    /**
     * Put an XML document with multiple wrapped lists.
     *
     * @param wrappedLists the AppleBarrel value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putWrappedListsWithRestResponseAsync(@NonNull AppleBarrel wrappedLists);

    /**
     * Put an XML document with multiple wrapped lists.
     *
     * @param wrappedLists the AppleBarrel value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putWrappedListsAsync(@NonNull AppleBarrel wrappedLists);

    /**
     * Get strongly-typed response headers.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getHeaders();

    /**
     * Get strongly-typed response headers.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> getHeadersAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get strongly-typed response headers.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<XmlGetHeadersHeaders, Void>> getHeadersWithRestResponseAsync();

    /**
     * Get strongly-typed response headers.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable getHeadersAsync();

    /**
     * Get an empty list.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Slideshow object if successful.
     */
    Slideshow getEmptyList();

    /**
     * Get an empty list.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Slideshow> getEmptyListAsync(ServiceCallback<Slideshow> serviceCallback);

    /**
     * Get an empty list.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Slideshow>> getEmptyListWithRestResponseAsync();

    /**
     * Get an empty list.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Slideshow> getEmptyListAsync();

    /**
     * Gets some empty wrapped lists.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppleBarrel object if successful.
     */
    AppleBarrel getEmptyWrappedLists();

    /**
     * Gets some empty wrapped lists.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<AppleBarrel> getEmptyWrappedListsAsync(ServiceCallback<AppleBarrel> serviceCallback);

    /**
     * Gets some empty wrapped lists.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, AppleBarrel>> getEmptyWrappedListsWithRestResponseAsync();

    /**
     * Gets some empty wrapped lists.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<AppleBarrel> getEmptyWrappedListsAsync();

    /**
     * Gets a list as the root element.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;Banana&gt; object if successful.
     */
    List<Banana> getRootList();

    /**
     * Gets a list as the root element.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<List<Banana>> getRootListAsync(ServiceCallback<List<Banana>> serviceCallback);

    /**
     * Gets a list as the root element.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, List<Banana>>> getRootListWithRestResponseAsync();

    /**
     * Gets a list as the root element.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<List<Banana>> getRootListAsync();

    /**
     * Puts a list as the root element.
     *
     * @param bananas the List&lt;Banana&gt; value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putRootList(@NonNull List<Banana> bananas);

    /**
     * Puts a list as the root element.
     *
     * @param bananas the List&lt;Banana&gt; value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putRootListAsync(@NonNull List<Banana> bananas, ServiceCallback<Void> serviceCallback);

    /**
     * Puts a list as the root element.
     *
     * @param bananas the List&lt;Banana&gt; value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putRootListWithRestResponseAsync(@NonNull List<Banana> bananas);

    /**
     * Puts a list as the root element.
     *
     * @param bananas the List&lt;Banana&gt; value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putRootListAsync(@NonNull List<Banana> bananas);

    /**
     * Gets an empty list as the root element.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;Banana&gt; object if successful.
     */
    List<Banana> getEmptyRootList();

    /**
     * Gets an empty list as the root element.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<List<Banana>> getEmptyRootListAsync(ServiceCallback<List<Banana>> serviceCallback);

    /**
     * Gets an empty list as the root element.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, List<Banana>>> getEmptyRootListWithRestResponseAsync();

    /**
     * Gets an empty list as the root element.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<List<Banana>> getEmptyRootListAsync();

    /**
     * Puts an empty list as the root element.
     *
     * @param bananas the List&lt;Banana&gt; value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putEmptyRootList(@NonNull List<Banana> bananas);

    /**
     * Puts an empty list as the root element.
     *
     * @param bananas the List&lt;Banana&gt; value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putEmptyRootListAsync(@NonNull List<Banana> bananas, ServiceCallback<Void> serviceCallback);

    /**
     * Puts an empty list as the root element.
     *
     * @param bananas the List&lt;Banana&gt; value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putEmptyRootListWithRestResponseAsync(@NonNull List<Banana> bananas);

    /**
     * Puts an empty list as the root element.
     *
     * @param bananas the List&lt;Banana&gt; value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putEmptyRootListAsync(@NonNull List<Banana> bananas);

    /**
     * Gets an XML document with an empty child element.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Banana object if successful.
     */
    Banana getEmptyChildElement();

    /**
     * Gets an XML document with an empty child element.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Banana> getEmptyChildElementAsync(ServiceCallback<Banana> serviceCallback);

    /**
     * Gets an XML document with an empty child element.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Banana>> getEmptyChildElementWithRestResponseAsync();

    /**
     * Gets an XML document with an empty child element.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Banana> getEmptyChildElementAsync();

    /**
     * Puts a value with an empty child element.
     *
     * @param banana the Banana value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putEmptyChildElement(@NonNull Banana banana);

    /**
     * Puts a value with an empty child element.
     *
     * @param banana the Banana value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putEmptyChildElementAsync(@NonNull Banana banana, ServiceCallback<Void> serviceCallback);

    /**
     * Puts a value with an empty child element.
     *
     * @param banana the Banana value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putEmptyChildElementWithRestResponseAsync(@NonNull Banana banana);

    /**
     * Puts a value with an empty child element.
     *
     * @param banana the Banana value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putEmptyChildElementAsync(@NonNull Banana banana);
}