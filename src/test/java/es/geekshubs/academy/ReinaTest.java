package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReinaTest {

  private Reina reina;

  @Before
  public void setUp() throws Exception {
    this.reina = new Reina();
  }

  @After
  public void tearDown() throws Exception {
    this.reina = null;
  }

  @Test public void test1 () {
    final int result = this.reina.apply(1,1);
    assertEquals(result, 0);
  }

  @Test public void test2 () {
    final int result = this.reina.apply(1,2);
    assertEquals(result, 2);
  }

  @Test public void test3 () {
    final int result = this.reina.apply(2,1);
    assertEquals(result, 2);
  }

  @Test public void test4 () {
    final int result = this.reina.apply(2,2);
    assertEquals(result, 12);
  }

  @Test public void test5 () {
    final int result = this.reina.apply(2,3);
    assertEquals(result, 26);
  }


  @Test public void test6 () {
    final int result = this.reina.apply(3,1);
    assertEquals(result, 6);
  }

  @Test public void test7 () {
    final int result = this.reina.apply(3,2);
    assertEquals(result, 26);
  }

  @Test public void test8 () {
    final int result = this.reina.apply(3,3);
    assertEquals(result, 56);
  }

  @Test public void test9 () {
    final int result = this.reina.apply(4,1);
    assertEquals(result, 12);
  }

  @Test public void test10 () {
    final int result = this.reina.apply(4,2);
    assertEquals(result, 44);
  }

  @Test public void test11 () {
    final int result = this.reina.apply(4,3);
    assertEquals(result, 92);
  }

  @Test public void test12 () {
    final int result = this.reina.apply(4,4);
    assertEquals(result, 152);
  }

  @Test public void test13 () {
    final int result = this.reina.apply(1,4);
    assertEquals(result, 12);
  }

  @Test public void test14 () {
    final int result = this.reina.apply(2,4);
    assertEquals(result, 44);
  }

  @Test public void test15 () {
    final int result = this.reina.apply(3,4);
    assertEquals(result, 92);
  }

  @Test public void test16 () {
    final int result = this.reina.apply(5,1);
    assertEquals(result, 20);
  }

  @Test public void test17 () {
    final int result = this.reina.apply(5,2);
    assertEquals(result, 66);
  }

  @Test public void test18 () {
    final int result = this.reina.apply(5,3);
    assertEquals(result, 134);
  }

  @Test public void test19 () {
    final int result = this.reina.apply(5,4);
    assertEquals(result, 220);
  }

  @Test public void test20 () {
    final int result = this.reina.apply(5,5);
    assertEquals(result, 320);
  }

  @Test public void test21 () {
    final int result = this.reina.apply(1,5);
    assertEquals(result, 20);
  }

  @Test public void test22 () {
    final int result = this.reina.apply(2,5);
    assertEquals(result, 66);
  }

  @Test public void test23 () {
    final int result = this.reina.apply(3,5);
    assertEquals(result, 134);
  }

  @Test public void test24 () {
    final int result = this.reina.apply(4,5);
    assertEquals(result, 220);
  }

  @Test public void test25 () {
    final int result = this.reina.apply(6,1);
    assertEquals(result, 30);
  }

  @Test public void test26 () {
    final int result = this.reina.apply(6,2);
    assertEquals(result, 92);
  }

  @Test public void test27 () {
    final int result = this.reina.apply(6,3);
    assertEquals(result, 182);
  }

  @Test public void test28 () {
    final int result = this.reina.apply(6,4);
    assertEquals(result, 296);
  }

  @Test public void test29 () {
    final int result = this.reina.apply(6,5);
    assertEquals(result, 430);
  }

  @Test public void test30 () {
    final int result = this.reina.apply(6,6);
    assertEquals(result, 580);
  }

  @Test public void test31 () {
    final int result = this.reina.apply(7,1);
    assertEquals(result, 42);
  }

  @Test public void test32 () {
    final int result = this.reina.apply(7,2);
    assertEquals(result, 122);
  }

  @Test public void test33 () {
    final int result = this.reina.apply(7,3);
    assertEquals(result, 236);
  }

  @Test public void test34 () {
    final int result = this.reina.apply(7,4);
    assertEquals(result, 380);
  }

  @Test public void test35 () {
    final int result = this.reina.apply(7,5);
    assertEquals(result, 550);
  }

  @Test public void test36 () {
    final int result = this.reina.apply(7,6);
    assertEquals(result, 742);
  }

  @Test public void test37 () {
    final int result = this.reina.apply(7,7);
    assertEquals(result, 952);
  }

  @Test public void test38 () {
    final int result = this.reina.apply(8,1);
    assertEquals(result, 56);
  }

  @Test public void test39 () {
    final int result = this.reina.apply(8,2);
    assertEquals(result, 156);
  }

  @Test public void test40 () {
    final int result = this.reina.apply(8,3);
    assertEquals(result, 296);
  }

  @Test public void test41 () {
    final int result = this.reina.apply(8,4);
    assertEquals(result, 472);
  }

  @Test public void test42 () {
    final int result = this.reina.apply(8,5);
    assertEquals(result, 680);
  }

  @Test public void test43 () {
    final int result = this.reina.apply(8,6);
    assertEquals(result, 916);
  }

  @Test public void test44 () {
    final int result = this.reina.apply(8,7);
    assertEquals(result, 1176);
  }

  @Test public void test45 () {
    final int result = this.reina.apply(8,8);
    assertEquals(result, 1456);
  }

  @Test public void test46 () {
    final int result = this.reina.apply(9,1);
    assertEquals(result, 72);
  }

  @Test public void test47 () {
    final int result = this.reina.apply(9,2);
    assertEquals(result, 194);
  }

  @Test public void test48 () {
    final int result = this.reina.apply(9,3);
    assertEquals(result, 362);
  }

  @Test public void test49 () {
    final int result = this.reina.apply(9,4);
    assertEquals(result, 572);
  }

  @Test public void test50 () {
    final int result = this.reina.apply(9,5);
    assertEquals(result, 820);
  }

  @Test public void test51 () {
    final int result = this.reina.apply(9,6);
    assertEquals(result, 1102);
  }

  @Test public void test52 () {
    final int result = this.reina.apply(9,7);
    assertEquals(result, 1414);
  }

  @Test public void test53 () {
    final int result = this.reina.apply(9,8);
    assertEquals(result, 1752);
  }

  @Test public void test54 () {
    final int result = this.reina.apply(9,9);
    assertEquals(result, 2112);
  }

  @Test public void test55 () {
    final int result = this.reina.apply(10,1);
    assertEquals(result, 90);
  }

  @Test public void test56 () {
    final int result = this.reina.apply(10,2);
    assertEquals(result, 236);
  }

  @Test public void test57 () {
    final int result = this.reina.apply(10,3);
    assertEquals(result, 434);
  }

  @Test public void test58 () {
    final int result = this.reina.apply(10,4);
    assertEquals(result, 680);
  }

  @Test public void test59 () {
    final int result = this.reina.apply(10,5);
    assertEquals(result, 970);
  }

  @Test public void test60 () {
    final int result = this.reina.apply(10,6);
    assertEquals(result, 1300);
  }

  @Test public void test61 () {
    final int result = this.reina.apply(10,7);
    assertEquals(result, 1666);
  }

  @Test public void test62 () {
    final int result = this.reina.apply(10,8);
    assertEquals(result, 2064);
  }

  @Test public void test63 () {
    final int result = this.reina.apply(10,9);
    assertEquals(result, 2490);
  }

  @Test public void test64 () {
    final int result = this.reina.apply(10,10);
    assertEquals(result, 2940);
  }

  @Test public void test65 () {
    final int result = this.reina.apply(15,10);
    assertEquals(result, 5490);
  }

  @Test public void test66 () {
    final int result = this.reina.apply(20,7);
    assertEquals(result, 4956);
  }

  @Test public void test67 ()
  {
    final int result = this.reina.apply(20, 20);
    assertEquals(result, 25080);
  }
  
}