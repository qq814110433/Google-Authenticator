package test;

import cn.limbo.utils.GoogleAuthenticator;
import org.junit.Test;

/**
 * Created by limbo on 2016/11/25.
 */
public class GoogleAuthenticatorTest {


    @Test
    public void genSecret(){
        System.out.println(GoogleAuthenticator.generateSecret());
    }

    @Test
    public void authCode(){
        System.out.println(GoogleAuthenticator.authCode("109622","TEM57QKWKQ5Y6YRP"));
    }

}
