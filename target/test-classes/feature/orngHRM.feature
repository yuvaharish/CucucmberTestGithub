Feature: This is the login feature for ornghrm

Scenario Outline: This is login scenario
Given user is on login page
When the user enters the below vailed "<userName>" and "<passWord>"
And click the login button
Then the user should be navigated to homepage

Examples:
|userName	|passWord|
|Admin		|admin123|
|Admin		|admin12 |
|Admi 		|admin123|
|Admi 		|admin12 |