class ContaConrrente(val numeroConta: Int, var saldo: Double, ) {
    fun imprimir (){
        println("conta: $numeroConta \nSaldo: saldo")
    }
    
    fun depositar(valor: Double){
        saldo = saldo + valor 
    }
	fun sacar (valor: Double){
        saldo = saldo- valor
    }
  
  }
}
