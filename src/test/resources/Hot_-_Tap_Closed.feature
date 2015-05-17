Feature: Hot Tap Closed

Scenario: Has water falling down into the sink, but the hot tap is closed
 Given that the hot tap is closed
 And have water falling into the sink
 Then I can call a plumber to verify this problem

Scenario: The hot tap is closed and dont have some water falling down into the sink
 Given that the hot tap is closed
 And dont have water falling into the sink
 Then Is everything good
