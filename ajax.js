function loadData() {
    const xhr = new XMLHttpRequest();
    xhr.open('GET', 'data.json');
    xhr.responseType = 'json';

    xhr.onload = function() {
      if (xhr.status === 200) {
        const data = xhr.response;
        const output = document.getElementById('data');
        output.innerHTML = `<p>Name: ${data.name}</p>
                            <p>Model: ${data.model}</p>
                            <p>Year: ${data.year}</p>
                            <p>Color: ${data.color}</p>`;
      } else {
        console.log('Error:', xhr.status);
      }
    };
    xhr.send();
  }