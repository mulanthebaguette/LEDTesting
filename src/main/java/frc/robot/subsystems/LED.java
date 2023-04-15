// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.led.CANdle;
import com.ctre.phoenix.led.FireAnimation;
import com.ctre.phoenix.led.ColorFlowAnimation;
import com.ctre.phoenix.led.RainbowAnimation;

public class LED extends SubsystemBase {
  CANdle mCaNdle;
  RainbowAnimation mRainbowAnimation = new RainbowAnimation();
  FireAnimation mFireAnimation = new FireAnimation();
  ColorFlowAnimation yellowAnimate = new ColorFlowAnimation(252, 229, 28);
  ColorFlowAnimation purpleAnimate = new ColorFlowAnimation(94, 12, 166);

  //Color purple = new Color(null);

  /** Creates a new LED. */
  public LED() {
    mCaNdle = new CANdle(1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void animateRainbow(){
    mCaNdle.animate(mRainbowAnimation);
  }

  public void turnYellow(){
    mCaNdle.setLEDs(252, 229, 28);
  }

  public void turnPurple(){
    mCaNdle.setLEDs(94, 12, 166);
    //mCaNdle.setLEDs(0, 0, 0, 0, 0, 0);
  }

  public void resetLED(){
    mCaNdle.setLEDs(0, 0, 0, 0, 0, 0);
  }

  public void resetAnimation(){
    mCaNdle.clearAnimation(0);
  }

  public void yellowAnimation(){
    mCaNdle.animate(yellowAnimate);
  }

  public void purpleAnimation(){
    mCaNdle.animate(purpleAnimate);
  }


}
