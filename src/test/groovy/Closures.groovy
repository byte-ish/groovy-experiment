def myClosure = {
    println("my closure")
    println new Date()
}
myClosure()
println("*********************************************")
(1..3).each {
    myClosure()
}
println("*********************************************")
//Another way
def usingFI = {
    param -> println("Hello ${param}")
}
usingFI.call("Ish")