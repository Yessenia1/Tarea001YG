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