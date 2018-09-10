Feature: Delete a lead 

#Background: 
#	Given  Launch the browser 
#	And  Maximize the browser 
#	And  Set timeout 
#	And  Load URL 
Scenario Outline: Verifying the Delete lead functionality 

	And  Enter User Name as <userName>
	And  Enter password as <password> 
	And  Click Login 
	And  Click crmsfa 
	And  Click lead tab 
	And Click Find Lead
	And  Enter Find Lead First Name as <fName>
	And Click Find Lead button
	And Capture First Lead Id
	And Click First Lead Id
	When Click Delete
	And Click Find Lead
	And Enter First Lead Id
	And Click Find Lead button
	Then Verify the expected message as <expectedMsg>
	Examples: 
		|userName|password|fName|expectedMsg|
		|DemoSalesManager|crmsfa|Kumaran|No records to display|
		|DemoSalesManager|crmsfa|Chintu|No records to display|