import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Command;
import org.junit.Assert;

public class CommandSteps {

    private Command command1;
    private Command command2;

    @Given("Customers {string} and {string} who want to make a command for Someone")
    public void customerWhoWantToCommandForSomeone(String name1, String name2){
        command1 = new Command();
        command1.setFrom(name1);

        command2 = new Command();
        command2.setFrom(name2);
    }

    @When("2 command are make for Someone")
    public void twoCommandIsMakeForSomeone(){

        command1.setTo("Tata");
        command2.setTo("Tutu");

    }

    @Then("there is no product in the 2 Command")
    public void thereIsNoProductInTheCommand(){
        Assert.assertTrue(command1.getProducts().isEmpty());
        Assert.assertTrue(command2.getProducts().isEmpty());
    }

    @And("the 2 command come from Customers {string} and {string}")
    public void theCommandComeFromCustomer(String name1, String name2){
        Assert.assertEquals(name1,command1.getFrom());
        Assert.assertEquals(name2,command2.getFrom());
        Assert.asse
    }
}
