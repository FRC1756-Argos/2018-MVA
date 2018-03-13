# Java Minimum Viable Autonomous

## Attribution

`JaciMVA_PWM.java` and `JaciMVA_CAN.java` are from @JacisNonsense as part of the [Open-RIO/2018-Minimum-Viable-Autonomous](https://github.com/Open-RIO/2018-Minimum-Viable-Autonomous) project.  The integration guide is also derived from that project.  I've included them here to try and collect all relevant code in one place.

## How To Integrate

### `JaciMVA_PWM.java` and `JaciMVA_CAN.java`

Modify the `speed` and `timeout` to your preference. Add your motor controller variables (separated by a comma) in the `/* left motors */` and `/* right motors */` sections. (e.g. `/* left motors */` becomes `left1, left2, left3`)

Note: if your motor controllers already call `setInverted`, remove the `-` from the right motors.

***Test this to make sure the motors are spinning in the correct direction. If they are not, set `speed` to a negative value***

Copy and paste the contents into your main Robot Java file. No additional imports are required.

## Next Steps

## Issue Resolution

If you have problems integrating this into your code, see the [Open-RIO/2018-Minimum-Viable-Autonomous](https://github.com/Open-RIO/2018-Minimum-Viable-Autonomous) project
