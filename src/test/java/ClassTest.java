import static org.junit.Assert.*;

import org.junit.Test;

import proyect.blueprint.JavaClass;

public class ClassTest {
    @Test
    public void ClassTest(){// TODO
        JavaClass test= new JavaClass();
        assertNotEquals(null, test);
    }
}
