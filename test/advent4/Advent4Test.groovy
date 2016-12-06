package advent4

import org.junit.Test

class Advent4Test {
    @Test
    void advent4aSamples() {
        String sample1 = 'aaaaa-bbb-z-y-x-123[abxyz]'
        String sample2 = 'a-b-c-d-e-f-g-h-987[abcde]'
        String sample3 = 'not-a-real-room-404[oarel]'
        String sample4 = 'totally-real-room-200[decoy]'

        Advent4 advent4 = new Advent4()
        assert advent4.isValidRoom(sample1)
        assert advent4.isValidRoom(sample2)
        assert advent4.isValidRoom(sample3)
        assert !advent4.isValidRoom(sample4)
    }

    @Test
    void advent4a() {
        String input = this.getClass().getResource('advent4.txt').text
        println input
    }
}
