import React from "react";

function Header(props) {

    return (
        <header>
            <h1 className="title">{props.header}</h1>
            <p>{props.comment}</p>
        </header>
    )

}

export default Header