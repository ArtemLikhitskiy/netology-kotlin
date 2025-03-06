package com.likhitskiy.netologykotlin

const val TYPE_1 = "Maestro"
const val TYPE_2 = "MasterCard"
const val MAX_AMOUNT_TYPE_1_2 = 75000_00
const val FIX_COMMISSION_TYPE_1_2 = 20_00
const val COMMISSION_PERCENTAGE_TYPE_1 = 0.06
const val TYPE_3 = "VISA"
const val TYPE_4 = "Мир"
const val FIX_COMMISSION_TYPE_3_4 = 35_00
const val COMMISSION_PERCENTAGE_TYPE_3_4 = 0.0075
const val TYPE_5 = "VK Pay"
const val COMMISSION_PERCENTAGE_TYPE_5 = 0

fun main() {
    val amountTransfer = 50_00
    val amountOfPreviousPurchases = 100_000_00
    val type = TYPE_1

    println("=============================================================================================");
    println("Сумма перевода: " + convertToRubKop(amountTransfer));
    println("Тип карты: $type");
    println("Сумма предыдущих переводов в этом месяце: " + convertToRubKop(amountOfPreviousPurchases));
    println("Комиссия: " + convertToRubKop(calcCommission(type, amountOfPreviousPurchases, amountTransfer)));
    println("=============================================================================================");
}

fun convertToRubKop(amount : Int) : String{
    return (amount / 100).toString() + " руб " + amount % 100 + " коп"
}
fun calcCommission(type : String = TYPE_5,
                   amountOfPreviousPurchases : Int = 0,
                   amountTransfer : Int) : Int{
    when(type){
        TYPE_1, TYPE_2 -> {
            if ((amountOfPreviousPurchases + amountTransfer) in (1..MAX_AMOUNT_TYPE_1_2)) return 0
            else return ( FIX_COMMISSION_TYPE_1_2 + COMMISSION_PERCENTAGE_TYPE_1 * amountTransfer).toInt()
        }
        TYPE_3, TYPE_4 -> {
            if (COMMISSION_PERCENTAGE_TYPE_3_4 * amountTransfer > FIX_COMMISSION_TYPE_3_4)
                return (COMMISSION_PERCENTAGE_TYPE_3_4 * amountTransfer).toInt()
            else return  FIX_COMMISSION_TYPE_3_4
        }
        TYPE_5 -> {
            return COMMISSION_PERCENTAGE_TYPE_5
        }
    }
    return 0
}
