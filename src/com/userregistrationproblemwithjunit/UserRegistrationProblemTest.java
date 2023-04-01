package com.userregistrationproblemwithjunit;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationProblemTest {
    UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();

    @Test
    public void checkValidFirstName(){
        Assert.assertEquals(true,userRegistrationProblem.validFirstName());
        System.out.println("First name Test Case Passed: ");
    }
    @Test
    public void checkValidLastName(){
        Assert.assertEquals(true,userRegistrationProblem.validLastName());
        System.out.println("Last name Test Case Passed: ");
    }
    @Test
    public void checkValidEmailId(){
        Assert.assertEquals(true,userRegistrationProblem.validEmailId());
        System.out.println("Email id Test Case Passed: ");
    }
    @Test
    public void checkValidPhoneNumber(){
        Assert.assertEquals(true,userRegistrationProblem.validPhoneNumber());
        System.out.println("Phone number Test Case Passed: ");
    }@Test
    public void checkValidPassword(){
        Assert.assertEquals(true,userRegistrationProblem.validPassword());
        System.out.println(" Test Case for Password Passed: ");
    }
    @Test
    public void checkValidAllEmailId(){
        Assert.assertEquals(true,userRegistrationProblem.validAllEmailId());
        System.out.println("Test Case for all email id Passed: ");
    }

}
