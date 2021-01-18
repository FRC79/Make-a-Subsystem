// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.kauailabs.navx.frc.AHRS;


public class GyroTest extends SubsystemBase {

  AHRS ahrs;

  public GyroTest() {

    ahrs = new AHRS(SPI.Port.kMXP); 

  }

  @Override
  public void periodic() {

    m_dash.putNumber("Angle", ahrs.getAngle());
    m_dash.putNumber("Altitude", ahrs.getAltitude());
    m_dash.putNumber("Altitude", ahrs.getCompassheading());

  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
