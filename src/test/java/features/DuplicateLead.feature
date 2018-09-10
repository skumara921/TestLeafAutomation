Feature: Duplicate a  Lead 

#Background: 
#	Given  Launch the browser 
#	And  Maximize the browser 
#	And  Set timeout 
#	And  Load URL 
	
	Scenario Outline: Verifying the Duplicate Lead functionality
	
	And  Enter User Name as <userName> 
	And  Enter password as <password>
	And  Click Login 
	And  Click crmsfa 
	And  Click lead tab 
	And  Click Find Lead
	And  Enter Find Lead First Name as <fName>
	And Click Find Lead button
	And Capture First Lead Name
	And Click First Lead Id
	And Click Duplicate Lead Button
	And Click Create Lead Button
	Then Verify First Name as <fName>
	Examples:
	|userName|password|cName|fName|lName|
	|DemoCSR|crmsfa|TestLeaf|Kumaran|S|
	|DemoCSR|crmsfa|TestLeaf|Chintu|S|
