package advent2

class KeyPad {
    def keys= [
            [1, 2, 3],
            [4, 5, 6],
            [7, 8, 9]
    ]
    int posX = 1
    int posY = 1

    int moveIfPossible(int current, int newPos) {
        if (newPos < 0 || newPos > 2)
            return current
        else
            return newPos
    }

    void up() {
        posY = moveIfPossible(posY, posY-1)
    }

    void down() {
        posY = moveIfPossible(posY, posY+1)
    }

    void left() {
        posX = moveIfPossible(posX, posX-1)
    }

    void right() {
        posX = moveIfPossible(posX, posX+1)
    }

    int getKey() {
        keys[posY][posX]
    }
}
