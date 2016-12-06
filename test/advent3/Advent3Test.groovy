package advent3

import org.junit.Test

class Advent3Test {
    @Test
    void isTriangle() {
        Advent3 advent3 = new Advent3()
        assert !advent3.isTriangle([10, 5, 25] as Integer[])
        assert !advent3.isTriangle([25, 5, 10] as Integer[])
        assert advent3.isTriangle([25, 15, 15] as Integer[])
    }

    @Test
    void advent3asample1() {
        String input = '  10   5  25'
        Advent3 advent3 = new Advent3()
        def result = advent3.advent3a(input)
        assert result == 0
    }

    @Test
    void advent3a() {
        String input = this.getClass().getResource('advent3.txt').text
        Advent3 advent3 = new Advent3()
        def result = advent3.advent3a(input)
        assert result == 862
    }

    @Test
    void advent3b() {
        String input = this.getClass().getResource('advent3.txt').text
        Advent3 advent3 = new Advent3()
        def result = advent3.advent3b(input)
        assert result == 1577
    }
}
