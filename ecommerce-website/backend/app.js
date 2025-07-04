const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
require('dotenv').config();

const app = express();
app.use(cors());
app.use(bodyParser.json());

const productRoutes = require('./routes/productRoutes');
app.use('/api/products', productRoutes);

module.exports = app;