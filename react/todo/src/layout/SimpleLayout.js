import React from 'react';

function SampleLayout(props) {
    return (
        <>
            <h1>Header</h1>

            {props.children}

            <h3>footer</h3>
        </>
    );
}

export default SampleLayout;