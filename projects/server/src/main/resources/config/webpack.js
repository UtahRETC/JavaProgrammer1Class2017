var path = require("path");

module.exports = {
  mode: process.env.NODE_ENV,
  entry: path.join(__dirname, "..", "src", "app.jsx"),
  module: {
    rules: [
      {
        test: /\.(js|jsx)$/,
        exclude: /node_modules/,
        loader: "babel-loader"
      }
    ]
  },
  devServer: {
    historyApiFallback: true,
    proxy: {
      "/api": "http://localhost:3000"
    }
  },
  output: {
    path: path.join(__dirname, "..", "dist"),
    filename: "bundle.js"
  }
};
