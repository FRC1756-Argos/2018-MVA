# LabVIEW Minimum Viable Autonomous

## How To Integrate

Replace `Autonomous Independent.vi` in your robot project with the file provided here.  `Robot Main.vi` will automatically call this VI and run through the steps on the front panel at the start of autonomous.

If you are not using the default robot drive motor name "Left and Right Motors" in the `Begin.vi` initialization, you will need to modify that name constant for the Get RefNum block.

Double check that the motors all drive forward.  If not, you may need to change the joystick Y axis value to a positive value.  Make sure you save this as the default so the code is saved to the VI.

## Next Steps

If you want to do more in autonomous, you can add additional steps to the array on the front panel of `Autonomous Independent.vi`.  Note that if you do this, you will need to set the value as default.

## Issue Resolution

If you have problems integrating this into your code, please contact @dkt01 or another member of @FRC1756-Argos
