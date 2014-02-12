/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.define('Farm.controller.Cheques', {
    extend: 'Ext.app.Controller',

    views: [
        'cheque.List',
        'cheque.Edit'
    ],

    stores: [
        'Cheques'
    ],
    models: ['Cheque'],

    init: function() {
        this.control({
            'viewport > chequelist': {
                itemdblclick: this.editUser
            },
            'chequeedit button[action=save]': {
                click: this.updateUser
            }
        });
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