$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing hotel booking and cancellation functionalities  in adactin application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Checking the valid username and password for login function",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;checking-the-valid-username-and-password-for-login-function",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User launch the adacting application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"\u003cusername\u003e\" valid username",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enter the \"\u003cpassword\u003e\" valid password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enter in the login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "It lands to the homepage successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;checking-the-valid-username-and-password-for-login-function;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;checking-the-valid-username-and-password-for-login-function;;1"
    },
    {
      "cells": [
        "arun",
        "lalala"
      ],
      "line": 15,
      "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;checking-the-valid-username-and-password-for-login-function;;2"
    },
    {
      "cells": [
        "Bala",
        "2b2b2b"
      ],
      "line": 16,
      "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;checking-the-valid-username-and-password-for-login-function;;3"
    },
    {
      "cells": [
        "Prasanna1",
        "priya@123"
      ],
      "line": 17,
      "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;checking-the-valid-username-and-password-for-login-function;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 614000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 346878700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 144200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Checking the valid username and password for login function",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;checking-the-valid-username-and-password-for-login-function;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User launch the adacting application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"arun\" valid username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enter the \"lalala\" valid password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enter in the login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "It lands to the homepage successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_launch_the_adacting_application()"
});
formatter.result({
  "duration": 3785929500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arun",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 495643900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lalala",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 287930600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_enter_in_the_login_button()"
});
formatter.result({
  "duration": 810653000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.it_lands_to_the_homepage_successfully()"
});
formatter.result({
  "duration": 157100,
  "status": "passed"
});
formatter.after({
  "duration": 357300,
  "status": "passed"
});
formatter.before({
  "duration": 292000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 161100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 157200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Checking the valid username and password for login function",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;checking-the-valid-username-and-password-for-login-function;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User launch the adacting application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"Bala\" valid username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enter the \"2b2b2b\" valid password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enter in the login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "It lands to the homepage successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_launch_the_adacting_application()"
});
formatter.result({
  "duration": 1689491800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bala",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 243004600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2b2b2b",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 325186500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_enter_in_the_login_button()"
});
formatter.result({
  "duration": 563196800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.it_lands_to_the_homepage_successfully()"
});
formatter.result({
  "duration": 242400,
  "status": "passed"
});
formatter.after({
  "duration": 142100,
  "status": "passed"
});
formatter.before({
  "duration": 142800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 172300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 109100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Checking the valid username and password for login function",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;checking-the-valid-username-and-password-for-login-function;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User launch the adacting application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"Prasanna1\" valid username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enter the \"priya@123\" valid password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enter in the login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "It lands to the homepage successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_launch_the_adacting_application()"
});
formatter.result({
  "duration": 364873500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prasanna1",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 288654200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "priya@123",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 285331500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_enter_in_the_login_button()"
});
formatter.result({
  "duration": 3767895200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.it_lands_to_the_homepage_successfully()"
});
formatter.result({
  "duration": 164300,
  "status": "passed"
});
formatter.after({
  "duration": 166000,
  "status": "passed"
});
formatter.before({
  "duration": 157000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 158700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 132800,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Searching for the hotel for booking",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;searching-for-the-hotel-for-booking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User select the \"Sydney\" location",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User select the \"Hotel Creek\" hotel",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User select the \"Standard\" roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User select number of rooms \"1\" required",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User enter the \"20/05/2020\" Check in date",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User enter the \"21/05/2020\" check out date",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User select \"2\" number of adults",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User select \"1\" number of children",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User search for the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "It lands to the selecthotel page successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 17
    }
  ],
  "location": "stepdefinition.user_select_the_location(String)"
});
formatter.result({
  "duration": 297661700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Creek",
      "offset": 17
    }
  ],
  "location": "stepdefinition.user_select_the_hotel(String)"
});
formatter.result({
  "duration": 191284100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 17
    }
  ],
  "location": "stepdefinition.user_select_the_roomtype(String)"
});
formatter.result({
  "duration": 174717800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 29
    }
  ],
  "location": "stepdefinition.user_select_number_of_rooms_required(String)"
});
formatter.result({
  "duration": 123889800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20/05/2020",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_Check_in_date(String)"
});
formatter.result({
  "duration": 273211000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21/05/2020",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_check_out_date(String)"
});
formatter.result({
  "duration": 317905700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "stepdefinition.user_select_number_of_adults(String)"
});
formatter.result({
  "duration": 179221300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "stepdefinition.user_select_number_of_children(String)"
});
formatter.result({
  "duration": 184977700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_search_for_the_hotel()"
});
formatter.result({
  "duration": 1491529900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.it_lands_to_the_selecthotel_page_successfully()"
});
formatter.result({
  "duration": 125700,
  "status": "passed"
});
formatter.after({
  "duration": 127400,
  "status": "passed"
});
formatter.before({
  "duration": 119700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 99800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 73600,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Selecting the Hotel for booking",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;selecting-the-hotel-for-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "User select the hotel by clicking the radio option",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User clicks on the continue nutton",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "It lands to the Booking hotel page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_select_the_hotel_by_clicking_the_radio_option()"
});
formatter.result({
  "duration": 292495800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_clicks_on_the_continue_nutton()"
});
formatter.result({
  "duration": 1633344300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.it_lands_to_the_Booking_hotel_page_successfully()"
});
formatter.result({
  "duration": 105200,
  "status": "passed"
});
formatter.after({
  "duration": 93000,
  "status": "passed"
});
formatter.before({
  "duration": 894800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 1135400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 91200,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Booking the selected hotel",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;booking-the-selected-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "User enter the \"Prasanna\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User enter the \"Priya\" last name",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User enter the \"12A/A,EVR Street,Chennai\" address",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User enter the \"2233224300011000\" creditcard number",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User select the \"VISA\" card type",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User select the \"8\" expiry month",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User select the \"2022\" expiry year",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User enter the \"004\" CCV number",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User click on the booknow option",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User wait for the page to load",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "It lands to the Booking confirmation page successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Prasanna",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_first_name(String)"
});
formatter.result({
  "duration": 570875400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Priya",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_last_name(String)"
});
formatter.result({
  "duration": 234700000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12A/A,EVR Street,Chennai",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_address(String)"
});
formatter.result({
  "duration": 395215200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2233224300011000",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_creditcard_number(String)"
});
formatter.result({
  "duration": 350584200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 17
    }
  ],
  "location": "stepdefinition.user_select_the_card_type(String)"
});
formatter.result({
  "duration": 240704000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 17
    }
  ],
  "location": "stepdefinition.user_select_the_expiry_month(String)"
});
formatter.result({
  "duration": 191813100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 17
    }
  ],
  "location": "stepdefinition.user_select_the_expiry_year(String)"
});
formatter.result({
  "duration": 228984300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "004",
      "offset": 16
    }
  ],
  "location": "stepdefinition.user_enter_the_CCV_number(String)"
});
formatter.result({
  "duration": 222582400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_click_on_the_booknow_option()"
});
formatter.result({
  "duration": 164017300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_wait_for_the_page_to_load()"
});
formatter.result({
  "duration": 7314297100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.it_lands_to_the_Booking_confirmation_page_successfully()"
});
formatter.result({
  "duration": 114900,
  "status": "passed"
});
formatter.after({
  "duration": 84900,
  "status": "passed"
});
formatter.before({
  "duration": 177100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 113600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 110600,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "confirmed the booked hotel",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;confirmed-the-booked-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "User click on the myitinerary button",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "It lands to the book itinerary page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_click_on_the_myitinerary_button()"
});
formatter.result({
  "duration": 985069700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.it_lands_to_the_book_itinerary_page_successfully()"
});
formatter.result({
  "duration": 117100,
  "status": "passed"
});
formatter.after({
  "duration": 122800,
  "status": "passed"
});
formatter.before({
  "duration": 159500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 85900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 71100,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "User select the booked hotel by clicking on the checkbox",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;user-select-the-booked-hotel-by-clicking-on-the-checkbox",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "User click on the checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "It lands to the cancel hotel page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_click_on_the_checkbox()"
});
formatter.result({
  "duration": 254405100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.it_lands_to_the_cancel_hotel_page_successfully()"
});
formatter.result({
  "duration": 90900,
  "status": "passed"
});
formatter.after({
  "duration": 131600,
  "status": "passed"
});
formatter.before({
  "duration": 119800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 258500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 102900,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "User cancel the hotel which is booked earlier",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;user-cancel-the-hotel-which-is-booked-earlier",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 60,
  "name": "User click the cancel button",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "User click on the \"accept\" yes button to cancel the booked hotel",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "It lands to the logout page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_click_the_cancel_button()"
});
formatter.result({
  "duration": 306551800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "accept",
      "offset": 19
    }
  ],
  "location": "stepdefinition.user_click_on_the_yes_button_to_cancel_the_booked_hotel(String)"
});
formatter.result({
  "duration": 54022400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.it_lands_to_the_logout_page()"
});
formatter.result({
  "duration": 84400,
  "status": "passed"
});
formatter.after({
  "duration": 93800,
  "status": "passed"
});
formatter.before({
  "duration": 120200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 72400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 108400,
  "status": "passed"
});
formatter.scenario({
  "line": 64,
  "name": "User logout from the adaction application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities--in-adactin-application;user-logout-from-the-adaction-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 65,
  "name": "User click on the logout button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.user_click_on_the_logout_button()"
});
formatter.result({
  "duration": 5828628400,
  "status": "passed"
});
formatter.after({
  "duration": 112700,
  "status": "passed"
});
});