#include <iostream>

using namespace std;

int main(){
    // FOR Loop --> cu numar finit de pasi
    
    int numarRepetari = 5;
    
    for(int i = 0;  i < numarRepetari; i++){
        cout << "Iteratia " << i + 1 << endl;
    }
    
    // array
    
    double viteze[4] = {0.1, 0.3, -0.7, -0.35};
    
    for(int i = 0; i < 4; i++){
        // setam puterea motorului
        cout << "Setam puterea motorului " << i + 1 << " la " << viteze[i]<< endl;
    }
    return 0;
}