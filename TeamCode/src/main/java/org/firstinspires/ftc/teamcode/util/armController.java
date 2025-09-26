package org.firstinspires.ftc.teamcode.util;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class armController {
    HardwareMap hardwareMap;
    enum armState{
        intake,
        outtake,
        shoot,
        shootFar,
        shootClose
    }
    CRServo intakeServo;
    Servo rampServo;

    DcMotor advanceMotor;
    DcMotor launchMotor;

    double farShootAngle = 1; //placeholder
    double closeShootAngle = 1; //placeholder

    double farShootSpeed = 1; //placeholder
    double closeShootSpeed = 1; //placeholder
}
