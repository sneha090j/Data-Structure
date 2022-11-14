#include<iostream>
using namespace std;
class stack
{
	public:
		int *arr;
		int top1;
		int top2;
		int size;
	two  stack(int s);
			this->size=s;
			top1=-1;
			top2=s;
			arr=new int (size);
			
		}
		void push1(int num1){
			if((top2-top1)>1){//we must have one empty space
			top1++;
			arr[top1]=num1;
		}
		else
		cout<<"stack overflow"<<endl;
	}
		void push2(int num2){
			if((top2-top1)>1)
			{
				top2--;
				arr[top2]=num2;
			}
			else
			cout<<"stack overflow"<<endl;
		}
			int pop1(){
				if(top1>=0)
				{
					int ans=arr[top1];
					top1--;
					return ans;
				}
				else
				{
					return -1;
				}
			}
		int pop2(){
		if(pop2()==size)
		{
			int ans=arr[top2];
			top2++;
			return ans;
		}
	else
	{
		return -1;
	}
}
		};
		int main()
		{
		two	stack (5);
			stack.push1(22);
			stack.push1(44);
			stack.push1(23);
			stack.push1(55);	
			stack.push1(54);
			cout<<stack.top1()<<endl;
			return 0;
			}
		
