Feature: Build Your Deal Page
Scenario Outline: Build Your Deal

Given User is on Build Your Deal Page "<Url>"
When user clicks on Lets get Started
Then personal information form appears
When user enters "<Firstname>" "<Lastname>" and "<Email>"
Then user clicks on continue button
Then user enters trade in estimate details
Then view warranty and maintenance products
Then user submits the application

Examples:

													|Url| 				  												|Firstname| |Lastname| |Email|
|https://www.mbusa.com/en/vehicles/cpo/deal/Mercedes-Benz-of-Buckhead/17107/C/SDN/C300W4/55SWF4KB2HU181743?zip=30305| 	|Mike|		|Test|		|test@gmail.com|