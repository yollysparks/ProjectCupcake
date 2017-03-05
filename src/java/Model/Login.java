/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author felesiah
 */
public class Login {
    private User Username;
    private User Password;

    /**
     * @return the Username
     */
    public User getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(User Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public User getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(User Password) {
        this.Password = Password;
    }
}
