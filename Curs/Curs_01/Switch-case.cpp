#include <iostream>

using namespace std;

int main(){
    // switch - case
    
    int caz = 3;
    
    switch(caz){
        case 1:
            cout << "caz a" << endl;
            break;
        case 2:
            cout << "caz b" << endl;
            break;
        case 3:
            cout << "caz c" << endl;
            break;
        case 4:
            cout << "Caz d" << endl;
            break;
        default:
            cout << "caz a def"<<endl;
            break;
    }

    return 0;
}