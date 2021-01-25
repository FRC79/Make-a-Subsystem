// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.kauailabs.navx.frc.AHRS;


import edu.wpi.first.wpilibj.SPI;


public class GyroTest extends SubsystemBase {

  AHRS gyro;

  SmartDashboard m_dash;

  public GyroTest() {

    gyro = new AHRS(SPI.Port.kMXP); 
  }

  @Override
  public void periodic() {

    m_dash.putNumber("Angle", gyro.getAngle());
    m_dash.putNumber("Altitude", gyro.getAltitude());
    m_dash.putNumber("Altitude", gyro.getCompassHeading());

  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
