/*
These are my answers to the Unit 4 FRQ.

------------Question 1------------

Complete the method below. Your implementation should conform to the example above.
--
public static void longestStreak(String str)
{
    int maxCharacterCount = 0;
    char longestSubString = str.charAt(0);

    for (int i = 0; i < str.length(); i++)
    {
        int currentMaxCharacterCount = 1;

        for (int j = i + 1; j < str.length(); j++)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                break;
            }
            else
            {
                currentMaxCharacterCount++;
            }
        }

        if (currentMaxCharacterCount > maxCharacterCount)
        {
            maxCharacterCount = currentMaxCharacterCount;
            longestSubString = str.charAt(i);
        }
    }

    System.out.println(longestSubString + " " + maxCharacterCount);
}
--

------------Question 2------------

Complete method getPlayer2Move below by assigning the correct value to result to be returned.
--
public int getPlayer2Move(int round)
{
    int result;

    if (round % 3 == 0)
    {
        result = 3;
    }
    else if (round % 2 == 0)
    {
        result = 2;
    }
    else
    {
        result = 1;
    }

    return result;
}
--

Complete method playGame below.
--
public void playGame()
{
    // Initializing the coins for Player 1.
    int player1Coins = startingCoins;

    // Initializing the coins for Player 2.
    int player2Coins = startingCoins;

    for (int round = 1; round <= maxRounds; round++)
    {
        // If the Player 1 or Player 2 coins are less than 3...
        if (player1Coins < 3 || player2Coins < 3)
        {
            break;
        }

        // The number of coins that Player 1 spends.
        int player1Spends = getPlayer1Move();

        // The number of coins that Player 2 spends.
        int player2Spends = getPlayer2Move(round);

        // Removing the coins from Player 1.
        player1Coins -= player1Spends;

        // Removing the coins from Player 2.
        player2Coins -= player2Spends;

        // If Player 1 spends the same number of coins as Player 2...
        if (player1Spends == player2Spends)
        {
            player2Coins += 1;
            continue;
        }

        // The positive difference between the number of coins spent by the two players.
        int difference = Math.abs(player1Spends - player2Spends);

        // If the difference is 1.
        if (difference == 1)
        {
            player2Coins += 1;
            continue;
        }

        // If the difference is 2.
        if (difference == 2)
        {
            player1Coins += 2;
            continue;
        }
    }

    // The end of the game.
    // If Player1Coins is equal to Player2Coins...
    if (player1Coins == player2Coins)
    {
        System.out.println("This is a tie.");
    }

    // If player1Coins are greater than player2Coins...
    else if (player1Coins > player2Coins)
    {
        System.out.println("Player 1 wins!");
    }

    // If player2Coins are greater than player1Coins...
    else if (player1Coins < player2Coins)
    {
        System.out.println("Player 2 wins!");
    }
}
--
 */