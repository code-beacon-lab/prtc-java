package thisIsJava.ch15_collectionFramework.example;

import java.util.List;
import java.util.Vector;

public class P730_VectorExample {

	public static void main(String[] args) {
		List<P731_Board> list = new Vector<P731_Board>();
		
		list.add(new P731_Board("제목1", "내용1", "글쓴이1"));
		list.add(new P731_Board("제목2", "내용2", "글쓴이2"));
		list.add(new P731_Board("제목3", "내용3", "글쓴이3"));
		list.add(new P731_Board("제목4", "내용4", "글쓴이4"));
		list.add(new P731_Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).subject +" "+ list.get(i).content +" "+ list.get(i).writer);
		}
		
		
		
		
//		for(int i=0; i<list.size(); i++) {
//			Board board = list.get(i);
//			System.out.println(board.subject + "\t" + board.content  + "\t" + board.writer);
//		}
	}

}
