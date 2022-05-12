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