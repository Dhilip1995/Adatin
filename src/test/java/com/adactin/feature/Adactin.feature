Feature: Hotel Booking In Adactin Application 

Scenario: User Login In The Web Application
Given user Lanuch The Adactin Application 
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigate to Search Hotel Page

Scenario: User Search And Select The Room And Detail In Select Hotel Page
When user Select The Location In That Field
And user Select The Hotels In That Field
And user Select The RoomType In That Field
And user Select The Number Of Rooms In That Field
And user Enter The Check In Date In CheckInDate Field
And user Enter The Check Out Date In ChecKOutDate Field
And user Select The AdultsPerRoom In That Field
And user Select The ChildrenPerRoom In That Field
Then user Click The Login Serach Button And It Navigate To Select Hotel Page

Scenario: User Confirm The Room In Search Hotel
When user Click Select Button
Then user Click Continue Button And It Navigate To Book A Hotel Page

Scenario: User Book The Room And Paymnt Details
When user Enter The First Name In That Field
And user Enter The Last Name In That Field
And user Enter The Billing Address In That Field
And user Enter The Credit Card Number In ThaT Field
And user Select The Credit Card Type
And user Select The Month In That Expiry Date Field
And user Select The Year In That Expiry Date Field
And user Enter The CVV Number In The Field
Then user Click The BookNow Button And It Navigate To Booking Confirmation 

Scenario: User Booking Confirmation Page

Then user Click Logout Button