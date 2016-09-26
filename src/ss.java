  static String isPangram(String[] strings) {
        
    String o="";
        for (int j=0;j<strings.length;j++)
            {
HashMap<Character, Integer> m= new HashMap<Character, Integer>();
		char[] a=strings[j].toCharArray();
		int[] p=new int[26];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
            if(a[i]>='a' && a[i]<='z')
                {
			int val=a[i]-'a';
            
            if(p[val]==0)
                        {
                 count++;
                }
                p[val]=1;
                    
            }    
            
			
            
			
		}
		
		if(count==26)
		{
			o=o+"1";
           // System.out.print("1");
		}
            else
                {
                o=o+"0";
               // System.out.print("0");
            }
		
    }
       System.out.print(o);
        return o;
    }
