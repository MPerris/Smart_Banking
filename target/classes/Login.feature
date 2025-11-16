@Smoke @Functional @Regression
Feature:Login Function Test
Background:
Given Open browser
And   Go to application

@Positive @STC-25
Scenario: Login should pass with valid credential
When  Enter valid username
And   Enter valid password 
And   Click login button
Then  Login status should pass and logout option should be visible

@Negative @STC-16 
Scenario: Login function with valid user and wrong password
When  Enter valid username
And   Enter invalid password
And   Click login button
Then  Login status should fail

@Negative @STC-27
Scenario: Login should fail with invalid credential
When  Enter invalid username
And   Enter invalid password
And   Click login button
Then  Login status should fail

@Negative @STC-29
Scenario: Login should fail with invalid user and valid password
When  Enter invalid username
And   Enter valid password
And   Click login button
Then  Login status should fail 

@Negative @STC-32
Scenario: Login should fail with empty user and password
When  Enter null username
And   Enter null password
And   Click login button
Then  Login status should fail

@Negative @STC-34
Scenario: Login should fail with valid user and empty password
When  Enter valid username
And   Enter empty password
And   Click login button
Then  Login status should fail

@Negative @STC-37
Scenario: Login should fail with wrong user and valid password
When  Enter invalid username
And   Enter valid password
And   Click login button
Then  Login status should fail


