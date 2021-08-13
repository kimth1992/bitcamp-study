package com.eomcs.oop.ex09.h;

public class Tico extends AbstractCar {

  public Tico(int gas, int engineOil, int breakOil) {
    this.gas = gas;
    this.engineOil = engineOil;
    this.brakeOil = breakOil;
  }

  @Override
  public void run() {
    System.out.println("붕붕~~ 잘 달린다!");


  }
}
