document.addEventListener('DOMContentLoaded', () => {
    const user_id = document.querySelector('#userID')
    const user_pw = document.querySelector('#pw')
    const user_ckpw = document.querySelector('#ckpw')
    const user_name = document.querySelector('#userName')
    const addBtn = document.querySelector('#addBtn')
    const todolist = document.querySelector('#list')

    let cnt = 0;

    const addTodo = () => {

        if (!(/[a-zA-Z0-9]/.test(user_id.value))) {
            alert('아이디는 대문자 소문자 숫자만을 조합하는 문자열 입력만 가능합니다.')
            return
        }
        console.log(user_id.value);
        if (user_id.value.trim() === '') {
            alert('아이디를 입력해 주세요')
            return
        }
        if (user_pw.value.trim() === '') {
            alert('비밀번호를 입력해 주세요')
            return

        } if (user_ckpw.value.trim() === '') {
            alert('비밀번호확인 입력해 주세요')
            return
        }
        if (user_ckpw.value !== user_pw.value) {
            alert('비밀번호와 같게 적어주세요.')
            return
        }
        console.log(user_name.value);
        if (user_name.value.trim() === '') {
            alert('이름을 입력해 주세요')
            return
        }

        const newTr = document.createElement('tr')
        const newTh_idx = document.createElement('th')
        const newTh_id = document.createElement('th')
        const newTh_pw = document.createElement('th')
        const newTh_name = document.createElement('th')
        const btn = document.createElement('button')

        todolist.appendChild(newTr)

        newTr.appendChild(newTh_idx)
        newTr.appendChild(newTh_id)
        newTr.appendChild(newTh_pw)
        newTr.appendChild(newTh_name)
        newTr.appendChild(btn)

        const key = cnt++;
        newTr.setAttribute('user_idx', key)
      

        newTh_idx.textContent = key
        newTh_id.textContent = user_id.value
        newTh_pw.textContent = user_pw.value
        newTh_name.textContent = user_name.value
        btn.textContent = '정보 삭제'

        btn.addEventListener('click', (event) => {
            removeTodo(key)
        })


        user_id.value = ''
        user_pw.value = ''
        user_ckpw.value = ''
        user_name.value = ''
    }
    const removeTodo = (key) => {
        const delElement = document.querySelector(`tr[user_idx="${key}"]`)
        todolist.removeChild(delElement)
    }
    addBtn.addEventListener('click', addTodo)
  
})