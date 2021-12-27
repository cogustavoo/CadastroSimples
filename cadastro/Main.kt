import kotlin.system.exitProcess
var users = mutableListOf<Cliente>()

fun main(args: Array<String>) {
    var run: Boolean = true
    while (run) {
        val texts = """
        |         menu 
        |         1- Cadastrar novo cliente
        |         2- mostrar clientes
        |         3- sair
        |""".trimMargin()
        println(texts)


        Cadastro().mostrarClientes()
       val enteredString = readLine()
        when (enteredString) {
            "1" -> Cadastro().addCliente()
            "2" -> Cadastro().mostrarClientes()
            "3" -> run = false
        }

    }
}