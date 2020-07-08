// PROGRAMA EJEMPLO PROCEDIMIENTOS Y FUNCIONES

#include <iostream>                         // PROCEDIMIENTOS Y FUNCIONES
#include <math.h>                           //      NO             SI
#include <iomanip>                          //     void         int, bool, double,
#include <stdlib.h>                         //                  char, float, string
#include <string>
#include <locale.h>
#include <windows.h>
using namespace std;

// PROCEDMIENTO

void azar(int minimo, int maximo)
{
    int numerogenerado = (minimo + rand() % maximo);
    cout << "Numero generado: " << numerogenerado << endl;

}

void azarciclo(int minimo, int maximo)
{
    for (int i = 1; i <= 20; i++)
    {
        cout << setw(10) << (minimo + rand() % maximo);
        if (i%5 == 0)
        {
            cout << endl;
        }
        
    }
        
}

int main()
{
    system("cls");
    setlocale(LC_ALL,"Spanish");
    
    string nombre;
    double numero1, numero2, suma = 0;

 
    int minimo, maximo;

    cout << endl;
    cout << "GENERACION DE NUMEROS ALEATORIOS" << endl;
    cout << "********************************" << endl;
    cout << endl;
    cout << "Ingrese un numero minimo a generar: ";
    cin >> minimo;
    cout << "Ingrese un numero maximo a generar: ";
    cin >> maximo;
    cout << endl;

    azarciclo(minimo, maximo);

    cout << endl;
    system("pause");


    return 0;
}