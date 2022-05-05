class ll
{
	static class singlyLinkedNode
	{
		int data;
		singlyLinkedNode next;
		singlyLinkedNode(int nodeData)
		{
			this.data=nodeData;
			this.next=null;

		}
	}
	static class singlyLinked {
		public singlylinkedNode head;
		public singlylinkedNode tail;

			public singlyLinked()
			{
				this.head=null;
				this.tail=null;

			}
			public void insertNode(int nodeData)
			{
				singlyLinkedNlode node= new singlyLinkedNlode(nodeData);
				if (this.head== null)
				{
					this.head=node;
				}
				else 
				{
					this.tail.next=node;

				}
				this.tail=node;

			}
		}
		static printsinglyLinked(singlyLinkedNode node ,String sep,BufferedWriter bufferedwriter)throwsIOException
		{
			while (node != null)
			{
				bufferedWriter.write(String.valueOf(node.data));
				node=node.next;

				if (node !=null){
					bufferedWriter.write(sep);
				}
			}
		}

		static singlyLinkedNode reverse(singlyLinkedNode head )
		{
			singlyLinkedNode t=head;
			Stack<Integer> x=new Stack<>();
			while(t !=null)
			{
				x.push(t.data);
				t=t.next;
			}
			t=head;
			while(t !=null)
			{
				t.data=x.pop();
				t=t.next;

			}
			return head;

		}
		Scanner sc=new Scanner(System.in);
		public static void main(String args [])
		{
			Bufferedwriter bufferedWriter= new Bufferedwriter(new FileWriter(system.getenv("OUTPUT_PATH")));
			int tests=sc.nextInt();
			for (int testsItr=0;testsItr<tests;testsItr++)
			{
				singlyLinked list=new singlyLinked();
				int listcount=sc.nextInt();

			}
			singlyLinkedNode list1=reverse(list.head);
			printsinglyLinked(list1." ".bufferedWriter);
			bufferedWriter.newLine();

		}
		bufferedWriter.close();
		scnner.close();
	
}






































			