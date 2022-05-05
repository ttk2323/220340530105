class stack1
{
	int size;
	int t1,t2;
	int a1[];

	stack1(int n)
	{
		a1=new int[n];
		t1=-1;
		t2=size;
	}
	void push1(int x)
	{
		if (t1<t2-1)

			{
				t1++;
				a1[t1]=x;
			}
			else{
				System.exit(1);
			}
	}
	void push2(int x)
	{
		if (t1<t2-1)

			{
				t2--;
				a1[t2]=x;
			}
			else{
				System.exit(1);
			}
	}
	int pop1()
	{
		if (t1>=0)
		{
			int x=a1[t1];
			t1--;
			return x;

		}
		else 
		{
			System.exit(1);

		}
		return 0;
	}
	int pop2()
	{
		if (t1<size)
		{
			int x=a1[t2];
			t2++;
			return x;

		}
		else 
		{
			System.exit(1);

		}
		return 0;
	}
	public static void main(String args [])
	{
		stack1 s1=new stack1(6);
	
	s1.push1(5);
	s1.push2(10);
	s1.push2(15);
	s1.push1(11);
	s1.push2(7);
	System.out.println("Popped element from stack1 is "+s1.pop1());
	s1.push2(40);
	System.out.println("Popped element from stack2 is "+s1.pop2());
}
}

















