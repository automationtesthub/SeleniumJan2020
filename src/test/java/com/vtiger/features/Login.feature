Feature: Validate all functioanlity on login

#Background: User should b on login page

@Smoke
Scenario: Valid Login
Given User should b on login page
When User enters valid userid and password
Then user should be login successfully
And Logout link  should be visible
And close application



@Smoke
Scenario Outline: InValid Login
Given User should b on login page
When User enters invalid "<Userid>" and "<pwd>"
Then user should be on login page with error msg
And message should be "<Message>"
And close application
Examples:
|Userid | pwd  | Message                                        |
|admin1 |admin1| You must specify a valid username and password.|
|admin2 |admin2| You must specify a valid username and password.|
|admin3 |admin3| You must specify a valid username and password.|

@Smoke
Scenario: verify title
Given User should b on login page
Then title should be matched
And close application


@Smoke
Scenario: verify logo
Given User should b on login page
Then logo should be displayed
And close application

@Smoke
Scenario: Valid Login with fix data
Given User should b on login page
When User enters valid "<userid>" and "<pwd>"
|userid | pwd   |
|admin  | admin |
Then user should be login successfully
And Logout link  should be visible
And close application


