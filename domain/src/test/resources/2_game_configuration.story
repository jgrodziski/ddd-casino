Scenario: P-table configuration
Given a game with 3 symbols (Star, Club, Treasure) and 3 winning combinations (3 stars, 3 clubs, 3 treasures)
When the game hits 3 star
Then it gives back 100 times the credits bet
When the game hits 3 club
Then it gives back 50 times the credits bet
When the game hits 3 treasures
Then it gives back 20 times the credits bet
When the game hits any other combination
Then it gives back 0 credits