edad: int
genero: str
vacuna: str
edad=int(input("¿cuantos años tiene?"))
genero=str(input("usted es hombre o mujer : "))
if edad>70:
    vacuna=(f"La vacuna que le toca es el tipo C")
elif edad>16 and edad<=59:
    if genero=="hombre":
        vacuna=(f"la vacuna que le toca es el tipo B")
    elif genero=="mujer":
        vacuna=(f"la vacuna que le toca es el tipo A")
elif edad<16:
    vacuna=(f"la vacuna que le toca es el tipo A")
print(f"{vacuna}")

