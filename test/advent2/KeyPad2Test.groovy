package advent2

import org.junit.Test

class KeyPad2Test {
    @Test
    void canMove() throws Exception {
        KeyPad2 keyPad2 = new KeyPad2()
        assert !keyPad2.canMove(0, 1)
        assert keyPad2.canMove(3, 3)
        assert !keyPad2.canMove(0, 0)
        assert !keyPad2.canMove(-1, 3)
    }

    @Test
    void upShouldntWork() {
        KeyPad2 keyPad2 = new KeyPad2()
        keyPad2.up()
        assert keyPad2.posX == 0
        assert keyPad2.posY == 2
    }
}