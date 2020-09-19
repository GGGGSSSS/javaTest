package com.company;

public class Zi extends Fu {
  int num = 10;
  int zz = 9;

  public Zi() {
    super();
    this.num = 20;
  }

  @Override
  public void show() {
    this.zz = zz;
    System.out.println(zz);
  }
}
