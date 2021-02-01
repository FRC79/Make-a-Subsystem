// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Drive_Commands.NewMotor_Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.NewMotorConstants;
import frc.robot.subsystems.NewMotor; 

public class StartNewMotor extends CommandBase {
  //reference of newMotor
  private NewMotor m_NewMotor;

  /** Creates a new StartNewMotor. */
  public StartNewMotor() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //Set motor speed to the value in constants
    m_NewMotor.setNewMotorSpeed(NewMotorConstants.NEW_MOTOR_SPEED);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_NewMotor.setNewMotorSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
