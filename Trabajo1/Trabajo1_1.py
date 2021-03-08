'''
Un menú con 3 opciones
    1) Método de Bisección
    2) Método de Falsa Posición
    3) Método de Newton Raphson
'''

decision = 0;


def biseccion():
    print("Entra a la resolucion de biseccion")


def falsa_posicion():
    print("Entra a la resolucion con falsa posicion")


def newton_raphson():
    print("Entra a la resolucion con newton raphson")


print("\nBienvenido usuario a este programa")
print("A continuación se muestra un menu, por favor elige el numero del metodo que deseas utilizar")

print("\t1) Método de Bisección")
print("\t2) Método de Falsa Posición")
print("\t3) Método de Newton Raphson")

while True:
    try:
        decision = int(input("\nIngresa aqui tu seleccion "))
        if (decision < 4 and decision > 0):
            break
        else:
            print("Seleccion no valida dentro del rango")
    except ValueError as VE:
        print(VE)
        print("Seleccion no entera")

print("\nHas seleccionado la opcion {}".format(decision))

if (decision == 1):
    biseccion()
elif (decision == 2):
    falsa_posicion();
else:
    newton_raphson();
