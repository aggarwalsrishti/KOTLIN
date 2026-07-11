class BankAccount{
    private var balance: Double= 0.0
    private var accountHolder: String=""

    //setter
    fun setAccountHolder(name: String){
        if (name.isNotEmpty()){
            accountHolder=name
        }
        else{
            println("Name is empty")
        }
    }

    //getter
    fun getAccountHolder(): String{
        return accountHolder
    }

    fun deposit(amount: Double){
        if (amount>0.0){
            balance += amount
        }
        else{
            println("Amount is less than 0")
        }
    }
    //getter
    fun getBalance():Double{
        return balance
    }
}
fun main(){
    val account = BankAccount()
    account.setAccountHolder("RAJ GUPTA")
    println("Account Holder: ${account.getAccountHolder()}")
    account.deposit(2500.0)
    println("Deposit: ${account.getBalance()}")


}