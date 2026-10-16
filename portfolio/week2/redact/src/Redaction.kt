// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(d: str, t:str, redactChar: Char = 'X' ): String{
    if(target.isEmpty()) return d
    val replace = redactChar.toString().repeat(t.length)
    return d.replace(t, replace)

}