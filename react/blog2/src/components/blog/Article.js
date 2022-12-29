import React from "react";

function Article({menu}) {

    console.log(menu)
    if (!menu) {
        return <div>선택된 메뉴가 없습니다.</div>;
    }
    return(
       <article>
            <h2> {menu.title}  </h2>
            <p> {menu.date}  </p>
            <img src={menu.img} alt="html5"/>
                <p>{menu.contents}
                </p>
            </article>
    )
}
export default Article