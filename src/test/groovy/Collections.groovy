def companies = ["Adobe", "Google", "Microsoft"];

for (int i = 0; i < companies.size(); i++) {
    def myString = "Try for "
    println(myString + companies[i])
    println("########################################")
    println "Hello, $myString $companies[i]"
    println("########################################")
    println "Hello, $myString ${companies[i]}"

}

//New way
println("**********************************************")
for (com in companies) {
    println(com)
}

