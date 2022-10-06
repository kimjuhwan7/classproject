package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	public static void main(String[] args) {

//		BufferedWriter out = null;

		try (BufferedWriter out = new BufferedWriter(new FileWriter("c:\\test\\text2.txt"))) {
//			out = new BufferedWriter(new FileWriter("c:\\test\\text2.txt"));
			out.write(
					"홍차(紅茶)는 차잎 내부의 성분이 자체에 들어있는 효소에 산화되어[3] 붉은 빛을 띠는 차를 뜻한다. 녹차나 보이차와 같이 효소의 작용을 중지시키는 쇄청(曬靑, 햇볕에 쬐어 말림) 과정을 거치지 않기 때문에 잎 자체의 효소로 산화가 된 것이다.\r\n");
			out.newLine();
			out.write(
					"한자문화권에서는 우러난 차의 빛깔(붉은색)을 보고 홍차라고 하지만, 영어에서는 찻잎의 색깔(검은색)을 보고 'Black Tea'라고 부른다. 녹차는 한자문화권과 영어권 공통으로 綠茶-Green Tea라고 부른다. 즉, 한자문화권(특히 중국)에서 '흑차'라고 하면 보이차 종류의 후발효차를 지칭하는 명칭이다. 반대로 영어에서 Red tea는 허브의 일종인 루이보스를 우려낸 대용차를 말한다.\r\n");
			out.newLine();
			out.write(
					"흔히 영국이 홍차의 대명사로 알려져 있는데, 영국이 홍차 문화의 꽃을 피운 건 맞지만 사실 차나무는 중국이 원산지이며, 현재는 인도에서 가장 많이 생산 및 소비된다. 인도는 세계 홍차 생산의 약 44%, 소비의 72%를 점유하는 홍차의 최대 생산 겸 소비국이다.[4]\r\n");
			out.newLine();
			out.newLine();
			out.write("나무위키 참조");
			System.out.println("작성 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}
}
