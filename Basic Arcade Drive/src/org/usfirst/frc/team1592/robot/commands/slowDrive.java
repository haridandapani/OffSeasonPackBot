package org.usfirst.frc.team1592.robot.commands;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc.team1592.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class slowDrive extends Command{
	public slowDrive()
	{
		requires(Robot.chassis);
	}
	
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//System.out.println("slow drive");
    	Robot.chassis.tank(.5,.5);
    	this.isFinished();
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	for (int i=0;i<10000;i++)
    	{
    		//System.out.println("pass");
    	}
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.tank(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
	
}
