import java.util.Scanner;

public class Link{
	public static void main(String args[]){
		int v,i,j,k,source;
		int[][] c,r;
		boolean[] visited;
                Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of vertices:");
		v = scan.nextInt();

		c = new int[v][v];
		r = new int[v][2];
	  visited = new boolean[v];

		System.out.println("Enter the cost matrix:");
		for(i=0;i<v;i++){
			for(j=0;j<v;j++){
				// if(i==j)
				// 	c[i][j] = 0;
				// else{
				        c[i][j] = scan.nextInt();
				// }
			}
		}

		for(i=0;i<v;i++){
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("=============================");

		for(i=0;i<v;i++){
			for(j=0;j<v;j++){
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}


		System.out.println("Enter source:");
		source = scan.nextInt();


		for(i=0;i<v;i++){
			r[0][i] = c[u][i];
			
		}



	}

}
