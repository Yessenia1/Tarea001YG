import math
a: float
b: float
c: float
pregunta: str
a=float(input("introduzca un numero: "))
b=float(input("introduzca otro número: "))
pregunta=str(input("Introduzca la operación matematica +,-,*,/, ^ (potencia), R (raiz cuadrada),% modulo de dos) : "))
if pregunta=="+":
    c=a+b
elif pregunta=="-":
    c=a-b
elif pregunta=="*":
    c=a*b
elif pregunta=="/":
    c=a/b
elif pregunta=="^":
    c=pow(a,b)
elif pregunta=="R":
    c=math.sqrt(a)
elif pregunta=="%":
    c=a%2
print(f"el resultado de la operación es {c}")