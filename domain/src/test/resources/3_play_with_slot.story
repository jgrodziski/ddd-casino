Scenario: Play with Slot
Given the EGM 1000
When the player inserts a bill of 20 EUR
Then the EGM has an increment 40 credits
When the player bets 1 credit
Then the EGM starts a game with a bet of 1 credit
Then the EGM has a current balance of 39 credits
When the game is a success, the player wins ? credits
Then the EGM has a balance of ?

Scenario: Blocking game with slot
Given the EGM 1001






