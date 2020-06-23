Feature: Testing hotel booking and cancellation functionalities  in adactin application

Background:
    Given the user is logged in
    And goes to landing page
@Login
Scenario Outline: Checking the valid username and password for login function
Given User launch the adacting application
When User enter the "<username>" valid username
And User enter the "<password>" valid password
And User enter in the login button
Then It lands to the homepage successfully
Examples:
|username|password|
|arun|lalala|
|Bala|2b2b2b|
|Prasanna1|priya@123|

@Search
Scenario: Searching for the hotel for booking
When User select the "Sydney" location
And User select the "Hotel Creek" hotel
And User select the "Standard" roomtype
And User select number of rooms "1" required
And User enter the "20/05/2020" Check in date
And User enter the "21/05/2020" check out date
And User select "2" number of adults
And User select "1" number of children
And User search for the hotel
Then It lands to the selecthotel page successfully

Scenario: Selecting the Hotel for booking
When User select the hotel by clicking the radio option
And User clicks on the continue nutton
Then It lands to the Booking hotel page successfully

Scenario: Booking the selected hotel
When User enter the "Prasanna" first name
And User enter the "Priya" last name
And User enter the "12A/A,EVR Street,Chennai" address
And User enter the "2233224300011000" creditcard number
And User select the "VISA" card type
And User select the "8" expiry month
And User select the "2022" expiry year
And User enter the "004" CCV number
And User click on the booknow option
And User wait for the page to load
Then It lands to the Booking confirmation page successfully

Scenario: confirmed the booked hotel
When User click on the myitinerary button
Then It lands to the book itinerary page successfully


Scenario: User select the booked hotel by clicking on the checkbox
When User click on the checkbox
Then It lands to the cancel hotel page successfully
		
Scenario: User cancel the hotel which is booked earlier
When User click the cancel button
And User click on the "accept" yes button to cancel the booked hotel 	
Then It lands to the logout page

Scenario: User logout from the adaction application
When User click on the logout button
		
		
		