Feature: Create  Lead 

#Background: 
#	Given  Launch the browser 
#	And  Maximize the browser 
#	And  Set timeout 
#	And  Load URL 
	
	Scenario Outline: Verifying the create Lead functionality
	
	And  Enter User Name as <userName> 
	And  Enter password as <password>
	And  Click Login 
	And  Click crmsfa 
	And  Click lead tab 
	And  Click Create Lead
	And  Enter Company Name as <cName>
	And  Enter Create Lead First Name as <fName>
	And  Enter Last Name as <lName>
	When  Click create Lead
	Then  Verify the page title 
	Examples:
	|userName|password|cName|fName|lName|
	|DemoCSR|crmsfa|TestLeaf|Kumaran|S|
	|DemoCSR|crmsfa|TestLeaf|Chintu|S|
