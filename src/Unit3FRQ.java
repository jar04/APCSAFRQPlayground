/*
These are my answers to the Unit 3 FRQ.

a.) Write a code segment that prints "attending" if RSVP is true & prints "not attending" otherwise.
Write the code segment below.
--
if(RSVP)
{
    System.out.println("Attending");
}
else
{
    System.out.println("Not Attending");
}
--

b.) Write a code segment that prints the food item associated with "Selection". For example, if "Selection" is 3, the
code segment should print "pasta".
Write the code segment below. Your code segment should meet all specifications and conform to the example.
--
if(Selection == 1)
{
    System.out.println("Beef");
}
else if(Selection == 2)
{
    System.out.println("Chicken");
}
else if(Selection == 3)
{
    System.out.println("Pasta");
}
else
{
    System.out.println("Fish");
}
--

c.) Write a code segment that will store a dinner selection in option1 based on the values of RSVP and Selection.
The intended behavior of the code segment is described below.

If RSVP is true, the code segment should store in option1 a string indicating the person's attendance & food choice.
For example, if RSVP is true & Selection is 1, the following string should be stored in option1.

"Thanks for attending. You will be served beef."

If RSVP is false, the following string should be stored in option1, regardless of the value of Selection.

"Sorry you can't make it."

Write the code segment below. Your code segment should meet all specifications and conform to the examples.
--
switch(Selection)
{
    case 1:
    if(RSVP)
    {
        option1 = "Thanks for attending. You will be served beef.";
    }
    else
    {
        option1 = "Sorry you can't make it.";
    }
    break;

    case 2:
    if(RSVP)
    {
        option1 = "Thanks for attending. You will be served chicken.";
    }
    else
    {
        option1 = "Sorry you can't make it.";
    }
    break;

    case 3:
    if(RSVP)
    {
        option1 = "Thanks for attending. You will be served pasta.";
    }
    else
    {
        option1 = "Sorry you can't make it.";
    }
    break;

    default:
    if(RSVP)
    {
        option1 = "Thanks for attending. You will be served fish.";
    }
    else
    {
        option1 = "Sorry you can't make it.";
    }
    break;
}
--

d.) Write a code segment that will print true if the strings option1 & option2 contain the same values & will print
false otherwise.
Write the code segment below.
--
if(option1 == option2)
{
    System.out.println("True");
}
else
{
    System.out.println("False");
}

*/
