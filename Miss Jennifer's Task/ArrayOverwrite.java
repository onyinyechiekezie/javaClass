import java.util.Arrays;
public class ArrayOverwrite {
	public static void main(String[] args)  {

	int[] pixel = {19, 34, 55, 70, 99, 114, 135, 150, 175, 185};
	for(int index = 0; index < pixel.length; index++) {
		if(pixel[index] >= 0 && pixel[index] <= 20) 
			pixel[index] = 10;
		else if(pixel[index] >= 21 && pixel[index] <= 40) 
			pixel[index] = 30;
		else if(pixel[index] >= 41 && pixel[index] <= 60) 
			pixel[index] = 50;
		else if(pixel[index] >= 61 && pixel[index] <= 80) 
			pixel[index] = 70;
		else if(pixel[index] >= 81 && pixel[index] <= 100) 
			pixel[index] = 90;
		else if(pixel[index] >= 101 && pixel[index] <= 20) 
			pixel[index] = 110;
		else if(pixel[index] >= 121 && pixel[index] <= 140) 
			pixel[index] = 130;
		else if(pixel[index] >= 141 && pixel[index] <= 160) 
			pixel[index] = 150;
		else if(pixel[index] >= 161 && pixel[index] <= 180) 
			pixel[index] = 170;
		else if(pixel[index] > 171) 
			pixel[index] = 190;
	}
	System.out.println("New quantized values are:");
	System.out.print(Arrays.toString(pixel));
	

}
}
