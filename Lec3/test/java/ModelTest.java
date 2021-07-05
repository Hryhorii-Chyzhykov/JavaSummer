package test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import lec3.*;

import static org.junit.Assert.*;

public class ModelTest {
    public Model model;

    @Before
    public void init() {
        model = new Model();
        model.setMaxValue(GlobalConstsnts.MAX_GLOBAL_VALUE);
        model.setMinValue(GlobalConstsnts.MIN_GLOBAL_VALUE);
    }

    @Test
    public void testCompareValueIsFalse() {
        for (int i = 0; i < 10; i++){
            int res = model.randomValue();
            model.setValue(res);
            Assert.assertFalse(model.compareValue(res));
        }

    }

    @Test
    public void testCompareValueIsTrue() {
        for (int i = 100; i < 10000; i++){
            int res = model.randomValue();
            model.setValue(res);
            Assert.assertTrue(model.compareValue(i));
        }

    }

    @Test
    public void testRandomValue() {

        for (int i = 0; i < 10; i++){
           int res = model.randomValue();
           boolean inRange = res > GlobalConstsnts.MIN_GLOBAL_VALUE && res < GlobalConstsnts.MAX_GLOBAL_VALUE;
            Assert.assertTrue(inRange);

        }
    }
}