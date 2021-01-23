// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.constants.EncoderConstants;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.Encoder;


public class EncoderTest extends SubsystemBase {

  Encoder encoder1;
  Encoder encoder2;

  float vel1;
  float vel2;

  public EncoderTest() {

    encoder1 = new Encoder(EncoderConstants.RIGHT_ENCODER_PORT_A,EncoderConstants.RIGHT_ENCODER_PORT_B,EncoderConstants.RIGHT_ENCODER_REVERSE);
    //encoder2 = new Encoder(0,1);
    //math XD

  }

  @Override
  public void periodic() {

    vel1 = encoder1.getRate();
    //vel2 = encoder2.getVelocity();

    SmartDashboard.putNumber("Encoder1", vel1);
    //SmartDashboard.putNumber("Encoder2", vel2);

  }

  @Override
  public void simulationPeriodic() {

  }
}