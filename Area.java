//Q3.Write a program too find area and perimeter of square , rhombus , rectangle & trapezium circle(curcumfrance) and triangle(based on base and heght & three side).


class Area {
	public static void main(String args[])
		{
			double Area ,perimeter;			

			int side=5;
			System.out.print("\n==========SQUARE==========\n");
			Area = (side*side);
			perimeter = (side * 4);
			System.out.print("\nFormula");
			System.out.print("\nArea = (side*side) \nperimeter = (side * 4)");
			System.out.print("\nThe Area of Square having Side = "+side+" is "+Area+" squnit.\n");
			System.out.print("\nThe Perimeter of Square having Side = "+side+" is "+perimeter+" unit.\n");

			
			int l=5,b1=5;
			System.out.print("\n==========RECTANGLE==========\n");
			Area = (l*b1);
			perimeter=(2*(l+b1));
			System.out.print("\nFormula");
			System.out.print("\nArea = (l*b1) \nperimeter=(2*(l+b1))\n");
			System.out.print("\nThe Area of the Rectangle having length = "+l+" & breadth ="+b1+" is "+Area+" squnit.\n");
			System.out.print("\nThe perimeter of the Rectangle having length = "+l+" & breadth "+b1+" is "+perimeter+" unit.\n");

			
			int d1=10,d2=20,Side=5;
			System.out.print("\n==========Rhombus==========\n");
			Area=1/2*d1*d2;
			perimeter=4*Side;
			System.out.print("\nFormula");
			System.out.print("\nArea=1/2*d1*d2 \nperimeter=4*Side");
			System.out.print("\nThe Area of the Rhombus having Diagonals D1="+d1+" & D2="+d2+" is "+Area+" squnit.\n");
			System.out.print("\nThe Perimeter of the Rhombus having Side = "+Side+" is "+perimeter+" unit.\n");

			
			int a=5,b=5,c=3,d=7;
			double h; 
			//A and B is parellel side & c and D is Non-parellel & h is height.
			System.out.print("\n==========TRAPEZIUM==========\n");
			h=Math.sqrt((c*c)-Math.pow((b-a)/2,2));
			Area=(0.5) * (a+b) * h;
			perimeter=(a+b+c+d);
			System.out.print("\nFormula");
			System.out.print("\nh=Math.sqrt((c*c)-Math.pow((b-a)/2,2)) \nArea=(0.5) * (a+b) * h \nperimeter=(a+b+c+d)");
			System.out.print("\nThe Area of the Trapezium having parellel side a="+a+" & b="+b+" and height ="+h+" is "+Area+" squnit.\n");
			System.out.print("\nThe perimeter of the Trapezium having parellel side a="+a+" & b="+b+" and Non-parellel side c="+c+" & d="+d+" is "+perimeter+" unit.\n");

			int r=5;
			System.out.print("\n==========CIRCLE==========\n");
			Area = 3.14 * r;
			perimeter = 2*3.14*r;
			System.out.print("\nArea = 3.14 * r\nperimeter = 2*3.14*r");
			System.out.print("\nThe Area of the Circle having radius = "+r+" is "+Area+" squnit\n");
			System.out.print("\nThe Perimeter of the Circle having Radius="+r+" is "+perimeter+" unit\n");



			int base=5,h1=9 ,s1=5,s2=8;
			System.out.print("\n==========TRIANGLE-1==========\n");
			Area = (0.5)*base*h1;
			perimeter = base+s1+s2; 
			System.out.print("formula\nArea = (1/2)*base*h1 \nperimeter = base+s1+s2");
			System.out.print("\nThe Area of the Triangle having Height="+h1+" & base="+base+" is "+Area+" squnit\n");
			System.out.print("\nThe Perimeter of the Triangle is having side1="+s1+" ,side2="+s2+" & Base="+base+" is "+perimeter+" unit\n");


			int p1=6,p2=7,p3=6;
			System.out.print("\n==========TRIANGLE-2==========\n");
			int s=(p1+p2+p3)/2;
			Area = Math.sqrt(s*(s-p1)*(s-p2)*(s-p3));
			perimeter=p1+p2+p3;
			System.out.print("\nFormula\ns=(p1+p2+p3)/2 \nArea = Math.sqrt(s*(s-p1)*(s-p2)*(s-p3)) \nperimeter=a+b+c\n");
			System.out.print("\nArea of the triangle having Side a="+p1+" ,b="+p2+" ,c="+p3+" is "+Area+" squnit.\n");
			System.out.print("\nSemiperimeter of the Triangle is "+s+" and the Perimeter is "+perimeter+" unit.\n");

		}
}
			

	