// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class DriveConstants {

        /* motors */
        // currently set up for CK23 ports 
        public static final int LEFT_MOTOR1_PORT    = 7;  // victor
        public static final int LEFT_MOTOR2_PORT    = 1;  // talon
        
        public static final int RIGHT_MOTOR1_PORT   = 13; // talon
        public static final int RIGHT_MOTOR2_PORT   = 8;  // victor

        /* encoders */
        public static final int RIGHT_ENCODER_PORT_A        = 0;     // port for a channel of right encoder
        public static final int RIGHT_ENCODER_PORT_B        = 1;     // port for a channel of right encoder
        public static final boolean RIGHT_ENCODER_REVERSE   = true;  // port for a channel of right encoder

        public static final int LEFT_ENCODER_PORT_A         = 2;     // port for a channel of right encoder
        public static final int LEFT_ENCODER_PORT_B         = 3;     // port for a channel of right encoder
        public static final boolean LEFT_ENCODER_REVERSE    = false; // port for a channel of right encoder
    }    


    public static final class OIConstants {
      /* joysticks */
      public static final int DRIVER    = 0; // driver joystick port (usb) on laptop (changeable w/ oi in driver station)
      public static final int OPERATOR  = 1; // driver joystick port (usb) on laptop (changeable w/ oi in driver station)

      //button control
      public static final int NEW_MOTOR_RUN = 4; //will turn on motor when pressed and stop it when released

    }
   public static final class NewMotorConstants {
     //the motor
     public static final int NEW_MOTOR_PORT = 18; //talon motor

     //speed
     public static final double NEW_MOTOR_SPEED = 1; //max throttle
   } 
}

