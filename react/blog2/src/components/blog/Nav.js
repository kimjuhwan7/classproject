import React from "react";

function Nav({arr, changeMenu}) {
    return (
        <nav>
            <ul>
                {arr.map((menu) => (
                    <li key={menu.mno} onClick={() => changeMenu(menu.mno)}>
                        {menu.title}
                    </li>
                ))}
            </ul>
            <div>
                <input type="text" name="검색"/>
                <input type="button" value="검색"/>
            </div>
        </nav>
    )
}

export default Nav