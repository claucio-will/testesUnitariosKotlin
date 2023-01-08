import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {


    @Test
    @DisplayName("Testar todos os cenarios da portaria")
    fun testPortaria() {
        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")
        Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.")
        Assertions.assertEquals(portaria(25, "comum", "xt225"), "Welcome.")
        Assertions.assertEquals(portaria(25, "comum", "555556"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "xt52522"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "55454"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "xl5556"), "Welcome.")
        Assertions.assertEquals(portaria(25, "luxo", "xl545454"), "Welcome.")


        //Testa todos de uma vez, caso um falhe a execução é parada
        Assertions.assertAll(
            { Assertions.assertEquals(portaria(15, "", ""), "Negado.") },
            { Assertions.assertEquals(portaria(20, "", ""), "Negado.") },
            { Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.") },
            { Assertions.assertEquals(portaria(25, "comum", "xt225"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "comum", "555556"), "Negado.") },
            { Assertions.assertEquals(portaria(25, "premium", "xt52522"), "Negado.") },
            { Assertions.assertEquals(portaria(25, "premium", "55454"), "Negado.") },
            { Assertions.assertEquals(portaria(25, "premium", "xl5556"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "luxo", "xl545454"), "Welcome.") }

        )
    }
}