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
                            title: 'Other tab'
                        }
                    ]
                }
            ]
        });
    }
});