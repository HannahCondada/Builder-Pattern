# Builder Pattern

**Problem Scenario**

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

_However, you encounter challenges:_

**Registration forms:** It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
**Optional fields:** Not all customers provide complete information, but the constructor forces them to.
**Data consistency:** Changes to user profiles after registration can cause unexpected issues due to mutable fields.
Implement solution using the Builder Pattern to address the issue.

# Builder Pattern Diagram
![Builder Pattern Diagram](https://github.com/HannahCondada/Builder-Pattern/assets/142371011/6e61718b-2a10-4c7f-a607-e0f3f52e450e)
