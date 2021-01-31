/*
These are my answers to the Unit 7 FRQ.

------------Question 1------------

a.) Write the constructor for the UserName class. The constructor initializes and fills possibleNames with possible
user names based on the firstName and lastName parameters. The possible user names are obtained by concatenating
lastName with different substrings of firstName. The substrings begin with the first character of firstName and the
lengths of the substrings take on all values from 1 to the length of firstName.

b.) Write the UserName method setAvailableUserNames. The method removes from possibleNames all names that are
found in usedNames. These represent user names that have already been assigned in the online system and are
therefore unavailable.
--
import java.util.*;
class UserName
{
    ArrayList<String> possibleNames;
    UserName(String firstName, String lastName)
    {
        if (this.isValidName (firstName) && this.isValidName (lastName))
        {
            possibleNames = new ArrayList<String>();

            for (int i = 1; i < firstName.length() + 1; i++)
            {
                possibleNames.add (lastName + firstName.substring (0, i));
            }
        }

        else
        {
            System.out.println("firstName & lastName must contain letters only.");
        }
    }

    public boolean isUsed(String name, String [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (name.equals(arr[i]))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public void setAvailableUserNames(String [] usedNames)
        {
            String [] names = new String[this.possibleNames.size()];
            names = this.possibleNames.toArray(names);

            for (int i = 0; i < usedNames.length; i++)
            {
                if (isUsed(usedNames[i], names))
                {
                    int index = this.possibleNames.indexOf(usedNames[i]);
                    this.possibleNames.remove(index);
                    names = new String[this.possibleNames.size()];
                    names = this.possibleNames.toArray(names);
                }
            }
        }
    }
}
--
 */