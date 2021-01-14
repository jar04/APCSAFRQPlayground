/*
These are my answers to the Unit 5 FRQ.

------------Question 1------------

a.)  Write a method for the Invitation class that returns the name of the host.
Write the method below.
--
public String getHostName()
{
    return hostName;
}
--

b.) Write a method for the Invitation class that accepts a parameter & uses it to update the address for the event.
Write the method below.
--
public String setAddress(String ad)
{
    address = ad;
}
--

c.) Write a method for the Invitation class that will accept the name of a person who will be invited as a string
parameter & return a string consisting of the name of the person being invited along with the name of the host &
location of the event.
Write the method below. Your implementation must conform to the example above.
--
public String invite(String nme)
{
    return "Dear " + nme + ", please attend my event at " + address + ". See you then, " + hostName + ".";
}
--

d.) Write a correct implementation of the one-parameter Invitation constructor that avoids the error in the
student’s implementation.
Write the method below.
--

--

------------Question 2------------

Write the complete PasswordGenerator class. Your implementation must meet all specifications and conform to the
example.
--
import java.util.Random;
public class PasswordGenerator
{
    private static int passwordsGenerated = 0;
    private static Random random = new Random();
    private String prefix;
    private int length;

    public PasswordGenerator(int length, String prefix)
    {
        this.prefix = prefix;
        this.length = length;
    }

    public PasswordGenerator(int length)
    {
        this.prefix = "A";
        this.length = length;
    }

    public String pwGen()
    {
        String pwd = this.prefix + ".";
        for (int i = 1; i <= this.length; i++)
        {
            pwd += random.nextInt(10);
        }

        passwordsGenerate += 1;
        return pwd;
    }

    public int pwCount()
    {
        return passwordsGenerated;
    }

    public static void main(String [] args)
    {
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());

        PasswordGenerator pw2 = newPasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }
}
--
 */