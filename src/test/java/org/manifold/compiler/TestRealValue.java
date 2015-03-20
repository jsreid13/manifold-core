package org.manifold.compiler;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.gson.JsonPrimitive;

public class TestRealValue {
  private static final RealValue real = new RealValue(Math.PI);

  @Test
  public void testToDouble() {
    assertEquals(Math.PI, real.toDouble(), 0);
  }

  @Test
  public void testGetType() {
    assertThat(
        real.getType(),
        instanceOf(RealTypeValue.class));
  }

  @Test
  public void testIsCompiletimeEvaluable() {
    assertTrue(real.isElaborationtimeKnowable());
  }

  @Test
  public void testIsNotSynthesizable() {
    assertFalse(real.isRuntimeKnowable());
  }

  @Test
  public void testToJson() throws Exception {
    JsonPrimitive o = (JsonPrimitive) real.toJson();
    RealTypeValue realType = RealTypeValue.getInstance();

    RealValue realCopy = (RealValue) realType.instantiate(o);
    assertTrue("should serialize real numbers as strings in the intermediate",
        o.isString());
    assertEquals(realCopy.toDouble(), real.toDouble(), 0);
  }
}
