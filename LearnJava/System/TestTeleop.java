package org.firstinspires.ftc.teamcode.Reference.LearnJava.System;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="TestTeleop", group="Iterative Opmode")

public class TestTeleop extends OpMode{

    private TestArmSubsystem arm = null;
    private TestIntakeSubsystem intake = null;

    @Override
    public void init() {

        arm = new TestArmSubsystem(hardwareMap);
        intake = new TestIntakeSubsystem(hardwareMap);

    }

    @Override
    public void loop() {

        arm.Teleop(gamepad2);
        intake.Teleop(gamepad2);

    }
}
