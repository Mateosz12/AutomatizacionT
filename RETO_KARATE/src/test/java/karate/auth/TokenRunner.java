package karate.auth;

import com.intuit.karate.junit5.Karate;

public class TokenRunner {
    @Karate.Test
    Karate CreateToken(){
        return  Karate.run().relativeTo(getClass());

    }
}




