// 활용 - 지정한 폴더에서 .class 파일만 찾아 출력하라.
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0740 {

  public static void main(String[] args) throws Exception {

    File dir = new File("bin/main");
    System.out.println(dir.getCanonicalPath());

    printClasses(dir, "");
  }

  static void printClasses(File dir, String packageName) {
    if(packageName.length() > 0) {
      packageName += ".";
    }

    File[] files = dir.listFiles(
        file -> file.isFile() && (file.getName().endsWith(".class")));

    for (File f : files) {
      if(f.isDirectory()) {
        printClasses(f, packageName + f.getName());
      } else {
        System.out.println(packageName + "." + f.getName().replace(".class", ""));
      }
    }



  }

}

