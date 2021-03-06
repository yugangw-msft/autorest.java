/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.fluent.gencode.list_operation_variants;

import rx.Observable;
import com.fluent.gencode.list_operation_variants.implementation.PuppiesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Puppies.
 */
public interface Puppies extends HasInner<PuppiesInner> {
    /**
     * Lists all the puppies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dogName The name of the managed puppy that is being created. The name can't be changed after the puppy is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Puppy> list1Async(final String resourceGroupName, final String dogName);

    /**
     * Lists all the puppies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dogName The name of the managed puppy that is being created. The name can't be changed after the puppy is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Puppy> list2Async(String resourceGroupName, String dogName);

    /**
     * Lists all the puppies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dogName The name of the managed puppy that is being created. The name can't be changed after the puppy is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PuppyList> list3Async(String resourceGroupName, String dogName);

    /**
     * Lists all the puppies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dogName The name of the managed puppy that is being created. The name can't be changed after the puppy is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Puppy> list4Async(String resourceGroupName, String dogName);

    /**
     * Lists all the puppies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dogName The name of the managed puppy that is being created. The name can't be changed after the puppy is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Puppy> listByResourceGroupAsync(String resourceGroupName, String dogName);

}
