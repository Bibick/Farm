/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.define('Farm.controller.Cheques', {
    extend: 'Ext.app.Controller',

    views: [
        'cheque.List',
        'cheque.Edit',
        'cheque.AddItems'
    ],

    stores: [
        'Cheques'
    ],

    models: ['Cheque'],

    refs: [
        {
            ref: 'addItemsWindow',
            selector: 'additemstochequewindow',
            autoCreate: true,
            xtype: 'additemstochequewindow'
        }, {
            ref: 'selectedItem',
            selector: 'additemstochequewindow > combo'
        }, {
            ref: 'selectedCheque',
            selector: 'chequelist'
        }, {
            ref: 'addItemsWindowForm',
            selector: 'additemstochequewindow > form'
        }, {
            ref: 'cheque'
        }

    ],


    init: function() {
        this.control({
            'viewport > chequelist': {
                itemdblclick: this.editUser
            },
            'chequelist button[action=add]': {
                click: this.addCheque
            },
            'chequelist button[action=addItems]': {
                click: this.addItems
            },
            'additemstochequewindow button[action=add]': {
                click: this.addItemToCheque
            }
        });
    },

    addCheque: function() {
        var store = this.getStore('Cheques');
        store.add({summ: 0});
        store.sync();
    },

    addItems: function() {
        this.getAddItemsWindow().show();
        var store = this.getStore('Cheques'),
            record = store.getById(this.getSelectedCheque().getSelectionModel().getSelection()[0].get('chequeId'));
        this.getAddItemsWindowForm().loadRecord(record)
    },

    addItemToCheque: function() {
        var combobox = this.getSelectedItem();
    },

    editUser: function(grid, record) {
        var view = Ext.widget('chequeedit');

        view.down('form').loadRecord(record);
    },

    updateUser: function(button) {
        var win    = button.up('window'),
            form   = win.down('form'),
            record = form.getRecord(),
            values = form.getValues();

        record.set(values);
        win.close();
    }
});