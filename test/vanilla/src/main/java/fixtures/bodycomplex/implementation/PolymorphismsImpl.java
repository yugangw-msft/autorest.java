/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import retrofit2.Retrofit;
import fixtures.bodycomplex.Polymorphisms;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.Fish;
import fixtures.bodycomplex.models.Salmon;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Polymorphisms.
 */
public class PolymorphismsImpl implements Polymorphisms {
    /** The Retrofit service to perform REST calls. */
    private PolymorphismsService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Polymorphisms.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PolymorphismsImpl(Retrofit retrofit, AutoRestComplexTestServiceImpl client) {
        this.service = retrofit.create(PolymorphismsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Polymorphisms to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PolymorphismsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms getValid" })
        @GET("complex/polymorphism/valid")
        Observable<Response<ResponseBody>> getValid();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms putValid" })
        @PUT("complex/polymorphism/valid")
        Observable<Response<ResponseBody>> putValid(@Body Fish complexBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms getComplicated" })
        @GET("complex/polymorphism/complicated")
        Observable<Response<ResponseBody>> getComplicated();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms putComplicated" })
        @PUT("complex/polymorphism/complicated")
        Observable<Response<ResponseBody>> putComplicated(@Body Salmon complexBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms putMissingDiscriminator" })
        @PUT("complex/polymorphism/missingdiscriminator")
        Observable<Response<ResponseBody>> putMissingDiscriminator(@Body Salmon complexBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms putValidMissingRequired" })
        @PUT("complex/polymorphism/missingrequired/invalid")
        Observable<Response<ResponseBody>> putValidMissingRequired(@Body Fish complexBody);

    }

    /**
     * Get complex types that are polymorphic.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Fish object if successful.
     */
    public Fish getValid() {
        return getValidWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get complex types that are polymorphic.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Fish> getValidAsync(final ServiceCallback<Fish> serviceCallback) {
        return ServiceFuture.fromResponse(getValidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get complex types that are polymorphic.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Fish object
     */
    public Observable<Fish> getValidAsync() {
        return getValidWithServiceResponseAsync().map(new Func1<ServiceResponse<Fish>, Fish>() {
            @Override
            public Fish call(ServiceResponse<Fish> response) {
                return response.body();
            }
        });
    }

    /**
     * Get complex types that are polymorphic.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Fish object
     */
    public Observable<ServiceResponse<Fish>> getValidWithServiceResponseAsync() {
        return service.getValid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Fish>>>() {
                @Override
                public Observable<ServiceResponse<Fish>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Fish> clientResponse = getValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Fish> getValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Fish, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Fish>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this:
     {
             'fishtype':'Salmon',
             'location':'alaska',
             'iswild':true,
             'species':'king',
             'length':1.0,
             'siblings':[
               {
                 'fishtype':'Shark',
                 'age':6,
                 'birthday': '2012-01-05T01:00:00Z',
                 'length':20.0,
                 'species':'predator',
               },
               {
                 'fishtype':'Sawshark',
                 'age':105,
                 'birthday': '1900-01-05T01:00:00Z',
                 'length':10.0,
                 'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
                 'species':'dangerous',
               },
               {
                 'fishtype': 'goblin',
                 'age': 1,
                 'birthday': '2015-08-08T00:00:00Z',
                 'length': 30.0,
                 'species': 'scary',
                 'jawsize': 5
               }
             ]
           };
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putValid(Fish complexBody) {
        putValidWithServiceResponseAsync(complexBody).toBlocking().single().body();
    }

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this:
     {
             'fishtype':'Salmon',
             'location':'alaska',
             'iswild':true,
             'species':'king',
             'length':1.0,
             'siblings':[
               {
                 'fishtype':'Shark',
                 'age':6,
                 'birthday': '2012-01-05T01:00:00Z',
                 'length':20.0,
                 'species':'predator',
               },
               {
                 'fishtype':'Sawshark',
                 'age':105,
                 'birthday': '1900-01-05T01:00:00Z',
                 'length':10.0,
                 'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
                 'species':'dangerous',
               },
               {
                 'fishtype': 'goblin',
                 'age': 1,
                 'birthday': '2015-08-08T00:00:00Z',
                 'length': 30.0,
                 'species': 'scary',
                 'jawsize': 5
               }
             ]
           };
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putValidAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putValidWithServiceResponseAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this:
     {
             'fishtype':'Salmon',
             'location':'alaska',
             'iswild':true,
             'species':'king',
             'length':1.0,
             'siblings':[
               {
                 'fishtype':'Shark',
                 'age':6,
                 'birthday': '2012-01-05T01:00:00Z',
                 'length':20.0,
                 'species':'predator',
               },
               {
                 'fishtype':'Sawshark',
                 'age':105,
                 'birthday': '1900-01-05T01:00:00Z',
                 'length':10.0,
                 'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
                 'species':'dangerous',
               },
               {
                 'fishtype': 'goblin',
                 'age': 1,
                 'birthday': '2015-08-08T00:00:00Z',
                 'length': 30.0,
                 'species': 'scary',
                 'jawsize': 5
               }
             ]
           };
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putValidAsync(Fish complexBody) {
        return putValidWithServiceResponseAsync(complexBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this:
     {
             'fishtype':'Salmon',
             'location':'alaska',
             'iswild':true,
             'species':'king',
             'length':1.0,
             'siblings':[
               {
                 'fishtype':'Shark',
                 'age':6,
                 'birthday': '2012-01-05T01:00:00Z',
                 'length':20.0,
                 'species':'predator',
               },
               {
                 'fishtype':'Sawshark',
                 'age':105,
                 'birthday': '1900-01-05T01:00:00Z',
                 'length':10.0,
                 'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
                 'species':'dangerous',
               },
               {
                 'fishtype': 'goblin',
                 'age': 1,
                 'birthday': '2015-08-08T00:00:00Z',
                 'length': 30.0,
                 'species': 'scary',
                 'jawsize': 5
               }
             ]
           };
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putValidWithServiceResponseAsync(Fish complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Salmon object if successful.
     */
    public Salmon getComplicated() {
        return getComplicatedWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Salmon> getComplicatedAsync(final ServiceCallback<Salmon> serviceCallback) {
        return ServiceFuture.fromResponse(getComplicatedWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Salmon object
     */
    public Observable<Salmon> getComplicatedAsync() {
        return getComplicatedWithServiceResponseAsync().map(new Func1<ServiceResponse<Salmon>, Salmon>() {
            @Override
            public Salmon call(ServiceResponse<Salmon> response) {
                return response.body();
            }
        });
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Salmon object
     */
    public Observable<ServiceResponse<Salmon>> getComplicatedWithServiceResponseAsync() {
        return service.getComplicated()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Salmon>>>() {
                @Override
                public Observable<ServiceResponse<Salmon>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Salmon> clientResponse = getComplicatedDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Salmon> getComplicatedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Salmon, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Salmon>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param complexBody the Salmon value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putComplicated(Salmon complexBody) {
        putComplicatedWithServiceResponseAsync(complexBody).toBlocking().single().body();
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param complexBody the Salmon value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putComplicatedAsync(Salmon complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putComplicatedWithServiceResponseAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param complexBody the Salmon value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putComplicatedAsync(Salmon complexBody) {
        return putComplicatedWithServiceResponseAsync(complexBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param complexBody the Salmon value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putComplicatedWithServiceResponseAsync(Salmon complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putComplicated(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putComplicatedDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putComplicatedDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types that are polymorphic, omitting the discriminator.
     *
     * @param complexBody the Salmon value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Salmon object if successful.
     */
    public Salmon putMissingDiscriminator(Salmon complexBody) {
        return putMissingDiscriminatorWithServiceResponseAsync(complexBody).toBlocking().single().body();
    }

    /**
     * Put complex types that are polymorphic, omitting the discriminator.
     *
     * @param complexBody the Salmon value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Salmon> putMissingDiscriminatorAsync(Salmon complexBody, final ServiceCallback<Salmon> serviceCallback) {
        return ServiceFuture.fromResponse(putMissingDiscriminatorWithServiceResponseAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that are polymorphic, omitting the discriminator.
     *
     * @param complexBody the Salmon value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Salmon object
     */
    public Observable<Salmon> putMissingDiscriminatorAsync(Salmon complexBody) {
        return putMissingDiscriminatorWithServiceResponseAsync(complexBody).map(new Func1<ServiceResponse<Salmon>, Salmon>() {
            @Override
            public Salmon call(ServiceResponse<Salmon> response) {
                return response.body();
            }
        });
    }

    /**
     * Put complex types that are polymorphic, omitting the discriminator.
     *
     * @param complexBody the Salmon value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Salmon object
     */
    public Observable<ServiceResponse<Salmon>> putMissingDiscriminatorWithServiceResponseAsync(Salmon complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putMissingDiscriminator(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Salmon>>>() {
                @Override
                public Observable<ServiceResponse<Salmon>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Salmon> clientResponse = putMissingDiscriminatorDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Salmon> putMissingDiscriminatorDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Salmon, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Salmon>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
     {
         "fishtype": "sawshark",
         "species": "snaggle toothed",
         "length": 18.5,
         "age": 2,
         "birthday": "2013-06-01T01:00:00Z",
         "location": "alaska",
         "picture": base64(FF FF FF FF FE),
         "siblings": [
             {
                 "fishtype": "shark",
                 "species": "predator",
                 "birthday": "2012-01-05T01:00:00Z",
                 "length": 20,
                 "age": 6
             },
             {
                 "fishtype": "sawshark",
                 "species": "dangerous",
                 "picture": base64(FF FF FF FF FE),
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putValidMissingRequired(Fish complexBody) {
        putValidMissingRequiredWithServiceResponseAsync(complexBody).toBlocking().single().body();
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
     {
         "fishtype": "sawshark",
         "species": "snaggle toothed",
         "length": 18.5,
         "age": 2,
         "birthday": "2013-06-01T01:00:00Z",
         "location": "alaska",
         "picture": base64(FF FF FF FF FE),
         "siblings": [
             {
                 "fishtype": "shark",
                 "species": "predator",
                 "birthday": "2012-01-05T01:00:00Z",
                 "length": 20,
                 "age": 6
             },
             {
                 "fishtype": "sawshark",
                 "species": "dangerous",
                 "picture": base64(FF FF FF FF FE),
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putValidMissingRequiredAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putValidMissingRequiredWithServiceResponseAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
     {
         "fishtype": "sawshark",
         "species": "snaggle toothed",
         "length": 18.5,
         "age": 2,
         "birthday": "2013-06-01T01:00:00Z",
         "location": "alaska",
         "picture": base64(FF FF FF FF FE),
         "siblings": [
             {
                 "fishtype": "shark",
                 "species": "predator",
                 "birthday": "2012-01-05T01:00:00Z",
                 "length": 20,
                 "age": 6
             },
             {
                 "fishtype": "sawshark",
                 "species": "dangerous",
                 "picture": base64(FF FF FF FF FE),
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putValidMissingRequiredAsync(Fish complexBody) {
        return putValidMissingRequiredWithServiceResponseAsync(complexBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
     {
         "fishtype": "sawshark",
         "species": "snaggle toothed",
         "length": 18.5,
         "age": 2,
         "birthday": "2013-06-01T01:00:00Z",
         "location": "alaska",
         "picture": base64(FF FF FF FF FE),
         "siblings": [
             {
                 "fishtype": "shark",
                 "species": "predator",
                 "birthday": "2012-01-05T01:00:00Z",
                 "length": 20,
                 "age": 6
             },
             {
                 "fishtype": "sawshark",
                 "species": "dangerous",
                 "picture": base64(FF FF FF FF FE),
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putValidMissingRequiredWithServiceResponseAsync(Fish complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValidMissingRequired(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putValidMissingRequiredDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putValidMissingRequiredDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
