Feature: Casestudy1

Scenario Outline: User access to guest registration 
Given application is launch by guest user
When user clicks on register link available
And provides the required data such as "<gender>" and "<fname>" and "<lname>" and "<email>" and "<pwrd>" and "<conpwrd>" 
Then user clicks on register button


Examples: 
|gender|fname|lname|email|pwrd|conpwrd|
|Female|Nanthini12345|Kalimuthu|nanthini12345@gmail.com|nanthusaran@06|nanthusaran@06|
|Female|Megha12345|Banakar|megha12345@gmail.com|Pass123|Pass123|


Scenario Outline: I want to cross check the multiple users access for login


Given I will check on Login
When I enter username "<email>" and password "<password>"
And click on submit button




Examples:
|email|password|
|nanthini12345@gmail.com|nanthusaran@06|
|megha12345@gmail.com|Pass123|


Scenario: User adds item to the cart
Given User searches for the item
And clicks on add to cart


Scenario: the one where the user moves to cart without adding any item in it.
Given registered into app
When search a particular item like headphones
And try to proceed without adding any item to the cart
Then app doesnot display payement method




