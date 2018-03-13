// Put this at the top of your file
#include <stdint.h>
#include <RobotController.h>

// Put this in your Robot main class, replacing the AutonomousInit() and AutonomousPeriodic() methods.
uint64_t autostart;
void AutonomousInit() override {
  autostart = ::frc::RobotController::GetFPGATime();
}

void AutonomousPeriodic() override {
  double speed = 1.0, timeout = 10;
  if ((::frc::RobotController::GetFPGATime() - autostart) < (uint64_t)(timeout * 1000000)) {
    for (auto l : { /* left motors (pointers) */ }) l->Set(speed);
    for (auto r : { /* right motors (pointers) */ }) r->Set(-speed);
  }
}
