import React from "react";

function Aside({arr, changeMenu}) {
    return (
        <aside>
            <h4>카테고리</h4>
            <ul>
                {arr.map((menu) => (
                    <li key={menu.mno} onClick={() => changeMenu(menu.mno)}>
                        {menu.title}
                    </li>
                ))}
            </ul>
            <h4>최근 글</h4>
            <ul>
                {arr.map((menu) => (
                    <li key={menu.mno} onClick={() => changeMenu(menu.mno)}>
                        {menu.title}
                    </li>
                ))}
            </ul>
        </aside>
    )
}

export default Aside