package karate.getBooking;

import com.intuit.karate.junit5.Karate;

public class RunnerGet {

    @Karate.Test
    Karate RunnerGet(){
        return  Karate.run().relativeTo(getClass());

    }
}
