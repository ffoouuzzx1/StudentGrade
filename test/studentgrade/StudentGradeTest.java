package studentgrade;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/* JUnit 4.13.1 */
public class StudentGradeTest {

    @BeforeClass
    public static void setUpClass() {
        System.out.println("---Start Class Test---");
    }

    @Before
    public void setUp() {
        System.out.println("--Start Test--");
    }

    @Test
    public void test_mark_between_90_and_100_returns_A() {
        System.out.println("90\n95\n100");
        assertEquals("A", StudentGrade.getGrade(90));
        assertEquals("A", StudentGrade.getGrade(95));
        assertEquals("A", StudentGrade.getGrade(100));
    }

    @Test
    public void test_mark_between_80_and_89_returns_B() {
        System.out.println("80\n85\n89");
        assertEquals("B", StudentGrade.getGrade(80));
        assertEquals("B", StudentGrade.getGrade(85));
        assertEquals("B", StudentGrade.getGrade(89));
    }

    @Test
    public void test_negative_mark_returns_F() {
        System.out.println("-1\n-50\n-100");
        assertEquals("F", StudentGrade.getGrade(-1));
        assertEquals("F", StudentGrade.getGrade(-50));
        assertEquals("F", StudentGrade.getGrade(-100));
    }

    @Test
    public void test_mark_greater_than_101_returns_F() {
        System.out.println("102\n150\n1000");
        assertEquals("F", StudentGrade.getGrade(102));
        assertEquals("F", StudentGrade.getGrade(150));
        assertEquals("F", StudentGrade.getGrade(1000));
    }

    @After
    public void tearDown() {
        System.out.println("--Finished Test--");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("---Finished Class Test---");
    }
}


