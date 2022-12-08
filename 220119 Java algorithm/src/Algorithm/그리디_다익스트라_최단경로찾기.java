//인접리스트 그래프가 어떻게 출력되는지만 그려봐!
//https://sskl660.tistory.com/59 참고
//방문하면서 가중치 비교해서 더 작은값으로 갱신하는 코드 작성해보자

//큐 사용안한 버젼

package Algorithm;
import java.util.ArrayList;
import java.util.Scanner;

//V개수 5개, 간선E개수 6개, 
//출발노드번호start=1, (가중초기화를위한)출발노드a, 
//(가중초기화를위한)도착노드b, (가중초기화를위한)가중치cost)

//5 6
//1
//1 2 8
//1 3 3
//2 4 4
//2 5 15
//3 4 13
//4 5 2

class Node{  //v個の頂点数のノードを生成するためのNodeクラス		v개의 정점개수의 노드를 생성하기 위한 Node클래스
	int idx; //Node의 번호: 1번노드, 2번노드~5번노드
	int cost; //도착노드까지의 가중치: 거리, 시간 등
	
	Node(int i, int c){ //새로운 노드가 생성될때마다 Node의 idx, cost 갱신
		this.idx = i;
		this.cost = c;
	}
}

public class 그리디_다익스트라_최단경로찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt(); 			 //정점개수:5
		int E = sc.nextInt(); 			 //간선개수:6
		
		int start = sc.nextInt(); 		 //출발노드 start번호입력(=1): 1번노드
		
		int dist[] = new int[V+1];		 //V+1(=6) 
		int visited[] = new int[V+1];	 //V+1(=6) 
		
		ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();  //인접리스트 작성을 위한 ArrayList클래스로 graph객체 생성
		
		//인접리스트로 그래프 생성
		for(int i=0; i<V+1; i++) {
			graph.add(new ArrayList<>());
		}
		
		//그래프에 출발노드idx, 도착노드idx, 가중치 초기값 추가
		for(int i=0; i<E; i++) {
			int depart = sc.nextInt();
			int arrive = sc.nextInt();
			int cost = sc.nextInt();
			
			((ArrayList<Node>) graph.get(depart)).add(new Node(arrive, cost));
		}
		
		for(int i=0; i<E; i++) {
			System.out.println(graph.get(i)+" ");
		}

	}

}
