package org.usfirst.frc.team1592.robot.subsystems;

import org.usfirst.frc.team1592.robot.RobotMap;
import org.usfirst.frc.team1592.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Chassis extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new DriveWithJoysticks());
	}
	public void drive (double x,double y)
	{
		RobotMap.driveBase.arcadeDrive(-x,y);
	}

	public void tank (double x, double y)
	{
		RobotMap.driveBase.tankDrive(x, y);
	}

}
