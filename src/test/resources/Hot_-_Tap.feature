Feature: Hot tap

Scenario: Water with hot temperature
 Given that the hot tap is open
 Then I can wash my hand

Scenario:  The hot tap is open, but cold water is falling down
 Given that the hot tap is open
 Then I know that is something wrong
 And need to call a plumber

Scenario: The hot tap is open, but the water is very hot
 Given that the hot tap is open
 And the water is very hot
 And I cant wash my hands
 Then I can open the cold tap
 And the temperature of water will be better

Scenario: The hot tap is open, but the flow of water is very big
 Given that the hot tap is open
 And the water flow is very big
 And I cant wash my hands with this flow
 Then I can close a little the hot tap

Scenario: The hot tap is open, but the flow of water is small
 Given that the hot tap is open
 And the water flow is small
 And I cant wash my hands with this flow
 Then I can open more the hot tap
