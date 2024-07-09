import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TwoSumTest {

        @Test
        fun firstTestCase() {
            val result = twoSum(intArrayOf(2, 7, 11, 15), 9)
            assertArrayEquals(intArrayOf(0, 1), result)
        }

        @Test
        fun secondTestCase(){
            val result = twoSum(intArrayOf(3,2,4), 6)
            assertArrayEquals(intArrayOf(1, 2), result)
        }

        @Test
        fun threeTestCase(){
            val result = twoSum(intArrayOf(3,3), 6)
            assertArrayEquals(intArrayOf(0, 1), result)
        }

    }