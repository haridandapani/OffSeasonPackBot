package org.usfirst.frc.team1592.robot.commands;

import org.usfirst.frc.team1592.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveWithJoysticks extends Command{

	public DriveWithJoysticks()
	{
		requires(Robot.chassis);
	}
	
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double forward=Robot.oi.driver.getY();
    	double side=Robot.oi.driver.getU();
    	Robot.chassis.drive(forward*.75,-side*.75);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
