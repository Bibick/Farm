/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.application({
    requires: ['Ext.container.Container'],
    name: 'Farm',

    appFolder: 'resources/js/app',

    controllers: [
        'Cheques',
        'Items'
    ],

    launch: function() {
        Ext.create('Ext.container.Container', {
            renderTo: 'mainContent',
            layout: 'hbox',
            items: [
                {
                    xtype: 'panel',
                    flex: 1,
                    items: [
                        {
                            xtype: 'button',
                            text: 'Just button'
                        }
                    ]
                },
                {
                    xtype: 'tabpanel',
                    flex: 4,
                    items: [
                        {   title: 'Cheques',
                            items: {
                                xtype: 'chequelist'
                            }
                        }, {
                            title: 'Items',
                            items: {
                                xtype: 'itemslist'
                            }
                        }
                    ]
                }
            ]
        });
    }
});