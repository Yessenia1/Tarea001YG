#2.-Tiendas Plaza Norte desea un programa que permita calcular el IVG de la venta de sus artefactos
#además desea hacer un descuento de 10% cuando el monto base de venta supera los 2000 soles,
#mientras que si el monto supera los 1000 desea hacer un descuento del 5% Y si supera los 500 soles
#realiza un descuento del 2%, El algoritmo debe permitir calcular el IGV, el descuento y el monto total
#a pagar.
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