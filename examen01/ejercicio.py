def ejercicioYG01():
    examen: float
    entrevista: float
    test: float
    r1: float
    r2: float
    r3: float
    t: float
    n: int
    m: str
    examen=float(input("¿cuanto saco en el examen de conocimiento? 0-20 : "))
    entrevista=float(input("¿cuanto saco en la entrevista personal? 0-20 : "))
    test=float(input("¿cuanto saco en el test psicologico? 0-20 : "))
    r1=examen*0.40
    r2=entrevista*0.35
    r3=test*0.25
    t1=r1+r2+r3
    if t1>=17:
        n=4
        m=(f"obtuvo la vacante")
    elif t1<17 and t1>=14:
        n=3
        m=(f"obtuvo la vacante")
    elif t1<14 and t1>=11:
        n=2
        m=(f"obtuvo la vacante")
    elif t1<11:
        n=1
        m=(f"no obtuvo la vacante")
    print(f"Su nivel de ingreso es {n}, {m} felicitaciones")

def ejercicioYG02():
    igv: float
    monto: float
    descuento: float
    montototal: float
    monto=float(input("¿cuanto es el precio de su artefacto? "))
    if monto>2000:
        igv=monto*0.18
        descuento=10
        montototal=monto-(monto*0.10)+igv
    elif monto>1000:
        igv=monto*0.18
        descuento=5
        montototal=monto+igv-(monto*0.5)
    elif monto>500:
        igv=monto*0.18
        descuento=2
        montototal=monto+igv-(monto*0.2)
    elif monto<=500:
        igv=monto*0.18
        descuento=0
        montototal=monto+igv
    print(f"El IGV es {igv} soles")
    print(f"El descuento es {descuento}%")
    print(f"El monto total a pagar es de {montototal} soles")

def ejercicioYG03():
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

def ejercicioYG04():
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

nuemero: float
pregunta: float
pregunta=float(input("¿que ejercicio desea combrobar? 1,2,3,4 "))
if pregunta<=1:
    ejercicioYG01()
elif pregunta<=2:
    ejercicioYG02()
elif pregunta<=3:
    ejercicioYG03()
elif pregunta<=4:
    ejercicioYG04()

