/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.paging.models.CustomParameterGroup;
import fixtures.paging.models.PagingGetMultiplePagesOptions;
import fixtures.paging.models.PagingGetMultiplePagesWithOffsetNextOptions;
import fixtures.paging.models.PagingGetMultiplePagesWithOffsetOptions;
import fixtures.paging.models.PagingGetOdataMultiplePagesOptions;
import fixtures.paging.models.Product;
import java.io.IOException;
import java.util.List;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Pagings.
 */
public interface Pagings {
    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getSinglePages();

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getSinglePagesAsync();


    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePages();

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getMultiplePagesAsync();
    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePages(final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getMultiplePagesAsync(final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions);


    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getOdataMultiplePages();

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getOdataMultiplePagesAsync();
    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetOdataMultiplePagesOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getOdataMultiplePages(final String clientRequestId, final PagingGetOdataMultiplePagesOptions pagingGetOdataMultiplePagesOptions);

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetOdataMultiplePagesOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getOdataMultiplePagesAsync(final String clientRequestId, final PagingGetOdataMultiplePagesOptions pagingGetOdataMultiplePagesOptions);


    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param pagingGetMultiplePagesWithOffsetOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesWithOffset(final PagingGetMultiplePagesWithOffsetOptions pagingGetMultiplePagesWithOffsetOptions);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param pagingGetMultiplePagesWithOffsetOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getMultiplePagesWithOffsetAsync(final PagingGetMultiplePagesWithOffsetOptions pagingGetMultiplePagesWithOffsetOptions);
    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param pagingGetMultiplePagesWithOffsetOptions Additional parameters for the operation
     * @param clientRequestId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesWithOffset(final PagingGetMultiplePagesWithOffsetOptions pagingGetMultiplePagesWithOffsetOptions, final String clientRequestId);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param pagingGetMultiplePagesWithOffsetOptions Additional parameters for the operation
     * @param clientRequestId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getMultiplePagesWithOffsetAsync(final PagingGetMultiplePagesWithOffsetOptions pagingGetMultiplePagesWithOffsetOptions, final String clientRequestId);


    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesRetryFirst();

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getMultiplePagesRetryFirstAsync();


    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesRetrySecond();

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getMultiplePagesRetrySecondAsync();


    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getSinglePagesFailure();

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getSinglePagesFailureAsync();


    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesFailure();

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getMultiplePagesFailureAsync();


    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesFailureUri();

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getMultiplePagesFailureUriAsync();


    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * @param tenant Sets the tenant to use.
     * @param apiVersion Sets the api version to use.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesFragmentNextLink(final String tenant, final String apiVersion);

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * @param tenant Sets the tenant to use.
     * @param apiVersion Sets the api version to use.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getMultiplePagesFragmentNextLinkAsync(final String tenant, final String apiVersion);


    /**
     * A paging operation that doesn't return a full URL, just a fragment with parameters grouped.
     *
     * @param customParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesFragmentWithGroupingNextLink(final CustomParameterGroup customParameterGroup);

    /**
     * A paging operation that doesn't return a full URL, just a fragment with parameters grouped.
     *
     * @param customParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Observable<Page<Product>> getMultiplePagesFragmentWithGroupingNextLinkAsync(final CustomParameterGroup customParameterGroup);


    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * @param tenant Sets the tenant to use.
     * @param nextLink Next link for list operation.
     * @param apiVersion Sets the api version to use.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> nextFragment(final String tenant, final String nextLink, final String apiVersion);

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * @param tenant Sets the tenant to use.
     * @param nextLink Next link for list operation.
     * @param apiVersion Sets the api version to use.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> nextFragmentAsync(final String tenant, final String nextLink, final String apiVersion);


    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * @param nextLink Next link for list operation.
     * @param customParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> nextFragmentWithGrouping(final String nextLink, final CustomParameterGroup customParameterGroup);

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * @param nextLink Next link for list operation.
     * @param customParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> nextFragmentWithGroupingAsync(final String nextLink, final CustomParameterGroup customParameterGroup);


    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getSinglePagesNext(final String nextPageLink);

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getSinglePagesNextAsync(final String nextPageLink);


    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesNext(final String nextPageLink);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getMultiplePagesNextAsync(final String nextPageLink);
    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesNext(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getMultiplePagesNextAsync(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions);


    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getOdataMultiplePagesNext(final String nextPageLink);

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getOdataMultiplePagesNextAsync(final String nextPageLink);
    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetOdataMultiplePagesOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getOdataMultiplePagesNext(final String nextPageLink, final String clientRequestId, final PagingGetOdataMultiplePagesOptions pagingGetOdataMultiplePagesOptions);

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetOdataMultiplePagesOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getOdataMultiplePagesNextAsync(final String nextPageLink, final String clientRequestId, final PagingGetOdataMultiplePagesOptions pagingGetOdataMultiplePagesOptions);


    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesWithOffsetNext(final String nextPageLink);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getMultiplePagesWithOffsetNextAsync(final String nextPageLink);
    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesWithOffsetNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesWithOffsetNext(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesWithOffsetNextOptions pagingGetMultiplePagesWithOffsetNextOptions);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesWithOffsetNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getMultiplePagesWithOffsetNextAsync(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesWithOffsetNextOptions pagingGetMultiplePagesWithOffsetNextOptions);


    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesRetryFirstNext(final String nextPageLink);

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getMultiplePagesRetryFirstNextAsync(final String nextPageLink);


    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesRetrySecondNext(final String nextPageLink);

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getMultiplePagesRetrySecondNextAsync(final String nextPageLink);


    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getSinglePagesFailureNext(final String nextPageLink);

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getSinglePagesFailureNextAsync(final String nextPageLink);


    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesFailureNext(final String nextPageLink);

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getMultiplePagesFailureNextAsync(final String nextPageLink);


    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Product&gt; object if successful.
     */
    PagedList<Product> getMultiplePagesFailureUriNext(final String nextPageLink);

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Product&gt; object
     */
    Single<Page<Product>> getMultiplePagesFailureUriNextAsync(final String nextPageLink);


}
