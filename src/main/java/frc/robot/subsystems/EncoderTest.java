// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.Encoder;


public class EncoderTest extends SubsystemBase {

  Encoder encoder1;
  Encoder encoder2;

  float vel1;
  float vel2;

  public EncoderTest() {

    encoder1 = new Encoder(0,1);
    encoder2 = new Encoder(0,1);
    //math XD

  }

  @Override
  public void periodic() {

    vel1 = encoder1.getVelocity();
    vel2 = encoder2.getVelocity();

  }

  @Override
  public void simulationPeriodic() {

    SmartDashboard.putNumber("Encoder1", vel1);
    SmartDashboard.putNumber("Encoder2", vel2);

  }
}
