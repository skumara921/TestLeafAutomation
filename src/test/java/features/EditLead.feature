Feature: Editing a lead 

#Background: 
#	Given  Launch the browser 
#	And  Maximize the browser 
#	And  Set timeout 
#	And  Load URL 
Scenario Outline: Verifying the edit lead functionality 

	And  Enter User Name as <userName>
	And  Enter password as <password> 
	And  Click Login 
	And  Click crmsfa 
	And  Click lead tab 
	And Click Find Lead
	And  Enter Find Lead First Name as <fName>
	And Click Find Lead button
	And Click First Lead Id
	When Click Edit
	And Update the company name as <cName>
	And  Click Update
	Then Verify the company name as <cName>
	Examples: 
		|userName|password|fName|cName|
		|DemoSalesManager|crmsfa|Kumaran|TestLeaf|
		|DemoCSR|crmsfa|Chintu|TestLeaf|