#3.-Diseñar un algoritmo que permita calcular una operación aritmética entre 2 valores introducidos y
#el signo correspondiente por teclado: si es el signo es + debe realizar una suma, si es el signo – debe
#realizar la resta, si es el signo / debe realizar la división, si es el signo * debe realizar la multiplicación,
#si es el signo ^ debe calcular la potencia; por otro lado, si introduce R debe permitir calcular la raíz
#cuadrada de un número, si introduce % debe permitir calcular el módulo de 2.
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