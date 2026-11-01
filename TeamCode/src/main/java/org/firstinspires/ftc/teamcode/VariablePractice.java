package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 4982;
        double motorSpeed = 0.75;
        boolean clawCLosed = true;
        String name= "cafe bot";
        int motorAngle = 179;

        telemetry.addData("Motor Angle", motorAngle);
        telemetry.addData("Team number", teamNumber);
        telemetry.addData("Motor speed", motorSpeed);
        telemetry.addData("Claw closed", clawCLosed);
        telemetry.addData("name", name);
    }

    @Override
    public void loop() {

    }
}
