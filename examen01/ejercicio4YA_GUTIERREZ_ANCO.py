#4.-Secretaría de salud requiere un algoritmo que permita determinar qué tipo de vacuna (A, B o C)
#aplicar a una persona, considerando que, si es mayor de 70, sin importar el sexo, se le aplica el tipo C;
#si tiene entre 16 y 69 años, y es mujer se le aplica el tipo B, y si es hombre, la A; sí es menor de 16
#años, se aplica el tipo A sin importar el sexo.
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

