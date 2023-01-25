package karate.putBooking;

import com.intuit.karate.junit5.Karate;

public class RunnerPut {

    @Karate.Test
    Karate RunnerPut(){
        return  Karate.run().relativeTo(getClass());

    }
}
