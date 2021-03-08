'''
Calcular las raices de la ecuacion cuadratica, incluyendo complejas

(-b +- sqrt(b^2 -4ac)) / (2a)

'''

import math

print("\n\t\tBienvenido\n")

print("Este programa calcula las raices de una ecuacion cuadratica de la forma ax^2 + bx + c = 0")
a = 0;
b = 0;
c = 0;

try:
    a = int(input("\tPor favor ingresa el coeficiente a -> "))
except ValueError:
    print("El coeficiente no es un numero")

try:
    b = int(input("\tPor favor ingresa el coeficiente b -> "))
except ValueError:
    print("El coeficiente no es un numero")

try:
    c = int(input("\tPor favor ingresa el coeficiente c -> "))
except ValueError:
    print("El coeficiente no es un numero")


discriminante = b ** 2 - (4 * a * c)

complejo = False

if (discriminante < 0):
    complejo = True
    discriminante = discriminante * -1

print()

if (not complejo):
    raiz_1 = (-1*b + math.sqrt(discriminante)) / (2*a)
    raiz_2 = (-1*b - math.sqrt(discriminante)) / (2*a)
    print("Las raices son: \n\tx1 = {}\n\tx2 = {}".format(int(raiz_1), int(raiz_2)))
else:
    raiz_real = (-1*b) / (2*a)
    raiz_im = math.sqrt(discriminante) / (2*a)
    print("Las raices son: \n\tx1 = {0} + {1}i\n\tx2 = {0} - {1}i".format(int(raiz_real), int(raiz_im)))
