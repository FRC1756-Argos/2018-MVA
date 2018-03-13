// Put this in your Robot main class, replacing the autonomousInit() and autonomousPeriodic() methods.
long autoStart = 0;
@Override
public void autonomousInit() {
    autoStart = System.currentTimeMillis();
}

@Override
public void autonomousPeriodic() {
    // Speed = Motor Speed (-1 to 1). Timeout = amount of time to move (in seconds)
    double speed = 1.0, timeout = 10;
    if ((System.currentTimeMillis() - autoStart) < (timeout * 1000)) {
        java.util.Arrays.stream((new Object[]{ /* left motors */})).forEach((Object s) -> ((com.ctre.phoenix.motorcontrol.IMotorController)s).set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, speed));
        java.util.Arrays.stream((new Object[]{ /* right motors */})).forEach((Object s) -> ((com.ctre.phoenix.motorcontrol.IMotorController)s).set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, -speed));
    }
}