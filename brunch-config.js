module.exports = {
  paths: {
    'public':   'web-app',
    'watched':  ['app']
  },

  files: {
    javascripts: {
      joinTo: {
        'js/app.js':  [/^(?!app)/,/^app/]
      }
    },
    stylesheets: {joinTo: 'app.css'}
  },

  plugins: {
    babel: {presets: ['es2015']}
  }
};