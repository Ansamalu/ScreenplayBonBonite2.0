package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public static final Target TXT_ID = Target.the("Enter the identification").locatedBy("//input[@id='reg_username']");
    public static final Target TXT_EMAIL = Target.the("Enter the email").locatedBy("//input[@id='reg_email']");
    public static final Target TXT_PASSWORD = Target.the("Enter the password").locatedBy("//input[@id='reg_password']");
    public static final Target CHB_INFORMATION = Target.the("Click checkbox information").locatedBy("//*[@id= 'newsletter_authorization']");
    public static final Target CHB_AUTHORIZATION = Target.the("Click checkbox authorization").locatedBy("//*[@id='privacy_policy_reg']");
    public static final Target BTN_REGISTER_SUCCESS = Target.the("Click register ").locatedBy("//button[normalize-space()='Registrarse']");
}






