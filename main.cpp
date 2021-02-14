#include <iostream>

using namespace std;

int main()
{
    int A,B,C,D,F;
    float midtermGrade1,midtermGrade2,finalGrade;
    float avarage;
    cout<<"MidtermGrade1:";
    cin>>midtermGrade1;
    cout<<"MidtermGrade2:";
    cin>>midtermGrade2;
    cout<<"finalGrade:";
    cin>>finalGrade;

    avarage=(midtermGrade1+midtermGrade2+finalGrade)/3;
    cout<<"avarage= ";
    cout<<avarage;


       if(avarage>=90) printf("\nletter grade= A");


       if(90>=avarage>=80) printf("\nletter grade= B");



       if(80>=avarage>=70) printf("\nletter grade= C");


       if(70>=avarage>=60) printf("\nletter grade= D");


       if (avarage<60)  printf("\nletter grade= F");

    }

















