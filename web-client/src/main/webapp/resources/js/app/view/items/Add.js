/**
 * Created by istrakhouski on 2/14/14.
 */
Ext.define('Farm.view.items.Add', {
    extend: 'Ext.window.Window',

    alias: 'widget.additemswindow',

    requires: ['Ext.form.Panel', 'Ext.form.field.ComboBox'],

    width: 500,
    title: 'Add Item',
    layout: 'fit',
    modal: true,
    plain: true,

    initComponent: function() {
        Ext.apply(this, {
            buttons: [{
                text: 'Add Item',
                action: 'add'
            }, {
                text: 'Cancel',
                scope: this,
                handler: this.close
            }],

            items: [{
                xtype: 'form',
                bodyPadding: '12 10 10',
                border: false,
                unstyled: true,
                items: [
                    {
                        xtype: 'textfield',
                        fieldLabel: 'Name',
                        name: 'name'
                    }, {
                        xtype: 'textfield',
                        fieldLabel: 'Description',
                        name: 'description'
                    }, {
                        xtype: 'hidden',
                        name: 'itemId'
                    }, {
                        xtype: 'textfield',
                        fieldLabel: 'Price',
                        name: 'price'
                    }

                ]
            }]
        });

        this.callParent(arguments);
    }
});

