package advent1

import com.sun.tools.javac.util.Pair

class Advent1 {

    static final int advent1a(String input) {
        String[] split = input.split(', ')
        Bunny bunny = new Bunny()
        for (String item : split) {
            if (item[0] == 'L') {
                bunny.turnLeft()
            } else {
                assert item[0] == 'R'
                bunny.turnRight()
            }
            int offset = Integer.parseInt(item.substring(1))
            Pair<Integer, Integer> newPos = bunny.forward(offset)
            println "$item -> (${newPos.fst}, ${newPos.snd})"
        }

        int finalDistance = Math.abs(bunny.posX) + Math.abs(bunny.posY)
        println "Final distance: " + finalDistance
        return finalDistance
    }

    static final int advent1b(String input) {
        String[] split = input.split(', ')
        Bunny bunny = new Bunny()
        HashMap<Pair<Integer, Integer>, Integer> visitedLocations = new HashMap<>()
        for (String item : split) {
            if (item[0] == 'L') {
                bunny.turnLeft()
            } else {
                assert item[0] == 'R'
                bunny.turnRight()
            }
            int offset = Integer.parseInt(item.substring(1))
            for (int i=0; i<offset; i++) {
                Pair<Integer, Integer> newPos = bunny.forward()
                println "$item -> (${newPos.fst}, ${newPos.snd})"
                if (visitedLocations.containsKey(newPos)) {
                    println "found already visited location: ${newPos.fst}, ${newPos.snd}"
                    int finalDistance = Math.abs(bunny.posX) + Math.abs(bunny.posY)
                    println "Final distance: " + finalDistance
                    return finalDistance
                }
                visitedLocations.put(newPos, 1)
            }
        }
        return -1
    }
}