export default {
  oidc: {
    clientId: this is found in your okta account
    issuer: this will need to be provided by your okta account,
    redirectUri: 'https://localhost:4200/login/callback',
    scopes: ['openid', 'profile', 'email'],
  },
};
