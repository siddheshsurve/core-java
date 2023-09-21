Aggregation in Java

Aggregation in Java is a special kind of association. It represents the Has-A relationship between classes. Java Aggregation allows only one-to-one relationships.

If an object is destroyed, it will not affect the other object, i.e., both objects can work independently.

Let’s take an example. There is an Employee in a company who belongs to a particular Department. If the Employee object gets destroyed still the Department can work independently.

The end of the Employee object will not affect or destroy the Department object. The Aggregation is represented as a line with a diamond.

Here the Department has-a Employee and therefore both are in the Aggregation with each other.