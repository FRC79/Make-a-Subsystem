# Make-a-Subsystem

The code above is the full code for last year's robot CK_23.5

Suppose that to accommodate a new challenge, a wheel & motor is placed on the robot.

The drive team wants it so that the motor is on while they hold a button on the operator controller.

The ideal speed for the motor is unknown and will need to be tweaked later on.

### Important Information 

the motor is controlled by a talon with an ID of 18.

The button the drivers want to use has an ID of 4 on the operator controller.

The ideal speed of the motor is not known so it will have to be easily changeable later.

## Directions

make a branch titled with your first name **remember to make the branch and checkout into it before you start working**

Remember to:
1. make a subsystem named NewMotor
2. make commands
3. store constants in constants.java
4. make an instance of the subsystem in robotContainer.java
5. make instances the commands in response to button pressed in robotContainer.java
6. add comments as you go

## Hints

### Hint 1
the idea of running the motor while a driver holds a button can be thought of as turning on the motor when they press down, and turning off the motor when they let go.
### Hint 2
THe functionality of this motor is identical to how the rollers already on the robot work.
