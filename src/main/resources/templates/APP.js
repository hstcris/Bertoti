function addCupcake() {
    const id = document.getElementById('add-id').value;
    const nome = document.getElementById('add-nome').value;
    fetch('http://localhost:8080/cupcakes', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ id, nome })
    })
        .then(response => response.json())  // Alterado para tratar a resposta como JSON
        .then(cupcakes => {
            const cupcakeList = document.getElementById('cupcake-list');
            cupcakeList.innerHTML = renderCupcakes(cupcakes);  // Função que renderiza a lista
            alert('Cupcake adicionado com sucesso!');
        })
        .catch(error => console.error('Erro ao adicionar cupcake:', error));
}

function updateCupcake() {
    const id = document.getElementById('update-id').value;
    const nome = document.getElementById('update-nome').value;
    fetch(`http://localhost:8080/cupcakes/${id}`, {  // Corrigido para usar o id na URL
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ nome })
    })
        .then(response => response.json())  // Agora a resposta é tratada como JSON
        .then(cupcakes => {
            const cupcakeList = document.getElementById('cupcake-list');
            cupcakeList.innerHTML = renderCupcakes(cupcakes);  // Renderiza a lista
            alert('Cupcake atualizado com sucesso!');
        })
        .catch(error => console.error('Erro ao atualizar cupcake:', error));
}

function deleteCupcake() {
    const id = document.getElementById('delete-id').value;
    fetch(`http://localhost:8080/cupcakes/${id}`, {  // Corrigido para usar o id na URL
        method: 'DELETE'
    })
        .then(response => response.json())  // Agora a resposta é tratada como JSON
        .then(cupcakes => {
            const cupcakeList = document.getElementById('cupcake-list');
            cupcakeList.innerHTML = renderCupcakes(cupcakes);  // Renderiza a lista
            alert('Cupcake removido com sucesso!');
        })
        .catch(error => console.error('Erro ao remover cupcake:', error));
}

function renderCupcakes(cupcakes) {
    return cupcakes.map(cupcake => `
        <div>
            <strong>${cupcake.nome}</strong>
        </div>
    `).join('');
}

