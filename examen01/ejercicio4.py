edad: int
genero: int
vacuna: str
edad=int(input("¿cuantos años tiene?"))
genero=int(input("usted es hombre=1 o mujer=2 /porfavor introduzca el numerito/ : "))
if edad>70:
    vacuna=(f"La vacuna que le toca es el tipo C")
elif edad>16 and edad<=59:
    if genero<=1:
        vacuna=(f"la vacuna que le toca es el tipo B")
    elif genero<=2:
        vacuna=(f"la vacuna que le toca es el tipo A")
elif edad<16:
    vacuna=(f"la vacuna que le toca es el tipo A")
print(f"{vacuna}")

