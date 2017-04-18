package com.speed.mixer.delegate;

import com.testservices.generated.test1.Test1Request;
import com.testservices.generated.test1.Test1Response;

import javax.jws.WebService;

/**
 * Created by sambit on 4/18/2017.
 */

@WebService
public interface Test1 {
    Test1Response test1(Test1Request request);
}
