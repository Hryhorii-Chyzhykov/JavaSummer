package test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import lec3.*;

import static org.junit.Assert.*;

public class ModelTest {
    private Model model;
    @Before
    public void init() {
        Model model = new Model();
        //View view = new View();
       // Controller Controller = new Controller(model, view);
    }

    @Test
    public void checkValue() {
    }

    @Test
    public void testRandomValue() {
        //model.setMaxValue(GlobalConstsnts.MAX_GLOBAL_VALUE);
        //model.setMinValue(GlobalConstsnts.MIN_GLOBAL_VALUE);
        for (int i = 0; i < 10; i++){
           int res = model.randomValue();
           //boolean inRange = res > GlobalConstsnts.MIN_GLOBAL_VALUE && res < GlobalConstsnts.MAX_GLOBAL_VALUE;
            //int res = i;
            boolean inRange = res == i;
            Assert.assertTrue(inRange);
        }
    }
}