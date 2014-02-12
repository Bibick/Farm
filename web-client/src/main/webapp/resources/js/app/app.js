/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.application({
    requires: ['Ext.container.Viewport'],
    name: 'Farm',

    appFolder: 'resources/js/app',

    controllers: [
        'Cheques'
    ],

    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                xtype: 'chequelist'
            }
        });
    }
});