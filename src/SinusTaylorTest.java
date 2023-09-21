import static org.junit.jupiter.api.Assertions.*;

class SinusTaylorTest {
    @org.junit.jupiter.api.Test
     void getSinusTest1() {
        Sinus_taylor a = new Sinus_taylor();
        assertTrue(a.getSinus(3.14, 0.00001) - (Math.sin(3.14)/3.14) < 0.00001);
    }
    @org.junit.jupiter.api.Test
    void getSinusTest2() {
        Sinus_taylor a = new Sinus_taylor();
        assertTrue(a.getSinus(0.00000001, 0.001) - (Math.sin(0.00000001)/0.00000001) < 0.001);
    }
    @org.junit.jupiter.api.Test
    void getSinusTest3() {
        Sinus_taylor a = new Sinus_taylor();
        assertTrue(a.getSinus(150, 0.0001) - (Math.sin(150)/150) < 0.0001);
    }
    @org.junit.jupiter.api.Test
    void getSinusTest4() {
        Sinus_taylor a = new Sinus_taylor();
        assertTrue(a.getSinus(150, 0.00000000001) - (Math.sin(150)/150) < 0.00000000001);
    }
    @org.junit.jupiter.api.Test
    void getSinusTest5() {
        Sinus_taylor a = new Sinus_taylor();
        assertTrue(a.getSinus(-200, 0.00000000001) - (Math.sin(-200)/-200) < 0.00000000001);
    }
    @org.junit.jupiter.api.Test
    void getSinusTest6() {
        Sinus_taylor a = new Sinus_taylor();
        assertTrue(a.getSinus(10.666, 0.00001) - (Math.sin(10.666)/10.666) < 0.00001);
    }
}