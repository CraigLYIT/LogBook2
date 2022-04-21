

import org.testng.annotations.*;
import static org.testng.Assert.*;


public class testing {
@Test public void enigmaWorks(){
    Enigma myEnigma =

            new Enigma();
    assertNotNull(myEnigma.Encrypt(),"Test confirms enigma works");

}

}
