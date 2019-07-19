
import junit.framework.TestCase;
import org.junit.Assert;


public class Controller extends TestCase {

    Validator validator =new Validator();

    public void testName(){

        Assert.assertEquals(true, validator.isValidName("Seyed"));
        Assert.assertEquals(true,validator.isValidName("1Seyed"));

    }

    public void testMailId(){

        Assert.assertEquals(false,validator.isValideMail("seyedhere@gmail.com"));
        Assert.assertEquals(false,validator.isValideMail("SeyedHere1@gmail.com"));


    }

    public void testMobileNumber(){
        Assert.assertEquals(false,validator.isValidMobile("8825776243"));
        Assert.assertEquals(true,validator.isValidMobile("3949389343894"));

    }

    public void testRelationship(){
        Assert.assertEquals(false,validator.isValidRelation("Mom"));
        Assert.assertEquals(true,validator.isValidRelation("2Brother"));

    }
    public void testWebAddress(){
        Assert.assertEquals(true,validator.isValidwebAddress("www.geekseyed.com"));

    }
    public void testOrganizationName(){
        Assert.assertEquals(true,validator.isValidOrganizationName("FULL"));

    }

      //  assertTrue((nameValidator.isValideName("Seyed1")));



}
