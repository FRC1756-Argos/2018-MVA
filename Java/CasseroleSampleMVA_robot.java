/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1736.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {

	////////////////////////////////////////////////////////////////////////
	// TODO: ADD THESE VARIABLES
	//Globals
	double startTime = 0;
	
	//TUNE PARAMS TODO: Tweak to taste
	final double AUTO_WAIT_DURATION_S = 0.0;   // Number of seconds to delay before moving. Should be zero unless you are working around someone else's path.
	final double AUTO_RUN_DURATION_S  = 5.0;   // Number of seconds to run motor for. Should be sufficently large to get you where you want to go to.
	final double MOTOR_RUN_CMD        = 0.75;  // Motor command to use (0.0 stop, 1.0 full forward)
	//
    ////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {

	}

    ////////////////////////////////////////////////////////////////////////
    // TODO: Add this function & set start time
	//   This function may or may not yet exist in code.
	//   Add if it does not exist, or just add the "startTime =" line if 
	//    it does already exist. 
    ////////////////////////////////////////////////////////////////////////
	@Override
	public void autonomousInit() {
		startTime = Timer.getFPGATimestamp();
	}


    ////////////////////////////////////////////////////////////////////////
    // TODO: Add this function & its contents
	//   This function may or may not yet exist in code.
	//   Add if it does not exist, or just add the contents below if it 
	//    does already exist. 
    ////////////////////////////////////////////////////////////////////////
	@Override
	public void autonomousPeriodic() {
		double elapsedTime = Timer.getFPGATimestamp() - startTime;
		double motorCmd = 0; //Command to be sent to the motor. TODO: use me
		
		if(elapsedTime < AUTO_WAIT_DURATION_S) {
			//Set motors off
			motorCmd = 0.0;
		} else if (elapsedTime >= AUTO_WAIT_DURATION_S && elapsedTime < AUTO_RUN_DURATION_S ) {
			//set motors on
			motorCmd = MOTOR_RUN_CMD;
		} else {
			//set motors off
			motorCmd = 0.0;
		}
		
		//Assign motorCmd to left/right motors, accounting for the fact the different sides of the drivetrain are flipped.
		//TODO
		
	}

}
