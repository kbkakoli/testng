package listeners;

import org.testng.annotations.Test;

public class login {
@Test(priority=0)
public void loginwithvalidcredentials() {
	System.out.println("login--->loginwithvalidcredentials");
}
@Test(priority=1)
public void loginwithvalidemailAndInvalidPassword() {
System.out.println("login--->loginwithvalidemailAndInvalidPassword");	
}

@Test(priority=2)
public void loginwithinvalidvalidemailAndvalidPassword() {
System.out.println("login--->loginwithinvalidvalidemailAndvalidPassword");}


@Test(priority=3)
public void loginwithinvalidcredentials() {
System.out.println("login--->loginwithinvalidcredentials");
}
}







