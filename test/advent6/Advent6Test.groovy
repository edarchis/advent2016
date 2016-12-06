package advent6

import org.junit.Test

class Advent6Test {
    @Test
    void advent6Sample() {
        String input='''eedadn
drvtee
eandsr
raavrd
atevrs
tsrnev
sdttsa
rasrtv
nssdts
ntnada
svetve
tesnvt
vntsnd
vrdear
dvrsen
enarar
'''

        Advent6 advent6 = new Advent6()
        assert advent6.decode(input) == 'easter'
    }

    @Test
    void advent6() {
        String input = this.getClass().getResource('advent6.txt').text
        Advent6 advent6 = new Advent6()
        assert advent6.decode(input) == 'asvcbhvg'
    }
}
