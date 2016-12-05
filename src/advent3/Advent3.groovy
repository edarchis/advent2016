package advent3

class Advent3 {
    def advent3a(String input) {
        String[] lines = input.split("\n")
        int numTriangles = 0
        for (String line : lines) {
            Integer[] values = line.trim().split(/ +/).collect { it -> Integer.parseInt(it) }
            if (isTriangle(values)) {
                println "is triangle"
                numTriangles++
            } else {
                println "is not !"
            }
        }
        return numTriangles
    }

    def advent3b(String input) {
        String[] lines = input.split("\n")
        Integer[][] valueTable = lines.collect{line -> line.trim().split(/ +/).collect { it -> Integer.parseInt(it) }}
        int numTriangles = 0
        for (int i=0; i<3; i++) {
            for (int j=0; j<valueTable.length; j+=3) {
                if (isTriangle([valueTable[j][i],valueTable[j+1][i],valueTable[j+2][i]] as Integer[])) {
                    println "is triangle"
                    numTriangles++
                } else {
                    println "is not !"
                }
            }
        }
        return numTriangles
    }

    boolean isTriangle(Integer[] lengths) {
        Integer[] sorted = lengths.sort()
        return ((sorted[0] + sorted[1]) > sorted[2])
    }
}
