/**
 * Created by istrakhouski on 2/14/14.
 */
Ext.define('Farm.controller.Items', {
    extend: 'Ext.app.Controller',

    views: [
        'items.List',
        'items.Add'
    ],

    refs: [
        {
            ref: 'addItemsWindow',
            selector: 'additemswindow',
            autoCreate: true,
            xtype: 'additemswindow'
        }, {
            ref: 'addItemsWindowForm',
            selector: 'additemswindow > form'
        }

    ],

    stores: [
        'Items'
    ],
    models: ['Item'],

    init: function() {
        this.control({
            'container > itemslist': {
                itemdblclick: this.editItem
            },
            'itemslist button[action=insertItem]': {
                click: this.addItemForm
            },
            'additemswindow button[action=add]' : {
                click: this.insertItem
            }
        });

    },

    addItemForm: function() {
        this.getAddItemsWindow().show();
    },

    insertItem: function() {
        var store = this.getStore('Items'),
            values = this.getAddItemsWindowForm().getValues();

        if(!values.itemId) {
            store.add(values);
        } else {
            //TODO: do somethings with manual field set
            var record = store.getById(values.itemId);
            record.set('name', values.name);
            record.set('description', values.description);
            record.set('price', values.description);
        }

        store.sync();
    },

    editItem: function(grid, record) {
        var view = Ext.widget('additemswindow');

        view.down('form').loadRecord(record);
        view.show();
    },

    updateUser: function(button) {
       console.log("Test form controller");
    }
});
