Feature: Login to CPO Inventory
Scenario Outline: CPO Inventory

Given user navigates to "<Url>"
Then click on view cpo inventory
When enter "<zipcode>"
Then click on view inventory
When selecting distance from dropdown to select 10 miles
Then click on apply to result
When selecting distance from dropdown to select 25 miles
Then click on apply to search
When click on C Class Sedan
Then click on view vehicle details
Then click on specification
Then click on features
Then click on dealerlocation
When click on build your deal


Examples:

		|Url|    							|zipcode|
|https://www.mbusa.com/en/cpo|				|10014|