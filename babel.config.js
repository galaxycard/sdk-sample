module.exports = {
  presets: ['module:metro-react-native-babel-preset'],
  plugins: [
    [
      'react-native-reanimated/plugin',
      {
        globals: ['__scanQRCodes'],
      },
    ],
  ],
  env: {
    production: {
      plugins: [
        '@babel/plugin-proposal-export-namespace-from',
        'transform-remove-console',
      ],
    },
  },
};
