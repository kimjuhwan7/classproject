import React, {useState} from "react";
import Header from "./Header";
import Nav from "./Nav";
import Article from "./Article";
import Aside from "./Aside";
import Footer from "./Footer";

function MainPage(props) {
    // nav클릭번호
    const [selectedMenu, setSelectedMenu] = useState();
    const menus = [{
        mno: 1,
        title: "html5",
        img: '/img/다운로드 (1).jpg',
        date: '2022.11-01.',
        contents: "이날 서울 외환시장에서 원·달러 환율은 전 거래일(1267.0원) 보다 2.5원 내린 1264.5원에 거래를 마쳤다. 이날 환율은 전거래일 보다 3.0원 오른 1270.0원에 개장했다. 오후 들어 상승폭을 모두 되돌리며 1262.1원까지 저점을 낮췄다. 환율은 4거래일 연속 하락했다. 지난 6월 9일(1256.9원) 이후 6개월 만에 가장 낮은 수준이다.\n"
    }, {
        mno: 2,
        title: "CSS",
        img: '/img/다운로드.jpg',
        date: '2022.11-01.',
        contents: '이번 협약에 대해 한 대형마트 업계 관계자는 "그동안 이커머스는 빼놓고 오프라인만 일방적으로 규제한 일종의 \'기울어진 운동장\'이 이제야 바로 잡히게 됐다는 점에서 의미가 있다"며 "대형마트에서 온라인으로 장을 보는 고객은 식품 비중이 상당히 큰데, 대형마트 점포 배송은 기본적으로 상품 입고에서 출고, 배송까지 전과정이 콜드체인 시스템으로 운영되기 때문에 소비자들은 엄격히 선도관리가 된 상품들을 배송 받을 수 있다는 점에서 소비자 편익 측면이 크게 강화될 것"이라고 말했다. 홈플러스 관계자는 "규제가 완화되는 방향으로 가는 것은 환영할 일"이라고 말했다.'
    }, {
        mno: 3,
        title: "JavaScript",
        img: '/img/다운로드 (6).jpg',
        date: '2022.11-01.',
        contents: '[성남=뉴시스]신정훈 기자 = 92만 성남시민들에게 성남시종합버스터미널은 교통이동 만을 위한 단순한 장소가 아니다. 터미널은 만남과 헤어짐, 그리고 기쁨과 슬픔의 기억들이 모이고 모인 공존의 터전이다.'
    },];

    const changeMenu = (mno) => {
        // 상품 번호로 배열에서 상품 검색 => 해당 상품의 객체를 반환
        const menu = menus.find((menu) => menu.mno === mno);
        // 속성으로 관리하는 선택 메뉴의 값을 변경
        setSelectedMenu(menu);
    };


    return (<body>

    <Header header={'Ju\'s  blog'} comment={'웹을 공부하는 블로그'}/>
    <Nav arr={menus} changeMenu={changeMenu}/>
    <div id="wrap">
        <section>
            <Article menu={selectedMenu}/>
        </section>
        <Aside arr={menus} changeMenu={changeMenu}/>
    </div>
    <Footer/>
    </body>)
}

export default MainPage
