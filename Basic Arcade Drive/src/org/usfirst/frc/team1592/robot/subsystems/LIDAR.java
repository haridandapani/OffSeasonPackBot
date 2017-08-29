package org.usfirst.frc.team1592.robot.subsystems;

import edu.wpi.first.wpilibj.SensorBase;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LIDAR extends SensorBase{
	    
    I2C m_i2c;
    int lastValidDist = 0;
         
    public LIDAR() {  
    	this.m_i2c = new I2C(I2C.Port.kMXP,0x62);//Mr. Rodby wants to research I2C class
    	initLidar();     	          	  
    }    
    public void initLidar(){		
       // nothing to do
	}

	public int getDistance() {
 
		byte[] buffer;  	
		buffer = new byte[2];
	
		m_i2c.write(0x00, 0x04);
		Timer.delay(0.02);
		m_i2c.read(0x8f, 2, buffer);  	
		
		int dist = (int)Integer.toUnsignedLong(buffer[0] << 8) + Byte.toUnsignedInt(buffer[1]);
		if (dist > 0) lastValidDist = dist;
		SmartDashboard.putNumber("Distance: ", dist);
		return 	lastValidDist;
	}
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}