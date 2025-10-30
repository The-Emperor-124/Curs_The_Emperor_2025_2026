#include <iostream>

using namespace std;

int main(){
    int a = 13;
    int b = 31;
    
    int suma = a + b;
    int diferenta = b - a;
    int aPatrat = a * a;
    double cat = (double) b / a;
    cout << cat << endl;
    
    a++;   // <=> a = a + 1 sau a += 1;
    a = a + 1;
    a += 1;
    
    // a --; <=> a = a - 1; <=> a -= 1;
    
    cout << a << endl;
    
    bool rezultat;
    
    rezultat = (13 == 14);
    
    cout << rezultat << endl;   // false == 0 si true == 1

    return 0;
}