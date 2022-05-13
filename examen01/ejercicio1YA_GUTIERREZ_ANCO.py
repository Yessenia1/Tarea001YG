#1.- Diseñe un algoritmo que permita determinar el nivel del perfil de ingreso de un postulante con la que obtiene una vacante a la carrera de ingeniería de Sistemas; considerando que, si su nota es mayor
#o igual a 17 su nivel es 4, si la nota es menor de 17 y mayor o igual a 14 su nivel es 3, si su nota es menor a 14 y mayor o igual a 11 su nivel es 2; mientras que si su nota es menor de 11 ya no puede
#obtener la vacante y por ende también está en el nivel 1.
#Considera que la nota final es vigesimal según el siguiente ponderado:
#Examen de conocimiento 40%
#Entrevista Personal 35%
#Test Psicológico 25%
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