package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {

        double leftStickFliped = -gamepad1.left_stick_y;
        double rightStickFliped = -gamepad1.right_stick_y;

        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("y", leftStickFliped);
        telemetry.addData("a bottom pressed", gamepad1.a);
        telemetry.addData("x", gamepad1.right_stick_x);
        telemetry.addData("y", rightStickFliped);
        telemetry.addData("left and right diffrance", gamepad1.left_stick_x - gamepad1.left_stick_x);
    }
}
