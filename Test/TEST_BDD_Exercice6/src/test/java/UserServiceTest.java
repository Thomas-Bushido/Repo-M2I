import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.Model.User;
import org.example.Service.UserService;

public class UserServiceTest {

    private UserService userService;

    @Given("User who want to register")
    public void userWhoWantToRegister(User user){
        user = new User();
        user.setEmail("test@test.fr");
        user.setUsername("toto");
        user.setPassword("1234");

        userService.register(user);

    }

    @When("an account is created")
    public void anAccountIsCreated(User user){
        userService.connection()
    }

}
