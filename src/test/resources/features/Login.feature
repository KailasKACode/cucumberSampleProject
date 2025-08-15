Feature: Login feature 

Scenario Outline: Successful Login with Valid Credentials 
	Given I am on the login page 
	When I enter "<username>" and "<password>" 
	Then I should be redirected to the homepage 
	
	Examples: 
		| username     | password   |
		| student  | Password123   |
		
