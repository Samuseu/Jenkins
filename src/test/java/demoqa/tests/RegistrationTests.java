package demoqa.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.SeverityLevel.CRITICAL;
@Feature("Authorisation")
public class RegistrationTests extends TestBase {
    @Severity(CRITICAL)
    @Test
    void practiceForm() {
        String userName = data.firstName;
        String userLastName = data.lastName;
        String userEmail = data.emailAdress;
        String userNumber = data.number;
        String userSubject = data.userSubject;
        String userCurrentAdress = data.userAdress;
        String userState = "NCR";
        String userCity = "Delhi";
        String userBirthDay = data.userBirthDay;
        String userBirthMonth = data.userBirthMonth;
        String userBirthYear = data.userBirthYear;

        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(userLastName)
                .setUserEmail(userEmail)
                .setGender("Male")
                .setUserNumber(userNumber)
                .setBirthDay(userBirthDay, userBirthMonth, userBirthYear)
//                .setSubject(userSubject)
                .setHobbies("Sports")
                .uploatPicture("img/1.png")
                .setCurrentAddres(userCurrentAdress)
                .setState(userState)
                .setCity(userCity);

        registrationPage.virifyResultsModalAppears()
                .virifyResult("Student Name", userName)
                .virifyResult("Student Email", userEmail)
                .virifyResult("Gender", "Male")
                .virifyResult("Mobile", userNumber)
                .virifyResult("Date of Birth", userBirthDay + " " + userBirthMonth + "," + userBirthYear)
//                .virifyResult("Subjects", userSubject)
                .virifyResult("Hobbies", "Sports")
                .virifyResult("Address", userCurrentAdress)
                .virifyResult("State and City", userState + " " + userCity);

    }
}
