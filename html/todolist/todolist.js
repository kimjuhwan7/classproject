
document.addEventListener('DOMContentLoaded', () => {
    const input = document.querySelector('#newTodo')
    const addBtn = document.querySelector('#addBtn')
    const todolist = document.querySelector('#todoList')

    let cnt = 0;


    // 핸들러 함수
    const addTodo = () => {
        console.log(input.value);
        if (input.value.trim() === '') {
            alert('할일을 입력해 주세요!')
            return
        }
        // 동적으로 추가할 엘리먼트 생성
        const newDiv = document.createElement('div')
        const checkbox = document.createElement('input')
        const todo = document.createElement('span')        // todolist에 새로운 div 추가
        const btn = document.createElement('button')

        newDiv.appendChild(checkbox)
        newDiv.appendChild(todo)
        newDiv.appendChild(btn)

        //속성 설정
        newDiv.style.padding = '10px';
        newDiv.style.border= '1px solid #444444' ;

        const key = cnt++;

        newDiv.setAttribute('data-key', key)


        checkbox.type = 'checkbox'
        todo.textContent = input.value
        btn.textContent = '할일 삭제'

        // 이벤트 적용
        checkbox.addEventListener('change', (event) => {

            todo.style.textDecoration = event.target.checked ?
                'line-through' : ''
        })
        btn.addEventListener('click', (event) => {
            removeTodo(key)
        })

        //todolist에 새로운 div 추가
        todolist.appendChild(newDiv)

        input.value = ''
    }
    const removeTodo = function (key) {
        const delElement = document.querySelector(`div[data-key="${key}"]`)
        todolist.removeChild(delElement)
    }

    addBtn.addEventListener('click', addTodo)
})
