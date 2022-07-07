Feature: open google.com feature

 @tag1 @tag2
 Scenario: open google website and search
 Given user is opening the chrome browser
 And user is entering google.com
 When user is searching for the "senthil"
 Then the user should see the search result
 
 Scenario: open google website and search
 Given user is opening the chrome browser
 And user is entering google.com
 When user is searching for the "vijay"
 Then the user should see the search result
 
 Scenario: open google website and search
 Given user is opening the chrome browser
 And user is entering google.com
 When user is searching for the "ajith"
 Then the user should see the search result