package advent1

import com.sun.tools.javac.util.Pair

class Bunny {
    int posX
    int posY
    int direction

    Bunny() {
        posX = 0
        posY = 0
        direction = 0
    }

    int turnLeft() {
        direction--
        normalizeDirection()
    }

    int turnRight() {
        direction++
        normalizeDirection()
    }

    private normalizeDirection() {
        direction = (direction + 4) % 4
    }

    Pair<Integer, Integer> forward(int steps) {
        Pair<Integer, Integer> newPos = null
        for (int i = 0; i < steps; i++) {
            newPos = forward()
        }
        return newPos
    }

    Pair<Integer, Integer> forward() {
        switch (direction) {
            case 0:
                posY ++
                break
            case 1:
                posX ++
                break
            case 2:
                posY --
                break
            case 3:
                posX --
                break
            default:
                throw new RuntimeException("WTF is this direction ?")
        }
        return new Pair<Integer, Integer>(posX, posY)
    }
}
