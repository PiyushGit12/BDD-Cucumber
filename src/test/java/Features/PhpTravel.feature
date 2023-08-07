# Without Examples Keyword
Feature: Test the PHP Travels Sites 

	Scenario: Test the Hotel booking Functionality
	Given     The user is on the Home page 
	When      The user navigates to the Login page 
	Then      The user enters username and password 
	And       The user is able to click on the Login button 
	Then      The user is logged in successfully 
	And       The successful login message is displayed
	And       The Browser should be closed