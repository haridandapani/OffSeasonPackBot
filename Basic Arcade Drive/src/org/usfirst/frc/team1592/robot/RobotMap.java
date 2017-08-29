package org.usfirst.frc.team1592.robot;

import org.usfirst.frc.team1592.robot.subsystems.LIDAR;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.internal.HardwareTimer;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CANTalon motorLeft=new CANTalon(1);
	public static CANTalon motorRight=new CANTalon(0);
	public static RobotDrive driveBase=new RobotDrive(motorLeft, motorRight);
	public static HardwareTimer timer=new HardwareTimer();
	public static LIDAR lidar = new LIDAR();
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
