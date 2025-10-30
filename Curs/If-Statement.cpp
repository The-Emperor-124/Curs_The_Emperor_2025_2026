#include <iostream>

using namespace std;

int main(){
    // IF statement
    // distanta de la un senzor
    double distanta = 21;
    
    if(distanta < 5){
        cout << "Robotul se misca la dreapta" << endl;
    }
    else if(distanta < 20){
        cout << "Lanseaza elementul de joc"<< endl;
    }
    else{
        cout << "Opreste" << endl;
    }

    return 0;
}