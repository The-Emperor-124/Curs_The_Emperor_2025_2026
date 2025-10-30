#include <iostream>

using namespace std;

int main(){
    string nume1 =  "Emperor";          // char [100] nume1
    string nume2 = "Emperor";
    
    if(nume1 == nume2){
        cout << "egale" << endl;
    }
    else{
        cout << "Nu sunt egale" << endl; 
    }

    return 0;
}