package karate.createBooking;

import com.intuit.karate.junit5.Karate;

public class RunnerCreate {

    @Karate.Test
    Karate RunnerCreate(){
        return  Karate.run().relativeTo(getClass());

    }
}
