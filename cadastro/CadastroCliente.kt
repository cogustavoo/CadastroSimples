class Cadastro(){

    fun addCliente(){
        println("por favor digite o nome do cliente")
        val nome = readLine().toString()
        println("por favor digite o CPF do cliente")
        val cpf = readLine().toString()
        println("por favor digite a idade do cliente")
        val idade = readLine().toString()
        users.add(Cliente(nome, cpf, idade))
    }

    fun mostrarClientes(){
        for (n in users){
            println(n.toString())
        }
    }

}



