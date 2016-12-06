package advent6

class Advent6 {
    String decode(String input) {
        def letterFreq = [].withDefault{ [:].withDefault {0} }
        input.eachLine{ it.getChars().eachWithIndex { Character entry, int i -> letterFreq[i][entry]++ } }
        letterFreq.collect{it.max { it.value }.key}.join("")
    }

    String decode2(String input) {
        def letterFreq = [].withDefault{ [:].withDefault {0} }
        input.eachLine{ it.getChars().eachWithIndex { Character entry, int i -> letterFreq[i][entry]++ } }
        letterFreq.collect{it.min { it.value }.key}.join("")
    }

}
