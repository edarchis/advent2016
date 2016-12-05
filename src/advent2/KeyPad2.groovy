package advent2

class KeyPad2 {
    def keys = [
            [null, null, '1', null, null],
            [null, '2', '3', '4', null],
            ['5', '6', '7', '8', '9'],
            [null, 'A', 'B', 'C', null],
            [null, null, 'D', null, null]
    ]
    int posX = 0
    int posY = 2

    boolean canMove(int newX, int newY) {
        return (newX >= 0 && newX < 5 && newY >= 0 && newY < 5 && (keys[newY][newX] != null))
    }

    void up() {
        if (canMove(posX, posY - 1)) {
            posY--
            println "moving up to $posX, $posY"
        } else {
            println "not moving up"
        }
    }

    void down() {
        if (canMove(posX, posY + 1)) {
            posY++
            println "moving down to $posX, $posY"
        } else {
            println "not moving down"
        }
    }

    void left() {
        if (canMove(posX - 1, posY)) {
            posX--
            println "moving left to $posX, $posY"
        } else {
            println "not moving left"
        }
    }

    void right() {
        if (canMove(posX + 1, posY)) {
            posX++
            println "moving right to $posX, $posY"
        } else {
            println "not moving right"
        }
    }

    def getKey() {
        keys[posY][posX]
    }
}
