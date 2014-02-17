/**
 * Created by istrakhouski on 2/17/14.
 */
Ext.define('Farm.view.cheque.AddItems', {
    extend: 'Ext.window.Window',

    alias: 'widget.additemstochequewindow',

    requires: ['Ext.form.Panel', 'Ext.form.field.ComboBox', 'Farm.store.Items'],

    width: 500,
    title: 'Add Items to Cheque',
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
                        xtype: 'combo',
                        fieldLabel: 'Name',
                        name: 'item',
                        store: 'Items',
                        displayField: 'name',
                        valueField: 'itemId'
                    }, {
                        xtype: 'hidden',
                        name: 'chequeId'
                    }
                ]
            }]
        });

        this.callParent(arguments);
    }
});
