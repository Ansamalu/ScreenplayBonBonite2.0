package com.co.bonbonite.tasks;

import com.co.bonbonite.models.DataRegister;
import com.co.bonbonite.userinterfaces.HomePage;
import com.co.bonbonite.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


public class RegisterTask implements Task {

    DataRegister dataRegister;

    public RegisterTask(DataRegister dataRegister) {
        this.dataRegister = dataRegister;
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_REGISTER));
        actor.attemptsTo(Enter.theValue(dataRegister.getId()).into(RegisterPage.TXT_ID));
        actor.attemptsTo(Click.on(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(dataRegister.getEmail()).into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Click.on(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Enter.theValue(dataRegister.getPassword()).into(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Scroll.to(RegisterPage.CHB_INFORMATION));
        actor.attemptsTo(Click.on(RegisterPage.CHB_INFORMATION));
        actor.attemptsTo(Click.on(RegisterPage.CHB_AUTHORIZATION));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER_SUCCESS));


    }

    public static RegisterTask enter(DataRegister dataRegister){
      return Tasks.instrumented(RegisterTask.class, dataRegister);
    }

}











