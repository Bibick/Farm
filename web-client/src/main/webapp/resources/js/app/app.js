/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.application({
    requires: ['Ext.container.Viewport'],
    name: 'AM',

    appFolder: 'resources/js/app',

    controllers: [
        'Users'
    ],

    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                xtype: 'userlist'
            }
        });
    }
});