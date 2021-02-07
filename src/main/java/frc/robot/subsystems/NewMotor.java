// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.robot.Constants.NewMotorConstants;

public class NewMotor extends SubsystemBase {

  /* motor */
  private final TalonSRX motor = new TalonSRX(NewMotorConstants.NEW_MOTOR_PORT);

  /** Creates a new NewMotor. */
  public NewMotor() {}

  /* set motor speed */
  public void setNewMotorSpeed(double speed){
    motor.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
