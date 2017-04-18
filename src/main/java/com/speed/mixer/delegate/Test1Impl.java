package com.speed.mixer.delegate;

import com.testservices.generated.test1.ObjectFactory;
import com.testservices.generated.test1.Test1Request;
import com.testservices.generated.test1.Test1Response;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component("test1Services")
@WebService(endpointInterface = "com.speed.mixer.delegate.Test1")
public class Test1Impl implements Test1{

    ObjectFactory fact    = new ObjectFactory();

    @Override
    public Test1Response test1(Test1Request request)
    {
        System.out.println("User: " + request.getUser());
        System.out.println("ID: " + request.getId());

        Test1Response response = fact.createTest1Response();

        response.setSuccess(true);
        response.setField1("Value 1");
        response.setField2("Value 2");

        return response;
    }

}
