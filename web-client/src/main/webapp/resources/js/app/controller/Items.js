/**
 * Created by istrakhouski on 2/14/14.
 */
Ext.define('Farm.controller.Items', {
    extend: 'Ext.app.Controller',

    views: [
        'items.List'/*,
        'items.Edit'*/
    ],

    stores: [
        'Items'
    ],
    models: ['Item'],

    init: function() {
        this.control({
            'viewport > itemlist': {
                itemdblclick: this.editUser
            }/*,
            'chequeedit button[action=save]': {
                click: this.updateUser
            }*/
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
