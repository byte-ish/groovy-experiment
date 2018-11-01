//Range of numbers
def numbers = 1..10
for (n in numbers) {
    println(n)
}
print("*****************************************************")
//Range of alphabets
def alphabets = 'a'..'z'
for (ch in alphabets) {
    println(ch)
}
print("*****************************************************")
//Ranges of enum
def enum DAYS {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}

def weekdays = DAYS.MON..DAYS.FRI
for (day in weekdays) {
    println(day)
}
println("EXTENTS:")
println(weekdays.from)
println(weekdays.to)

