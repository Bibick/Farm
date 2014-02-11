/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.define('AM.store.Users', {
    extend: 'Ext.data.Store',
    fields: ['name', 'email'],
    model: 'AM.model.User',

    data: [
        {name: 'Ed',    email: 'ed@sencha.com'},
        {name: 'Tommy', email: 'tommy@sencha.com'}
    ]
});