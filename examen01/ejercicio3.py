import math
a: float
b: float
c: float
pregunta: float
a=float(input("introduzca un numero: "))
b=float(input("introduzca otro número: "))
pregunta=float(input("Introduzca la operación matematica (+)=1,(-)=2,(*)=3,(/)=4" +
"(^ potencia)=5,(R raiz cuadrada)=6,(% modulo de dos)=7 favor de poner como respuesta solo el numero porque todavia nose como se igual sin numeros ;("))
if pregunta<=1:
    c=a+b
elif pregunta<=2:
    c=a-b
elif pregunta<=3:
    c=a*b
elif pregunta<=4:
    c=a/b
elif pregunta<=5:
    c=a*a
elif pregunta<=6:
    c=math.sqrt(a)
elif pregunta<=7:
    c=a%b
print(f"el resultado de la operación es {c}")