Feature: Plugin

Scenario: The plugin is blocking water on sink
 Given that the plugin is installed on sink
 And the water is blocked by plugin
 Then Is everything right

Scenario: The plugin is not blocking the water on sink
 Given that the plugin is installed on sink
 And the water is not blocked by plugin
 Then Its not ok