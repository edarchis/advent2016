package advent2

class Advent2 {
    static def advent2a(String input) {
        KeyPad keyPad = new KeyPad()
        String[] lines = input.split("\n")
        long result = 0
        for (String line : lines) {
            for (char c : line.getChars()) {
                switch (c) {
                    case 'U':
                        keyPad.up()
                        break
                    case 'D':
                        keyPad.down()
                        break
                    case 'L':
                        keyPad.left()
                        break
                    case 'R':
                        keyPad.right()
                        break
                    default:
                        println "unexpected character: ${c}"
                }
            }
            println "result: ${keyPad.getKey()} for line ${line}"
            result = (result*10)+keyPad.getKey()
        }
        return result
    }

    static def advent2b(String input) {
        KeyPad2 keyPad = new KeyPad2()
        String[] lines = input.split("\n")
        String result = ""
        for (String line : lines) {
            for (char c : line.getChars()) {
                switch (c) {
                    case 'U':
                        keyPad.up()
                        break
                    case 'D':
                        keyPad.down()
                        break
                    case 'L':
                        keyPad.left()
                        break
                    case 'R':
                        keyPad.right()
                        break
                    default:
                        println "unexpected character: ${c}"
                }
            }
            println "result: ${keyPad.getKey()} for line ${line}"
            result = result + keyPad.getKey()
        }
        return result
    }
}
