fetch('http://localhost:5000/api/products')
  .then(res => res.json())
  .then(data => {
    const container = document.getElementById('product-container');
    data.forEach(product => {
      const div = document.createElement('div');
      div.innerHTML = `<h3>${product.name}</h3><p>₹${product.price}</p>`;
      container.appendChild(div);
    });
  });