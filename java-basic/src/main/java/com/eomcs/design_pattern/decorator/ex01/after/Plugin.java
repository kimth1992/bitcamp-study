package com.eomcs.design_pattern.decorator.ex01.after;

public abstract class Plugin extends Printer{

  Printer origin;

  public Plugin(Printer origin) {
    this.origin = origin;
  }

}
